/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 22 de abril de 2022
 * Fecha de actualización: 25 de abril de 2022
 * Descripción: clase para modelar al encargado de la biblioteca
 */
package pojo;

public class Encargado {
	private String codTrab;
	private String nombre;
	private String telefono;

	public Encargado() {

	}

	public Encargado(String codTrab, String nombre, String telefono) {
		super();
		this.codTrab = codTrab;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getCodTrab() {
		return codTrab;
	}

	public void setCodTrab(String codTrab) {
		this.codTrab = codTrab;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
