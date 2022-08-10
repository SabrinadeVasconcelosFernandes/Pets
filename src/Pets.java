public class Pets {
    //Atributos
    String nome;
    int idade;
    String tipo;


    //Construtores:

    Pets(){
        System.out.println("Não temos info sobre este pet.");
    }

    Pets(String nome, int idade, String tipo){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    //Métodos:
    void comer(){
        System.out.println(nome + " está comendo a sua comidinha de " + tipo);
    }

    void dormir(){
        System.out.println("O " + tipo + ", " + nome + " está dormindo");
    }

    void miar(){
        System.out.println("O " + nome + " está miando");
    }

    void latir(){
        System.out.println("O " + nome + " está latindo");
    }

    void nadar(){
        System.out.println("O " + tipo + " está nadando");
    }

    void correr(Pets pets){
        System.out.println("O " + nome + " está correndo atras do " + pets.tipo + " " + pets.nome);
    }

    void info(){
        System.out.println("Informações do pet:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo de pet: " + tipo);
    }

    public static void main(String[] args) {
        //criando os objetos:
        Pets gato = new Pets("Floquinho", 5, "gato");
        Pets cachorro = new Pets("Bilú", 7, "cachorro");
        Pets peixe = new Pets("Mr. Sandman", 10, "peixe");
        Pets desconhecido = new Pets();

        //info:
        gato.info();
        cachorro.info();
        peixe.info();

        //gato:
        gato.comer();
        gato.dormir();
        gato.miar();
        gato.correr(peixe);

        //cachorro:
        cachorro.comer();
        cachorro.dormir();
        cachorro.latir();
        cachorro.nadar();
        cachorro.correr(gato);

        //peixe:
        peixe.comer();
        peixe.dormir();
        peixe.nadar();
    }
}
