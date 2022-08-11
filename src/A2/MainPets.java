package A2;

public class MainPets {
    public static void main(String[] args) {

        //gatos:
        Cat gato1 = new Cat("Mingau", 2, "3 quilos");
        Cat gato2 = new Cat("Lary", 1, "4 quilos");
        Cat gato3 = new Cat("Frajola", 7, "10 quilos");

        //cachorros:
        Dog cachorro1 = new Dog("Bilu", 5, "comprido");
        Dog cachorro2 = new Dog("Fred", 3, "curto");
        Dog cachorro3 = new Dog("Lola Bolota", 8, "cacheado");

        //peixe:
        Fish peixe1 = new Fish("Gary", 4, "dourado");
        Fish peixe2 = new Fish("Capitão Bolhas", 2, "roxo");
        Fish peixe3 = new Fish("Mr. Sandman", 12, "rosa");

        //infoPets:
        gato1.infoCat();
        gato2.infoCat();
        gato3.infoCat();

        cachorro1.infoDog();
        cachorro2.infoDog();
        cachorro3.infoDog();

        peixe1.infoFish();
        peixe2.infoFish();
        peixe3.infoFish();

        //ações:
        gato1.comer();
        gato2.miar();
        gato3.brincar(peixe2);

        cachorro1.dormir();
        cachorro2.latir();
        cachorro3.correr(gato2);

        peixe1.dormir();
        peixe2.nadar();
        peixe3.comer();

    }
}
