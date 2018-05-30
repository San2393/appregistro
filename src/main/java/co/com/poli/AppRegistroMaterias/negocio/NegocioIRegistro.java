package co.com.poli.AppRegistroMaterias.negocio;

import co.com.poli.AppRegistroMaterias.dao.*;
import co.com.poli.AppRegistroMaterias.modelo.Registro;
import java.util.List;

public interface NegocioIRegistro {

    List<Registro> obtenerRegistros();

    Registro obtenerRegistro(String idRegistro);

    String crearRegistro(Registro registro);

    String eliminarRegistro(String idRegistro);

    String modificarRegistro(Registro registro);
}
