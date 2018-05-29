package co.com.poli.AppRegistroMaterias.modelo;

import java.util.Objects;

public class Registro {

    private String idRegistro;
    private String documento;
    private Materia materia;
    private Categoria categoria;
    private Double precio;

    public Registro() {
    }

    public Registro(String idRegistro, String documento, Materia materia, Categoria categoria, Double precio) {
        this.idRegistro = idRegistro;
        this.documento = documento;
        this.materia = materia;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.idRegistro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Registro other = (Registro) obj;
        if (!Objects.equals(this.idRegistro, other.idRegistro)) {
            return false;
        }
        return true;
    }

}
