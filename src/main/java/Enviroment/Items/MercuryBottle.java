package Enviroment.Items;
import Enviroment.Item;

public class MercuryBottle extends Item{
    protected String name = "Bottle with a liquid";
    protected String description = "A heavy, relative to its size, bottle of some metallic, silver coloured liquid";

    public String toString(){
        return name + " - " + description;
    }
}
