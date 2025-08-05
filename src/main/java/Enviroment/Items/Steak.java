package Enviroment.Items;
import Enviroment.Item;

public class Steak extends Item {
    private final String name = "Steak";
    private final String description = "A big piece of salted, medium steak";

    public String toString(){
        return name + " - " + description;
    }
}
