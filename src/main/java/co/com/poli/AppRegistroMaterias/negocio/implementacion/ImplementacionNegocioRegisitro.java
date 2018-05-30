package co.com.poli.AppRegistroMaterias.negocio.implementacion;

import co.com.poli.AppRegistroMaterias.dao.IMateriaDAO;
import co.com.poli.AppRegistroMaterias.dao.IRegistroDAO;
import co.com.poli.AppRegistroMaterias.modelo.Categoria;
import co.com.poli.AppRegistroMaterias.modelo.Materia;
import co.com.poli.AppRegistroMaterias.modelo.Registro;
import co.com.poli.AppRegistroMaterias.negocio.NegocioIRegistro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionNegocioRegisitro implements NegocioIRegistro {

    @Autowired
    private IRegistroDAO registroDao;
    @Autowired
    private IMateriaDAO materiaDAO;

    @Override
    public List<Registro> obtenerRegistros() {
        return registroDao.obtenerRegistros();
    }

    @Override
    public Registro obtenerRegistro(String idRegistro) {
        return registroDao.obtenerRegistro(idRegistro);
    }

    @Override
    public String crearRegistro(Registro registro) {
        Registro pro = registroDao.obtenerRegistro(registro.getIdRegistro());
        if (pro == null) {

            switch (registro.getCategoria()) {
                case A: {
                    registro.setPrecio(25000D);

                    Materia materia = materiaDAO.obtenerMateria(registro.getMateria().getIdMateria());
                    if (materia == null) {
                        return "No existe la materia";
                    } else {
                        return Validaciones(registro, materia);
                    }

                }
                case B: {
                    registro.setPrecio(43000D);

                    Materia materia = materiaDAO.obtenerMateria(registro.getMateria().getIdMateria());
                    if (materia == null) {
                        return "No existe la materia";
                    } else {
                        return Validaciones(registro, materia);
                    }
                }
                default:
                    return "Categoria invalida";
            }
        } else {
            return "Ya existe el registro";
        }

    }

    @Override
    public String eliminarRegistro(String idRegistro) {
        Registro pro = registroDao.obtenerRegistro(idRegistro);
        if (pro == null) {
            return "No existe el registro";
        } else {
            return registroDao.eliminarRegistro(idRegistro);

        }
    }

    @Override
    public String modificarRegistro(Registro registro) {

        return "";
    }

    public String Validaciones(Registro registro, Materia materia) {
        int cont = 0;
        boolean repetido = true;
        List<Registro> registros = obtenerRegistros();
        for (Registro reg : registros) {
            if (reg.getMateria().getIdMateria().equals(registro.getMateria().getIdMateria())) {
                cont++;
            }
            if (reg.getDocumento().equals(registro.getDocumento()) && reg.getMateria().getIdMateria().equals(registro.getMateria().getIdMateria())) {
                repetido = false;
            }
        }

        if (materia.getCupoMax() > cont) {
            if (repetido) {
                return registroDao.crearRegistro(registro);
            } else {
                return "Repetido en la materia";
            }
        } else {
            return "Materia llena";
        }
    }

}
