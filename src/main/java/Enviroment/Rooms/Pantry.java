package Enviroment.Rooms;
import Core.World;
import Enviroment.Items.Salt;
import Enviroment.Room;
import UI.CLI;

public class Pantry extends Room {
    private int id = 7;
    private String name = "Pantry";
    private String description = "For the pantry being a royal one, it is small with barely enough supplies.";
    private final int optionNum = 3;

    public void printOptions(){
        CLI.print("[1] Go back to the kitchen");
        CLI.print("[2] Look around");
    }
    public void act(int option){
        if (option == 1){
            World.movePlayer(7);
        }
        else if (option == 2){
            World.addItem(new Salt());
        }
    }
    public void print(){
        CLI.print("You are in " + name);
        CLI.print(description);
    }
    public int getOptionNum(){
        return optionNum;
    }
}
