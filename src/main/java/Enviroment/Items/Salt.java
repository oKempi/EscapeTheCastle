package Enviroment.Items;
import Enviroment.Item;

public class Salt extends Item {
    private final String name = "Salt";
    private final String description = "A bag of salt";

    public String toString(){
        return name + " - " + description;
    }
}
