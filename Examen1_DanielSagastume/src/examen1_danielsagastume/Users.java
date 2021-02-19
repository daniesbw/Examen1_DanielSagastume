package examen1_danielsagastume;

import java.util.ArrayList;

public class Users {
    private String user;
    private String contrasenia;
    private int coidgo;
    private String nombre;
    private String apellido;
    private int edad;
    ArrayList<Libro> libros=new ArrayList();
    ArrayList<Libro> historial=new ArrayList();

    public Users() {
    }

    public Users(String user, String contrasenia, int coidgo, String nombre, String apellido, int edad) {
        this.user = user;
        this.contrasenia = contrasenia;
        this.coidgo = coidgo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getCoidgo() {
        return coidgo;
    }

    public void setCoidgo(int coidgo) {
        this.coidgo = coidgo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Libro> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Libro> historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Users{" + "user=" + user + ", contrasenia=" + contrasenia + ", coidgo=" + coidgo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", libros=" + libros + ", historial=" + historial + '}';
    }
    
    
   
    
}
