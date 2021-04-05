package atividade01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("informe um valor inteiro");
        int opt = ler.nextInt();

        switch (opt) {
            case 0 -> System.out.println("escolheu opcao 0");
            case 1 -> System.out.println("escolheu opcao 1");
            case 2 -> System.out.println("escolheu opcao 2");
            default -> System.out.println("leitura invalida");
        }
        ler.close();
    }
}
