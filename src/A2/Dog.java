package A2;

public class Dog extends Pets{
    //atributos
    String pelo;

    //constructor
    public Dog(String nome, int idade, String pelo) {
        super(nome, idade);
        this.pelo = pelo;
    }

    //metodos
    void latir(){
        System.out.println("O cachorro " + nome +" tem pelo " + pelo + " e está latindo");
    }

    void correr(Cat cat){
        System.out.println("O cachorro " + nome + " está correndo atras do gato " + cat.nome);
    }

    void infoDog(){
        System.out.println("Informações do cachorro " + nome + ": \n Nome: " + nome + "\n Tipo de pelo: "+pelo+"\n Idade: "+ idade);
    }

}
