package Enviroment.Items;
import Enviroment.Item;

public class Coin extends Item {
    private final String name = "A silver coin";
    private final String description = "Just a silver coin with seemingly no use.";

    public String toString(){
        return name + " - " + description;
    }
}
