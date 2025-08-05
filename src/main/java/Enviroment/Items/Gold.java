package Enviroment.Items;
import Enviroment.Item;

public class Gold extends Item {
    private final String name = "Lumps of gold";
    private final String description = "Many big lumps of gold";

    public String toString(){
        return name + " - " + description;
    }
}
