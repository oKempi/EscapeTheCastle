package Enviroment.Rooms;
import Core.World;
import Enviroment.Items.Key;
import Enviroment.Room;
import UI.CLI;

public class RoyalBedroom extends Room {
    private int id = 8;
    private String name = "Royal bedroom";
    private String description = "There is a giant bed on the far side of the room with doors leading somewhere next to it.";
    private final int optionNum = 3;
    private Boolean murderKilled = false;

    public void printOptions(){
        CLI.print("[1] Go through the doors");
        CLI.print("[2] Go back to the small knight's hall");
    }

    public void act(int option){
        if(option == 1){
            World.movePlayer(10);
        }
        if(option == 2){
            World.movePlayer(3);
        }
        if(option == 3){
            return;
        }
    }

    public void print(){
        CLI.print("You are at the " + name);
        CLI.print(description);
        if (!World.hasSword) {
            World.gameOver = true;
            World.movePlayer(-1);
            World.cause = "Because you didn't have sword the murderer killed you!";
        }
        else if (!murderKilled) {
            CLI.print("There was a murderer behind the door which you couldn't have foreseen.\nThankfully you had had a sword and had scared him so he gave up.\nYou let him be and gave you a key as a gift for your mercy.");
            World.addItem(new Key());
        }
    }

    public int getOptionNum(){
        return optionNum;
    }
}