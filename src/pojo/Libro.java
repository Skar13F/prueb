/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 22 de abril de 2022
 * Fecha de actualización: 25 de abril de 2022
 * Descripción: clase para almacenar los datos de un libro
 */
package pojo;

public class Libro {

    private String isbn;
    private String autor;
    private String titulo;
    private short cantidad;
    private String clasificacion;
    private String url;

    public Libro() {
    }

    public Libro(String isbn, String autor, String titulo, short cantidad, String clasificacion, String url) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.clasificacion = clasificacion;
        this.url = url;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
