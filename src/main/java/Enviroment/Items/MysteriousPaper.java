package Enviroment.Items;

import Enviroment.Item;

public class MysteriousPaper extends Item{
    private String name = "Mysterious paper";
    private String description = "A paper that says: 'An old King whom loved all sciences had himself made a machine.\nThis machine could give something of use to anyone who was able to provide any money!'";
    //reference to Rudolf II.

    public String toString(){
        return name + " - " + description;
    }
}
