package atividade03;

public class ProfessorDE extends Professor {
    public ProfessorDE(String nome, int matricula, int idade, double sal) {
        super(nome, matricula, idade);
        this.salario = sal;
    }

    @Override
    public void calculaSalario() {
        this.salario = this.salario*2;
        System.out.println("Salario calculado é: " + this.getSalario());
    }
}
