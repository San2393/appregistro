package co.com.poli.AppRegistroMaterias.negocio;

import co.com.poli.AppRegistroMaterias.dao.*;
import co.com.poli.AppRegistroMaterias.modelo.Materia;
import java.util.List;

public interface NegocioIMateria {

    List<Materia> obtenerMaterias();

    Materia obtenerMateria(String idMateria);

    Materia obtenerMateriaMaximoCosto();

    String crearMateria(Materia materia);

    String eliminarMateria(String idMateria);

    String modificarMateria(Materia materia);
}
