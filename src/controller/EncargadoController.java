/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 28 de abril de 2022
 * Fecha de actualización: 09 de mayo de 2022
 * Descripción: clase para responder a las interacciones entre el usuario y 
 * 				la interfaz, y realiza las peticiones al modelo para pasarlos a la vista
 */
package controller;

import java.util.List;
import model.EncargadoModel;
import pojo.Encargado;

public class EncargadoController {

	private static EncargadoModel encMod = new EncargadoModel();

	public List<Encargado> crearEncargado(List<Encargado> lista2, Encargado encargado) {// Agreagar
		return encMod.crearEncargado(lista2, encargado);
	}

	public List<Encargado> eliminarEncargado(List<Encargado> lista2, String codTrab) {// Eliminar
		return encMod.eliminarEncargado(lista2, codTrab);
	}

	public void mostrarEncargado(List<Encargado> lista2) {// Mostrar
		encMod.mostrarEncargado(lista2);
	}

	public Encargado getEncargado(List<Encargado> lista, String CodTrab) {// Buscar
		return encMod.getEncargado(lista, CodTrab);
	}

	public List<Encargado> actualizarEncargado(List<Encargado> lista, String codTrab, String dato, int opcion) {// Actualizar
		return encMod.actualizarEncargado(lista, codTrab, dato, opcion);
	}
}
