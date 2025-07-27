package Enviroment.Rooms;
import Core.World;
import Enviroment.Room;
import UI.CLI;

public class MainHall extends Room{
    private int id = 0;
    protected String name = "main entrance";
    protected String description = "The room is quite big with wooden doors leading to the angry mob outside, they might burst in at any time.";

    public void printOptions(){
        CLI.print("[1] Go outside and try to calm the angry mob down");
        CLI.print("[2] Use the stairs to go to the library");
        CLI.print("[3] Go to the knight's hall");
    }
    public void act(int option){
        if(option == 1){
            World.movePlayer(0);
        }
        if(option == 2){
            World.movePlayer(1);
        }
        if(option == 3){
            World.movePlayer(2);
        }
    }
    public void print(){
        CLI.print("You are at the " + name);
        CLI.print(description);
    }
}
