package co.com.poli.AppRegistroMaterias.controlador;

import co.com.poli.AppRegistroMaterias.modelo.Materia;
import co.com.poli.AppRegistroMaterias.negocio.NegocioIMateria;
import co.com.poli.AppRegistroMaterias.path.Path.PathMateria;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class MateriaControlador {

    @Autowired
    private NegocioIMateria negocioMateria;

    @GetMapping(PathMateria.MATERIAS)
    public List<Materia> obtenermaterias(HttpServletResponse hsr) {
        return negocioMateria.obtenerMaterias();
    }

    @GetMapping(PathMateria.MATERIA_ID)
    public Materia obtenermateria(@PathVariable String idmateria,
            HttpServletResponse hsr) {
        return negocioMateria.obtenerMateria(idmateria);
    }

    @PostMapping(PathMateria.MATERIAS)
    public String crearmateria(@RequestBody Materia materia,
            HttpServletResponse hsr) {
        return negocioMateria.crearMateria(materia);
    }

    @DeleteMapping(PathMateria.MATERIA_ID)
    public String eliminarmateria(@PathVariable String idMateria,
            HttpServletResponse hsr) {
        return negocioMateria.eliminarMateria(idMateria);
    }

    @PutMapping(PathMateria.MATERIAS)
    public String modificarmateria(@RequestBody Materia materia,
            HttpServletResponse hsr) {
        return negocioMateria.modificarMateria(materia);
    }

    @GetMapping(PathMateria.MATERIA_MAXIMO)
    public Materia obtenerMateriaMaximoCosto(HttpServletResponse hsr) {
        return negocioMateria.obtenerMateriaMaximoCosto();
    }

}
