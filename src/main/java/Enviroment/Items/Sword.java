package Enviroment.Items;
import Enviroment.Item;

public class Sword extends Item {
    private final String name = "A sword";
    private final String description = "Beautiful, light and shiny sword fit for battle";

    public String toString(){
        return name + " - " + description;
    }
}
