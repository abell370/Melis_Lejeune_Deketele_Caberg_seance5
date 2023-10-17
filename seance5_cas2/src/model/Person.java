package model;

public class Person {
    PersonType personType;
    String name;
    String skinColor;
    String hairColor;
    Armor armor;
    Weapon weapon;
    Attribute attribute;

    public Person(PersonType personType, String name, String skinColor, String hairColor, Armor armor, Weapon weapon, Attribute attribute) {
        this.personType = personType;
        this.name = name;
        this.skinColor = skinColor;
        this.hairColor = hairColor;
        this.armor = armor;
        this.weapon = weapon;
        this.attribute = attribute;
    }

    public PersonType getPersonType() {
        return this.personType;
    }

    public String getName() {
        return this.name;
    }

    public String skinColor() {
        return this.skinColor;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public Armor getArmor() {
        return this.armor;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public Attribute getAttribute() {
        return this.attribute;
    }



}
