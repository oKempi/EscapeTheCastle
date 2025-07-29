package Enviroment.Items;
import Enviroment.Item;

public class Book extends Item {
    private final String name = "An alchemy book";
    private final String description = "It says something about making gold from mercury and silver on an alchemy table.";

    public String toString(){
        return name + " - " + description;
    }
}
