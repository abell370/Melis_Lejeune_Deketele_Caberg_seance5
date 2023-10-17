package director;

import builders.Builder;
import model.Armor;
import model.Attribute;
import model.PersonType;
import model.Weapon;

import java.util.Scanner;

public class Director {

    public void constructMage(Builder builder) {
        builder.setPersonType(PersonType.MAGE);
        setCommonAttributes(builder);
        builder.setWeapons(Weapon.POUVOIRS);
        builder.setArmors(Armor.COTTE);
        builder.setAttributes(Attribute.SAVOIR);
    }

    public void constructWarrior(Builder builder) {
        builder.setPersonType(PersonType.GUERRIER);
        setCommonAttributes(builder);
        builder.setWeapons(Weapon.EPEE);
        builder.setArmors(Armor.BOUCLIER);
        builder.setAttributes(Attribute.FORCE);
    }

    public void constructMonster(Builder builder) {
        builder.setPersonType(PersonType.MONSTRE);
        setCommonAttributes(builder);
        builder.setWeapons(Weapon.LANCE);
        builder.setArmors(Armor.CASQUE);
        builder.setAttributes(Attribute.AGILITE);
    }

    private void setCommonAttributes(Builder builder) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nom : ");
        builder.setName(scanner.next());
        System.out.print("Couleur de peau : ");
        builder.setSkinColor(scanner.next());
        System.out.print("Couleur de cheveux : ");
        builder.setHairColor(scanner.next());
    }
}
