package ep1.ineappep1service.Alumno;

import lombok.*;

import javax.persistence.*;

@Entity(name="Alumno")
@Table(
    name="tbl_alumno",
    uniqueConstraints ={
            @UniqueConstraint(name = "alumno_dni_unique", columnNames = "dni"),
    }
)
@Builder
@Data
public class Alumno {

    @SequenceGenerator(
            name ="alumno_sequence",
            sequenceName ="alumno_sequence",
            allocationSize =1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator ="alumno_sequence"
    )
    @Id
    Long id;
    String nombre;
    String apellido;
    String dni;
    String curso;
}
