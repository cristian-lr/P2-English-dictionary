package net.salesianos.lacuesta.diccionario;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Diccionario {

    HashMap<Character, Set<String>> palabras;

    public Diccionario() {
        palabras = new LinkedHashMap<>();
    }

    public void aniadirPalabra(String palabra) {
        palabra = palabra.toLowerCase().trim();

        Set<String> coleccion = palabras.get(palabra.charAt(0));

        if (coleccion == null) {
            coleccion = new LinkedHashSet<>();
            coleccion.add(palabra);
            palabras.put(palabra.charAt(0), coleccion);
        } else {
            coleccion.add(palabra);
        }

    }

    public void eliminarPalabra(String palabra) {
        palabra = palabra.toLowerCase().trim();

        Set<String> coleccion = palabras.get(palabra.charAt(0));

        if (coleccion != null) {
            coleccion.remove(palabra);
            System.out.println("Palabra borrada correctamente");
        } else {
            System.out.println("La palabra no está almacenada");
        }
    }

    public boolean existePalabra(String palabra) {
        palabra = palabra.toLowerCase().trim();

        Set<String> coleccion = palabras.get(palabra.charAt(0));

        if (coleccion != null) {
            return coleccion.contains(palabra);
        }
        return false;
    }

    public void mostrarInicialesDisponibles() {
        Set<Character> iniciales = palabras.keySet();

        for (Character inicial : iniciales) {
            if (!palabras.get(inicial).isEmpty()) System.out.println(inicial);
        }
    }

    public void mostrarPalabrasPorInicial(Character inicial) {
        Set<String> coleccion = palabras.get(inicial);

        if (coleccion != null) {
            for (String palabra : coleccion) {
                System.out.println(palabra);
            }
        } else {
            System.out.println("Inicial no disponible");
        }
    }

}
