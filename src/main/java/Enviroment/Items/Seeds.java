package Enviroment.Items;
import Enviroment.Item;

public class Seeds extends Item {
    private final String name = "A handful of seeds";
    private final String description = "A handful of seeds, might be useful";

    public String toString(){
        return name + " - " + description;
    }
}
