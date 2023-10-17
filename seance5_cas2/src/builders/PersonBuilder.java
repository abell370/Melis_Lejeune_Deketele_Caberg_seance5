package builders;

import model.*;

public class PersonBuilder implements Builder {
    PersonType personType;
    String name;
    String skinColor;
    String hairColor;
    Armor armor;
    Weapon weapon;
    Attribute attribute;

    @Override
    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    @Override
    public void setAttributes(Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public void setWeapons(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void setArmors(Armor armor) {
        this.armor = armor;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSkinColor(String color) {
        this.skinColor = color;
    }

    @Override
    public void setHairColor(String color) {
        this.hairColor = color;
    }

    @Override
    public Person getResult() {
        return new Person(personType, name, skinColor, hairColor, armor, weapon, attribute);
    }
}