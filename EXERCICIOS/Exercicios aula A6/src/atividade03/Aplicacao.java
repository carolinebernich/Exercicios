package atividade03;

public class Aplicacao {
    public static void main(String[] args) {

        ProfessorDE p1= new ProfessorDE("Carol", 1254, 25, 2500);
        p1.calculaSalario();

        ProfessorHorista p2 = new ProfessorHorista("Bruno", 5874, 85, 40, 30);
        p2.calculaSalario();
    }
}
