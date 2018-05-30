package co.com.poli.AppRegistroMaterias.dao.implementacion;


import co.com.poli.AppRegistroMaterias.dao.IRegistroDAO;
import co.com.poli.AppRegistroMaterias.datos.DatosRegistro;
import co.com.poli.AppRegistroMaterias.modelo.Registro;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementacionDaoRegistro implements IRegistroDAO {

    @Override
    public List<Registro> obtenerRegistros() {
        return DatosRegistro.getListaRegistros();
    }

    @Override
    public Registro obtenerRegistro(String idRegistro) {

        List<Registro> list = DatosRegistro.getListaRegistros();
        Registro pro = null;

        for (Registro registro : list) {
            if (registro.getIdRegistro().equals(idRegistro)) {
                pro = registro;
            }

        }

        return pro;
    }

    @Override
    public String crearRegistro(Registro registro) {
        List<Registro> list = DatosRegistro.getListaRegistros();
        list.add(registro);
        DatosRegistro.setListaRegistros(list);
        return "Registro creado!!!";
    }

    @Override
    public String eliminarRegistro(String idRegistro) {
        List<Registro> list = DatosRegistro.getListaRegistros();
        Registro pro = obtenerRegistro(idRegistro);
        list.remove(pro);
        DatosRegistro.setListaRegistros(list);
        return "Registro eliminado!!!";
    }

    @Override
    public String modificarRegistro(Registro registro) {
        List<Registro> list = DatosRegistro.getListaRegistros();
        list.set(list.indexOf(registro), registro);
        DatosRegistro.setListaRegistros(list);
        return "Registro modificado!!!";
    }

}
