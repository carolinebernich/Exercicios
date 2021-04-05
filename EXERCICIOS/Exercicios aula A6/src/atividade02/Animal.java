package atividade02;

//uma classe abstrata nao pode ser instaciada;
public abstract class Animal {

    //protected faz com que subclasses tenham acesso aos atributos da superclasse
    protected String nome;
    protected String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void respirar(){
        System.out.println("Respirando");
    }

    public void fazerBarulho(){
        System.out.println("Fazendo barulho");
    }
}
