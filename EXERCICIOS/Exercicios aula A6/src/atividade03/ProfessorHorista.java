package atividade03;

public class ProfessorHorista extends Professor {

    private int totalHoras;
    private double salarioHora;

    public ProfessorHorista(String nome, int matricula, int idade, int totalHoras, double salarioHora) {
        super(nome, matricula, idade);
        this.salarioHora = salarioHora;
        this.totalHoras = totalHoras;
    }

    @Override
    public void calculaSalario() {
        this.salario = getSalarioHora()*getTotalHoras();
        System.out.println("Sario calculado: " + this.getSalario());

    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
}
