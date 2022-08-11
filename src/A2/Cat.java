package A2;

public class Cat extends Pets{
    //atributos
    String peso;

    //constructor
    public Cat(String nome, int idade, String peso) {
        super(nome, idade);
        this.peso = peso;
    }


    //metodos
    void miar(){
        System.out.println("O gato " + nome + " está miando");
    }

    void brincar(Fish fish){
        System.out.println("O gato " + nome + " está brincando com peixinho "  + fish.cor);
    }

    void infoCat(){
        System.out.println("Informações do gato " + nome + ": \n Nome: " + nome + "\n Peso: "+peso+"\n Idade: "+ idade);
    }

}
