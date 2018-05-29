package co.com.poli.AppRegistroMaterias.modelo;

import java.util.Objects;

public class Materia {

    private String idMateria;
    private String nombre;
    private Double numCreditos;
    private Double cupoMin;
    private Double cupoMax;

    public Materia() {
    }

    public Materia(String idMateria, String nombre, Double numCreditos, Double cupoMin, Double cupoMax) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.numCreditos = numCreditos;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(Double numCreditos) {
        this.numCreditos = numCreditos;
    }

    public Double getCupoMin() {
        return cupoMin;
    }

    public void setCupoMin(Double cupoMin) {
        this.cupoMin = cupoMin;
    }

    public Double getCupoMax() {
        return cupoMax;
    }

    public void setCupoMax(Double cupoMax) {
        this.cupoMax = cupoMax;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idMateria);
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
        final Materia other = (Materia) obj;
        if (!Objects.equals(this.idMateria, other.idMateria)) {
            return false;
        }
        return true;
    }

}
