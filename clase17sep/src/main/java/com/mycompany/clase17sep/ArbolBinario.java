/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase17sep;

/**
 *
 * @author hserrano50
 */
public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    // 1. INSERCIÓN: Agrega un nuevo evento manteniendo el orden por ID.
    public void insertar(Evento evento) {
        raiz = insertarRecursivo(raiz, evento);
    }

    private Nodo insertarRecursivo(Nodo actual, Evento evento) {
        if (actual == null) {
            return new Nodo(evento); // Si el espacio está vacío, crea el nodo aquí
        }

        // Compara los IDs para decidir si ir a la izquierda o a la derecha
        if (evento.id < actual.evento.id) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, evento);
        } else if (evento.id > actual.evento.id) {
            actual.derecho = insertarRecursivo(actual.derecho, evento);
        }
        
        // Retorna el nodo sin cambios si el ID ya existe o tras la inserción
        return actual;
    }

    // 2. BÚSQUEDA: Encuentra un evento específico a partir de su ID.
    public Evento buscar(long id) {
        Nodo resultado = buscarRecursivo(raiz, id);
        return resultado != null ? resultado.evento : null;
    }

    private Nodo buscarRecursivo(Nodo actual, long id) {
        // Base: Si el nodo es null o si encontramos el ID
        if (actual == null || actual.evento.id == id) {
            return actual;
        }

        // Si el ID buscado es menor, busca en la rama izquierda
        if (id < actual.evento.id) {
            return buscarRecursivo(actual.izquierdo, id);
        }
        
        // Si el ID buscado es mayor, busca en la rama derecha
        return buscarRecursivo(actual.derecho, id);
    }

    // 3. RECORRIDO INORDEN: Muestra los eventos ordenados de menor a mayor ID.
    public void imprimirInorden() {
        recorridoInorden(raiz);
    }

    private void recorridoInorden(Nodo actual) {
        if (actual != null) {
            recorridoInorden(actual.izquierdo); // Visita hijo izquierdo
            System.out.println(actual.evento);  // Procesa nodo actual
            recorridoInorden(actual.derecho);   // Visita hijo derecho
        }
    }
}

