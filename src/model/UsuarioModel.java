/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 09 de mayo de 2022
 * Descripción: clase para modelar las operaciones CRUD de la clase Usuario
 */
package model;

import java.util.List;

import pojo.Usuario;

public class UsuarioModel {
	public List<Usuario> crearUsuario(List<Usuario> lista, Usuario usuario) {// Agregamos objetos a la lista
		lista.add(usuario);
		return lista;
	}

	public List<Usuario> eliminarUsuario(List<Usuario> lista, String matricula) {// Buscamos y eliminamos un objeto
		for (Usuario usuario : lista) {
			if (matricula.compareTo(usuario.getMatricula()) == 0) {
				lista.remove(usuario);
				return lista;
			}
		}
		return lista;
	}

	public void mostrarUsuario(List<Usuario> lista) {// Imprimimos el contenido de la lista
		System.out.println(" _____________________________________________________________________________");
		System.out.println("|          Alumnos                                                            |");
		System.out.println(" -----------------------------------------------------------------------------");
		System.out.println("|  Matrícula  |                   Nombre  |             Carrera  |  Semestre  |");
		System.out.println(" -----------------------------------------------------------------------------");
		for (Usuario usuario : lista) {
			System.out.printf("|%11s  |%25s  |%20s  |%10s  |", usuario.getMatricula(), usuario.getNombre(),
					usuario.getCarrera(), usuario.getSemestre());
			System.out.println("\n -----------------------------------------------------------------------------");
		}
		System.out.println("\n");

	}

	public Usuario getUsuario(List<Usuario> lista, String matricula) {// Buscamos un objeto a través de la matrícula
		Usuario vacio = null;
		for (Usuario usuario : lista) {
			if (matricula.compareTo(usuario.getMatricula()) == 0) {
				return usuario;
			}
		}
		return vacio;
	}

	// Actualizamos los datos de un objeto
	public List<Usuario> actualizarUsuario(List<Usuario> lista, String matricula, String dato, int opcion) {
		for (Usuario usuario : lista) {
			if (matricula.compareTo(usuario.getMatricula()) == 0) {
				if (opcion == 1) {
					usuario.setNombre(dato);
				} else if (opcion == 2) {
					usuario.setCarrera(dato);
				} else {
					usuario.setSemestre(dato);
				}
			}

		}
		return lista;
	}
}
