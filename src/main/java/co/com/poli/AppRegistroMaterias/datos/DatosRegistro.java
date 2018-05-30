package co.com.poli.AppRegistroMaterias.datos;

import co.com.poli.AppRegistroMaterias.modelo.Registro;
import java.util.ArrayList;
import java.util.List;

public class DatosRegistro {

    private static List<Registro> listaRegistros;

    static {
        listaRegistros = new ArrayList<Registro>() {
            {

            }
        };
    }

    public static List<Registro> getListaRegistros() {
        return listaRegistros;
    }

    public static void setListaRegistros(List<Registro> listaRegistros) {
        DatosRegistro.listaRegistros = listaRegistros;
    }

}
