package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaJava {
    private static Object Gato;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*int a = 5;
        int b = 3;
        System.out.println((a+b));*/

        Gato  gato = new Gato();
        System.out.println(gato);
    }
}
