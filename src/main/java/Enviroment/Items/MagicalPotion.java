package Enviroment.Items;
import Enviroment.Item;

public class MagicalPotion extends Item {
    private String name = "Potion";
    private String description = "A bottle with some magical potion, try and drink it in the laboratory!"; //TODO maybe right after creating it, end the game by winning

    public String toString(){
        return name + " - " + description;
    }
}
