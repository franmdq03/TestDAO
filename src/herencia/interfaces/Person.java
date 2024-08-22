package herencia.interfaces;

public class Person {

    private int id;
    private String nombre;
    private String documento;

    public Person(int id, String nombre, String documento) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", nombre='" + nombre + '\'' + ", documento='" + documento + '\'' + '}';
    }
}
