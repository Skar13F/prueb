/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 28 de abril de 2022
 * Fecha de actualización: 03 de mayo de 2022
 * Descripción: clase para responder a las interacciones entre el usuario y 
 * 				la interfaz, y realiza las peticiones al modelo para pasarlos a la vista
 */
package controller;

import java.util.List;
import model.PrestamoModel;
import pojo.*;

public class PrestamoController {
	private static PrestamoModel prestam = new PrestamoModel();

	public List<Prestamo> crearPrestamo(List<Prestamo> lista, Prestamo prest) {// Agregar
		return prestam.crearPrestamo(lista, prest);
	}

	public Prestamo getPrestamo(List<Prestamo> lista, int id) {// Buscar
		return prestam.getPrestamo(lista, id);
	}

	public List<Prestamo> eliminarPrestamo(List<Prestamo> lista, int id) {// Eliminar
		return prestam.eliminarPrestamo(lista, id);
	}

	public void mostrarPrestamo(List<Prestamo> lista, List<Libro> listaLibro, List<Encargado> listaEncargado,
			List<Usuario> listaUsuario) {// Mostrar
		prestam.mostrarPrestamo(lista, listaLibro, listaEncargado, listaUsuario);
	}
}
