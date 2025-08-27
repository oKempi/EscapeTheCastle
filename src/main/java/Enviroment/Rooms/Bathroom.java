package Enviroment.Rooms;
import Core.World;
import Enviroment.Items.Coin;
import Enviroment.Room;
import UI.CLI;

public class Bathroom extends Room{
    private int id = 10;
    private String name = "Bathroom";
    private String description = "Surprisingly ordinary but clean bathroom.";
    private final int optionNum = 3;
    private Boolean murderKilled = false;

    public void printOptions(){
        CLI.print("[1] Go back to the royal bedroom");
        CLI.print("[2] Wash your hands");
    }
    public void act(int option){
        if(option == 1){
            World.movePlayer(8);
            return;
        }
        if(option == 2){
            CLI.print("You washed your hand");
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
            CLI.print("There was a murderer behind the door which you couldn't have foreseen.\nThankfully you had had a sword and had scared him so he gave up.\nYou let him be and gave you a silver coin as a gift for your mercy.");
            World.addItem(new Coin());
        }
    }
    public int getOptionNum(){
        return optionNum;
    }
}
