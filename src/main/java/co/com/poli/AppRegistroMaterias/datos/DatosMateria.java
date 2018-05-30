package co.com.poli.AppRegistroMaterias.datos;

import co.com.poli.AppRegistroMaterias.modelo.Materia;
import java.util.ArrayList;
import java.util.List;

public class DatosMateria {

    private static List<Materia> listaMaterias;

    static {
        listaMaterias = new ArrayList<Materia>() {
            {
                add(new Materia("001", "SOA", 4D, 1D, 2D));
                add(new Materia("002", "Gestion", 2D, 1D, 2D));
                add(new Materia("003", "Pacho", 1D, 1D, 2D));
            }
        };
    }

    public static List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public static void setListaMaterias(List<Materia> listaMaterias) {
        DatosMateria.listaMaterias = listaMaterias;
    }

}
