package A2;

public class Fish extends Pets{
    //atributos
    String cor;

    //constructor
    public Fish(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    //metodos

    void nadar(){
        System.out.println(nome + ", o peixinho " + cor + " está nadando");
    }

    //sobrescrevendo um método
    @Override
    void dormir(){
        System.out.println(nome + " dorme de olho aberto, por que é um peixe.");
    }

    void infoFish(){
        System.out.println("Informações do peixe " + nome + ": \n Nome: " + nome + "\n Sua cor é: "+cor+"\n Idade: "+ idade);
    }
}
