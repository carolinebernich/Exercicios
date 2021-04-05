package atividade02;

public class Gato extends Animal {

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    public void cacarRato(){
        System.out.println("cacando!");
    }
}
