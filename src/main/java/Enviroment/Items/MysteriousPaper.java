package Enviroment.Items;

import Enviroment.Item;

public class MysteriousPaper extends Item{
    private String name = "Mysterious paper";
    private String description = "A paper that says: ''"; //TODO make some cryptic message about the machine

    public String toString(){
        return name + " - " + description;
    }
}
