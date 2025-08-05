package Enviroment.Items;
import Enviroment.Item;

public class Key extends Item {
    private final String name = "Unknown key";
    private final String description = "It is a key but you don't know to what";

    public String toString(){
        return name + " - " + description;
    }
}
