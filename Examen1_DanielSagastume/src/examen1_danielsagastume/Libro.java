package examen1_danielsagastume;

import java.util.Date;

public class Libro {
    private String autor;
    private String titulo;
    private String genero;
    private String editorial;
    private String idioma;
    private String anio_e;
    private String isbn;
    private int ingreso;
    private String estado;
    private String user_prestado;
    private int cod_user;

  
    public Libro(String autor, String titulo, String genero, String editorial, String idioma, String anio_e, String isbn, int ingreso, String estado, String user_prestado, int cod_user) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.editorial = editorial;
        this.idioma = idioma;
        this.anio_e = anio_e;
        this.isbn = isbn;
        this.ingreso = ingreso;
        this.estado = estado;
        this.user_prestado = user_prestado;
        this.cod_user = cod_user;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAnio_e() {
        return anio_e;
    }

    public void setAnio_e(String anio_e) {
        this.anio_e = anio_e;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUser_prestado() {
        return user_prestado;
    }

    public void setUser_prestado(String user_prestado) {
        this.user_prestado = user_prestado;
    }

    public int getCod_user() {
        return cod_user;
    }

    public void setCod_user(int cod_user) {
        this.cod_user = cod_user;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", titulo=" + titulo + ", genero=" + genero + ", editorial=" + editorial + ", idioma=" + idioma + ", anio_e=" + anio_e + ", isbn=" + isbn + ", ingreso=" + ingreso + ", estado=" + estado + ", user_prestado=" + user_prestado + ", cod_user=" + cod_user + '}';
    } 
    
}
