package ep1.ineappep1service.Alumno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping
    @RequestMapping("/getAll")
    public ArrayList<Alumno> getAlumno(){

        ArrayList<Alumno> listaAlumno = new ArrayList<>();
        Alumno alumno1= Alumno.builder()
                .id(1L).nombre("Angel")
                .apellido("Paredes")
                .dni("72876549")
                .curso("Mate").build();
        Alumno alumno2= Alumno.builder()
                .id(2L).nombre("Kiara")
                .apellido("Baez")
                .dni("234543231")
                .curso("Historia").build();
        listaAlumno.add(alumno1);
        listaAlumno.add(alumno2);
        return listaAlumno;
    }
}
