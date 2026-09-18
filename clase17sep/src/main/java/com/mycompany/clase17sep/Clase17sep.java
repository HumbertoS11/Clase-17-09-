/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase17sep;
import java.time.LocalDateTime;


/**
 *
 * @author hserrano50
 */
public class Clase17sep {

    public static void main(String[] args) {
        ArbolBinario arbolEventos = new ArbolBinario();
        Evento e1 = new Evento(50, "Conferencia Tech", LocalDateTime.of(2026, 10, 15, 9, 0), "Auditorio principal");
        Evento e2 = new Evento(30, "Reunión de Equipo", LocalDateTime.of(2026, 9, 20, 14, 30), "Sala 4");
        Evento e3 = new Evento(70, "Lanzamiento de Producto", LocalDateTime.of(2026, 11, 1, 10, 0), "Streaming online");
        Evento e4 = new Evento(40, "Entrevista", LocalDateTime.of(2026, 9, 25, 11, 0), "Virtual");

        // 1. Insertamos los eventos en el árbol
        // El árbol se estructurará automáticamente basándose en los IDs (50, 30, 70, 40)
        arbolEventos.insertar(e1);
        arbolEventos.insertar(e2);
        arbolEventos.insertar(e3);
        arbolEventos.insertar(e4);

        // 2. Buscamos un evento por su ID
        System.out.println("--- RESULTADO DE BÚSQUEDA ---");
        long idBuscado = 70;
        Evento encontrado = arbolEventos.buscar(idBuscado);
        
        if (encontrado != null) {
            System.out.println("Evento encontrado: " + encontrado.nombreEvento);
        } else {
            System.out.println("No se encontró ningún evento con el ID: " + idBuscado);
        }

        // 3. Imprimimos todos los eventos (se mostrarán ordenados: 30, 40, 50, 70)
        System.out.println("\n--- LISTA DE EVENTOS ORDENADOS POR ID ---");
        arbolEventos.imprimirInorden();
    }
}
        
    

