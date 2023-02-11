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

        Livro  livro1 = new Livro("Harry Potter" , 300);
        System.out.println(livro1);
    }
}

class Livro{
    private String nome;
    private Integer numPagina;

    public Livro(String nome, Integer numPagina) {
        this.nome = nome;
        this.numPagina = numPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }
}
