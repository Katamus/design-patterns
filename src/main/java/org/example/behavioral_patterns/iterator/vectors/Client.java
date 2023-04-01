package org.example.behavioral_patterns.iterator.vectors;

public class Client {
    public static void main(String argv[]) {
        Vector vector = new Vector(5);

        //Creación del iterador
        VectorIterator iterador = vector.iterador();

        //Recorrido con el iterador
        while (iterador.hasNext())
            System.out.println(iterador.next());
    }
}
