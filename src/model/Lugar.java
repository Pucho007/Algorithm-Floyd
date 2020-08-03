
package model;


public class Lugar {
    String nombre;
    int id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lugar(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    
}
