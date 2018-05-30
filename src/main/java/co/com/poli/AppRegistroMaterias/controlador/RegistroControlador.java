package co.com.poli.AppRegistroMaterias.controlador;

import co.com.poli.AppRegistroMaterias.modelo.Registro;
import co.com.poli.AppRegistroMaterias.negocio.NegocioIRegistro;
import co.com.poli.AppRegistroMaterias.path.Path.PathRegistro;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
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
public class RegistroControlador {

    @Autowired
    private NegocioIRegistro negocioIRegistro;

    @GetMapping(PathRegistro.REGISTROS)
    public List<Registro> obtenerRegistros(HttpServletResponse hsr) {
        return negocioIRegistro.obtenerRegistros();
    }

    @GetMapping(PathRegistro.REGISTRO_ID)
    public Registro obtenerRegistro(@PathVariable String idRegistro,
            HttpServletResponse hsr) {
        return negocioIRegistro.obtenerRegistro(idRegistro);
    }

    @PostMapping(PathRegistro.REGISTROS)
    public String crearRegistro(@RequestBody Registro registro,
            HttpServletResponse hsr) {
        return negocioIRegistro.crearRegistro(registro);
    }

    @DeleteMapping(PathRegistro.REGISTRO_ID)
    public String eliminarRegistro(@PathVariable String idRegistro,
            HttpServletResponse hsr) {
        return negocioIRegistro.eliminarRegistro(idRegistro);
    }

    @PutMapping(PathRegistro.REGISTROS)
    public String modificarRegistro(@RequestBody Registro registro,
            HttpServletResponse hsr) {
        return negocioIRegistro.modificarRegistro(registro);
    }

}
