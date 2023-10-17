package builders;

import model.*;

public interface Builder {

    void setPersonType(PersonType personType);
    void setAttributes(Attribute attribute);
    void setWeapons(Weapon weapon);
    void setArmors(Armor armor);
    void setName(String name);
    void setSkinColor(String color);
    void setHairColor(String color);
    Person getResult();
}
