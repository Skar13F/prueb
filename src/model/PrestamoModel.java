/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 30 de abril de 2022
 * Descripción: clase para modelar las operaciones CRUD de la clase préstamo 
 */
package model;

import java.util.List;

import controller.*;
import pojo.*;

public class PrestamoModel {
	public List<Prestamo> crearPrestamo(List<Prestamo> lista, Prestamo prest) {// añadimos objetos a la lista
		lista.add(prest);
		return lista;

	}

	public Prestamo getPrestamo(List<Prestamo> lista, int id) {// obtenemos un objeto a través de su id
		Prestamo prestamo1 = null;
		for (Prestamo prestamo : lista) {
			if (id == prestamo.getId()) {
				return prestamo;
			}
		}
		return prestamo1;
	}

	public List<Prestamo> eliminarPrestamo(List<Prestamo> lista, int id) {// eliminamos un objeto de la lista
		for (Prestamo prestamo : lista) {
			if (id == prestamo.getId()) {
				lista.remove(prestamo);
				return lista;
			}
		}
		return lista;
	}

	public void mostrarPrestamo(List<Prestamo> lista, List<Libro> listaLibro, List<Encargado> listaEncargado,
			List<Usuario> listaUsuario) {// imprimimos el contenido de la lista

		System.out.println(
				" ___________________________________________________________________________________________________");
		System.out.println(
				"|          Pŕestamos                                                                                |");
		System.out.println(
				" ---------------------------------------------------------------------------------------------------");
		System.out.println(
				"|  id  |  Fecha de solicitud  |  Fecha de entrega  |            Libros  |  Encargado  |     Alumno  |");
		System.out.println(
				" ---------------------------------------------------------------------------------------------------");
		for (Prestamo prestamo : lista) {
			LibroController libroController = new LibroController();
			EncargadoController encargadoController = new EncargadoController();
			UsuarioController usuarioController = new UsuarioController();

			Libro libro = new Libro();
			Encargado encargado = encargadoController.getEncargado(listaEncargado, prestamo.getCodTrab());

			Usuario usuario = usuarioController.getUsuario(listaUsuario, prestamo.getMatricula());
			System.out.printf("|%4d  |%20s  |%18s  ", prestamo.getId(), prestamo.getFechaSol(),
					prestamo.getFechaEnt());

			for (int i = 0; i < prestamo.getNombres().size(); i++) {
				libro = libroController.getLibro(listaLibro, prestamo.getNombres().get(i));

				if (i + 1 < prestamo.getNombres().size()) {
					System.out.printf("|%18s  |%10s  |  %10s  |",libro.getIsbn(),encargado.getCodTrab(),usuario.getMatricula());
					System.out.printf(
							"\n|      |                      |                    |");
				} else {
					System.out.printf("|%18s  |            |              |",libro.getIsbn());
				}
				
			}



			//System.out.printf("|%10s  |  %10s  |",encargado.getCodTrab(),usuario.getMatricula());
			System.out.println(
					"\n ---------------------------------------------------------------------------------------------------");
		}

	}

}
