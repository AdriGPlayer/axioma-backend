package axioma.models;

import java.time.LocalDate;

import axioma.models.enums.EstatusSujeto;
import axioma.models.enums.Nacionalidad;
import axioma.models.enums.Sexo;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sujetos")
public class SujetoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidoP;
    private String apellidoM;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private String rfc;
    private String curp;
    @Enumerated(EnumType.STRING)
    private Nacionalidad nacionalidad;
    private String lugarNacimiento;
    private String telefono;
    private String telefonoEmergencia;
    private String correo;
    private LocalDate fechaNacimiento;
    @Enumerated(EnumType.STRING)
    private EstatusSujeto estatus;
    @OneToOne
    @JoinColumn(name = "direccion_id")
    private DireccionModel direccion;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserModel user;

}
