package co.com.poli.AppRegistroMaterias.negocio.implementacion;

import co.com.poli.AppRegistroMaterias.dao.IMateriaDAO;
import co.com.poli.AppRegistroMaterias.modelo.Materia;
import co.com.poli.AppRegistroMaterias.negocio.NegocioIMateria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionNegocioMateria implements NegocioIMateria {

    @Autowired
    private IMateriaDAO materiaDao;

    @Override
    public List<Materia> obtenerMaterias() {
        return materiaDao.obtenerMaterias();
    }

    @Override
    public Materia obtenerMateria(String idMateria) {
        return materiaDao.obtenerMateria(idMateria);
    }

    @Override
    public String crearMateria(Materia materia) {

        Materia pro = materiaDao.obtenerMateria(materia.getIdMateria());
        if (pro == null) {
            return materiaDao.crearMateria(materia);
        } else {
            return "Ya existe el materia";
        }

    }

    @Override
    public String eliminarMateria(String idMateria) {
        Materia pro = materiaDao.obtenerMateria(idMateria);
        if (pro == null) {
            return "No existe el materia";
        } else {
            return materiaDao.eliminarMateria(idMateria);

        }
    }

    @Override
    public String modificarMateria(Materia materia) {

        Materia pro = materiaDao.obtenerMateria(materia.getIdMateria());
        if (pro == null) {
            return "No existe el materia";
        } else {
            return materiaDao.modificarMateria(materia);
        }

    }

}
