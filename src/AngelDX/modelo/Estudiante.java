package AngelDX.modelo;

public class Estudiante {
    private int id;
    private String nombre;
    private int ciclo;
    private double nota;

    public Estudiante(int id, String nombre, int ciclo, double nota) {
        this.id = id;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", nombre=" + nombre + ", ciclo=" + ciclo + ", nota=" + nota + '}';
    }
    
    
    
}
