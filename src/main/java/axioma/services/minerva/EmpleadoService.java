package axioma.services.minerva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import axioma.dto.minerva.AltaEmpleadoDTO;

import axioma.models.DireccionModel;
import axioma.models.SujetoModel;
import axioma.models.UserModel;
import axioma.repositories.*;
import jakarta.transaction.Transactional;

@Service
public class EmpleadoService {

    @Autowired
    private SujetoRepository sujetoRepository;
    @Autowired
    private DireccionRepository direccionRepository;
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void altaEmpleado(AltaEmpleadoDTO dto) {
        SujetoModel sujeto = new SujetoModel();
        DireccionModel direccion = new DireccionModel();
        UserModel user = new UserModel();

        sujeto.setNombre(dto.getSujeto().getNombre());
        sujeto.setApellidoM(dto.getSujeto().getApellidoM());
        sujeto.setApellidoP(dto.getSujeto().getApellidoP());
        sujeto.setSexo(dto.getSujeto().getSexo());
        sujeto.setRfc(dto.getSujeto().getRfc());
        sujeto.setCurp(dto.getSujeto().getCurp());
        sujeto.setNacionalidad(dto.getSujeto().getNacionalidad());
        sujeto.setLugarNacimiento(dto.getSujeto().getLugarNacimiento());
        sujeto.setTelefono(dto.getSujeto().getTelefono());
        sujeto.setTelefonoEmergencia(dto.getSujeto().getTelefonoEmergencia());
        sujeto.setCorreo(dto.getSujeto().getCorreo());
        sujeto.setFechaNacimiento(dto.getSujeto().getFechaNacimiento());
        sujeto.setEstatus(dto.getSujeto().getEstatus());

        direccion.setCalle(dto.getDireccion().getCalle());
        direccion.setAvenida(dto.getDireccion().getAvenida());
        direccion.setCodigoPostal(dto.getDireccion().getCodigoPostal());
        direccion.setColonia(dto.getDireccion().getColonia());
        direccion.setEstado(dto.getDireccion().getEstado());
        direccion.setMunicipio(dto.getDireccion().getMunicipio());
        direccion.setNumeroExterior(dto.getDireccion().getNumeroExterior());
        direccion.setNumeroInterior(dto.getDireccion().getNumeroInterior());

        user.setPassword(dto.getUser().getPassword());
        user.setUsername(dto.getUser().getUsername());

        sujeto.setDireccion(direccion);
        sujeto.setUser(user);

        direccionRepository.save(direccion);
        sujetoRepository.save(sujeto);
        userRepository.save(user);

    }

}
