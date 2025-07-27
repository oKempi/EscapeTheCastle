package Enviroment;
import UI.CLI;
import java.util.ArrayList;

public class Room {
    protected int id;
    protected String name;
    protected String description;
    protected ArrayList<Item> items = new ArrayList<>();

    public int getID(){
        return id;
    }
    public void print(){
        CLI.print("You are in " + name);
        CLI.print(description);
    }
    public void printOptions(){}
    public void act(int option){}
}
