package A2;

public class Pets {
    //atributos
    String nome;
    int idade;


    //constructor
    public Pets(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //métodos
    void comer(){
        System.out.println(nome + " está comendo a sua comidinha");
    }

    void dormir(){
        System.out.println(nome + " está dormindo");
    }

}
