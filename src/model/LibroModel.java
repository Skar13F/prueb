/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 09 de mayo de 2022
 * Descripción: clase para modelar las operaciones CRUD de la clase Libro
 */
package model;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import pojo.Libro;

public class LibroModel {

    public List<Libro> crearLibro(List<Libro> lista, Libro libro) {// Agrega objetos a la lista
        lista.add(libro);
        return lista;

    }

    public Libro getLibro(List<Libro> lista, String isbn) {// Busca un objeto libro en la lista
        Libro vacio = null;
        for (Libro libro : lista) {
            if (isbn.compareTo(libro.getIsbn()) == 0) {
                return libro;
            }
        }
        return vacio;
    }

    public List<Libro> eliminarLibro(List<Libro> lista, String isbn) {// Busca y elimina un objeto
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getIsbn().compareTo(isbn)==0){
                lista.remove(i);
                break;
            }
        }
        return lista;

        /*for (Libro libro : lista) {
			if (isbn.compareTo(libro.getIsbn()) == 0) {
				lista.remove(libro);
				return lista;
			}
		}

		return lista;*/
    }

    public void mostrarlibro(List<Libro> lista, DefaultTableModel modelo) {// Imprime el contenido de la lista
        modelo.setRowCount(0);//resetea la tabla
        for (int i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[6];
            fila[0] = lista.get(i).getIsbn();
            fila[1] = lista.get(i).getTitulo();
            fila[2] = lista.get(i).getAutor();
            fila[3] = lista.get(i).getClasificacion();
            fila[4] = lista.get(i).getCantidad();
            fila[5] = lista.get(i).getUrl();
            modelo.addRow(fila);
        }

        /*
                System.out.println(
				" _______________________________________________________________________________________________");
		System.out.println(
				"|         Libros                                                                                |");
		System.out.println(
				" -----------------------------------------------------------------------------------------------");
		System.out.println(
				"|       ISBN     |              Autor  |                 Título  |  Clasificación  |  Cantidad  |");
		System.out.println(
				" -----------------------------------------------------------------------------------------------");
		for (Libro libro : lista) {
			System.out.printf("|%14s  |%19s  |%23s  |%15s  |%10d  |", libro.getIsbn(), libro.getAutor(),
					libro.getTitulo(), libro.getClasificacion(), libro.getCantidad());
			System.out.println(
					"\n -----------------------------------------------------------------------------------------------");
		}
		System.out.println("\n");*/
    }

    public List<Libro> actualizarLibro(List<Libro> lista, Libro libro1) {// Actualiza los datos															// de un libro
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIsbn().compareTo(libro1.getIsbn()) == 0) {
                lista.set(i, libro1);
                /*if (opcion == 1) {
					libro.setAutor(dato);
				} else if (opcion == 2) {
					libro.setTitulo(dato);
				} else if (opcion == 3) {
					libro.setCantidad(Short.valueOf(dato));
				} else {
					libro.setClasificacion(dato);
				}*/
                break;
            }
        }
        return lista;
    }
}
