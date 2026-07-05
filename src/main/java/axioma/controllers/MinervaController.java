package axioma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import axioma.dto.minerva.AltaEmpleadoDTO;
import axioma.services.minerva.EmpleadoService;

@RestController
@RequestMapping("/minerva")
@CrossOrigin(origins = "http://localhost:5173")
public class MinervaController {

    @Autowired
    EmpleadoService empleadoService;

    @PostMapping("/savePersonal")
    public ResponseEntity<Void> saveEmpleado(
            @RequestBody AltaEmpleadoDTO dto) {

        empleadoService.altaEmpleado(dto);

        return ResponseEntity.ok().build();
    }
}
