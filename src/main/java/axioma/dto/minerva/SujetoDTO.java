package axioma.dto.minerva;

import java.time.LocalDate;

import axioma.models.enums.EstatusSujeto;
import axioma.models.enums.Nacionalidad;
import axioma.models.enums.Sexo;
import lombok.Data;

@Data
public class SujetoDTO {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private Sexo sexo;
    private String rfc;
    private String curp;
    private Nacionalidad nacionalidad;
    private String lugarNacimiento;
    private String telefono;
    private String telefonoEmergencia;
    private String correo;
    private LocalDate fechaNacimiento;
    private EstatusSujeto estatus;

}
