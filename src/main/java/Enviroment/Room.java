package Enviroment;
import UI.CLI;
import java.util.ArrayList;

public class Room {
    protected int id; //mostly for me to know where to move the player xD
    protected String name;
    protected String description;
    protected ArrayList<Item> items = new ArrayList<>();
    protected int optionNum;

    public void print(){
        CLI.print("You are in " + name);
        CLI.print(description);
    }
    public void printOptions(){}
    public void act(int option){}
    public int getOptionNum(){return optionNum;}
}
