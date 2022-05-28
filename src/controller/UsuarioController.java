/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 28 de abril de 2022
 * Fecha de actualización: 03 de mayo de 2022
 * Descripción: clase para responder a las interacciones entre el usuario y 
 * 				la interfaz, y realiza las peticiones al modelo para pasarlos a la vista
 */
package controller;

import java.util.List;
import model.UsuarioModel;
import pojo.Usuario;

public class UsuarioController {
	private static UsuarioModel userModel = new UsuarioModel();

	public List<Usuario> crearUsuario(List<Usuario> lista, Usuario usuario) {// Agreagar
		return userModel.crearUsuario(lista, usuario);
	}

	public List<Usuario> eliminarUsuario(List<Usuario> lista, String matricula) {// Eliminar
		return userModel.eliminarUsuario(lista, matricula);
	}

	public void mostrarUsuario(List<Usuario> lista) {// Mostrar
		userModel.mostrarUsuario(lista);
	}

	public Usuario getUsuario(List<Usuario> lista, String matricula) {// Buscar
		return userModel.getUsuario(lista, matricula);
	}

	public List<Usuario> actualizarUsuario(List<Usuario> lista, String matricula, String dato, int opcion) {// Actualizar
		return userModel.actualizarUsuario(lista, matricula, dato, opcion);
	}
}
