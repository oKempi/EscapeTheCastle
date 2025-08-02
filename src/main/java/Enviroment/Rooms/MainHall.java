package Enviroment.Rooms;
import Core.World;
import Enviroment.Room;
import UI.CLI;

public class MainHall extends Room{
    private int id = 0;
    private String name = "Main hall";
    private String description = "The room is quite big with wooden doors leading to the angry mob outside, they might burst in at any time.";
    private final int optionNum = 4;

    public void printOptions(){
        CLI.print("[1] Go outside and try to calm the angry mob down");
        CLI.print("[2] Use the stairs to go to the library");
        CLI.print("[3] Go to the big knight's hall");
    }
    public void act(int option){
        if(option == 1){
            World.cause = "you opened the door to go and calm the angry mob down. Instead they they immediately pierced you with pitchforks and other farming equipment...";
            World.movePlayer(-1);
            return;
        }
        if(option == 2){
            World.movePlayer(1);
            return;
        }
        if(option == 3){
            World.movePlayer(4);
        }
    }
    public void print(){
        CLI.print("You are at the " + name);
        CLI.print(description);
    }
    public int getOptionNum(){
        return optionNum;
    }
}
