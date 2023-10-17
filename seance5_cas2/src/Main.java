import builders.Builder;
import builders.PersonBuilder;
import director.Director;
import model.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bienvenue !\nQuel personnage souhaitez-vous créer ?\n1.Monstre\n2.Mage\n3.Guerrier\nVotre choix : ");
        int choice = scanner.nextInt();
        Builder builder = new PersonBuilder();
        switch(choice) {
            case 1:
                director.constructMonster(builder);
                break;
            case 2:
                director.constructMage(builder);
                break;
            case 3:
                director.constructWarrior(builder);
                break;
        }
        Person person = builder.getResult();
        System.out.print("Votre personnage est de type " + person.getPersonType() + " au nom de " + person.getName() + " étant " + person.getAttribute() + " avec comme arme " + person.getWeapon() + " et comme armure " + person.getArmor());
    }
}
