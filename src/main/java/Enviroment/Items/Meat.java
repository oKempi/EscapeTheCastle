package Enviroment.Items;
import Enviroment.Item;

public class Meat extends Item {
    private final String name = "A piece of meat";
    private final String description = "Just a big piece of quality meat";

    public String toString(){
        return name + " - " + description;
    }
}
