package co.com.poli.AppRegistroMaterias.dao.implementacion;


import co.com.poli.AppRegistroMaterias.dao.IMateriaDAO;
import co.com.poli.AppRegistroMaterias.datos.DatosMateria;
import co.com.poli.AppRegistroMaterias.modelo.Materia;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementacionDaoMateria implements IMateriaDAO {

    @Override
    public List<Materia> obtenerMaterias() {
        return DatosMateria.getListaMaterias();
    }

    @Override
    public Materia obtenerMateria(String idMateria) {

        List<Materia> list = DatosMateria.getListaMaterias();
        Materia mov = null;

        for (Materia materia : list) {
            if (materia.getIdMateria().equals(idMateria)) {
                mov = materia;
            }
        }

        return mov;
    }

    @Override
    public String crearMateria(Materia materia) {
        List<Materia> list = DatosMateria.getListaMaterias();
        list.add(materia);
        DatosMateria.setListaMaterias(list);
        return "Materia creado!!!";
    }

    @Override
    public String eliminarMateria(String idMateria) {
        List<Materia> list = DatosMateria.getListaMaterias();
        Materia pro = obtenerMateria(idMateria);
        list.remove(pro);
        DatosMateria.setListaMaterias(list);
        return "Materia eliminado!!!";
    }

    @Override
    public String modificarMateria(Materia materia) {
        List<Materia> list = DatosMateria.getListaMaterias();
        list.set(list.indexOf(materia), materia);
        DatosMateria.setListaMaterias(list);
        return "Materia modificado!!!";
    }

}
