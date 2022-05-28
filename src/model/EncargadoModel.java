/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 09 de mayo de 2022
 * Descripción: clase para modelar las operaciones CRUD de la clase encargado
 */
package model;

import java.util.List;

import pojo.Encargado;

public class EncargadoModel {
	public List<Encargado> crearEncargado(List<Encargado> lista2, Encargado encargado) {// agregamos objetos a la lista
		lista2.add(encargado);
		return lista2;
	}

	public List<Encargado> eliminarEncargado(List<Encargado> lista, String codTrab) {// eliminamos un objeto de la lista
		for (Encargado encargado : lista) {
			if (codTrab.compareTo(encargado.getCodTrab()) == 0) {
				lista.remove(encargado);
				return lista;
			}
		}
		return lista;
	}

	public void mostrarEncargado(List<Encargado> lista) {// Imprimimos el contenido de la lista
		System.out.println(" _____________________________________________________________________________");
		System.out.println("|          Encargados                                                         |");
		System.out.println(" -----------------------------------------------------------------------------");
		System.out.println("|  Código de trabajador  |                   Nombre  |              Teléfono  |");
		System.out.println(" -----------------------------------------------------------------------------");
		for (Encargado encargado : lista) {
			System.out.printf("|%22s  |%25s  |%22s  |", encargado.getCodTrab(), encargado.getNombre(),
					encargado.getTelefono());
			System.out.println("\n -----------------------------------------------------------------------------");
		}
		System.out.println("\n");

	}

	public Encargado getEncargado(List<Encargado> lista, String CodTrab) {// Buscamos un objeto a tavés de su código
		Encargado vacio = null;
		for (Encargado encargado : lista) {
			if (CodTrab.compareTo(encargado.getCodTrab()) == 0) {
				return encargado;
			}
		}
		return vacio;
	}

	// Actualizamos datos de un objeto de la lista
	public List<Encargado> actualizarEncargado(List<Encargado> lista, String codTrab, String dato, int opcion) {
		for (Encargado encargado : lista) {
			if (codTrab.compareTo(encargado.getCodTrab()) == 0) {
				if (opcion == 1) {
					encargado.setNombre(dato);
				} else {
					encargado.setTelefono(dato);
				}
			}
		}
		return lista;
	}

}
