package Core;
import UI.CLI;
import Utilities.RoomAdder;

public class Gameloop{
    public static void main(String[] args){
        //adds all the rooms
        try{
            RoomAdder.main(args);
        }catch(Exception e){System.out.println("Error while trying to add rooms");System.exit(0);}

        CLI.print("An angry mob just chased you into some castle.");
        CLI.print("You don´t have any idea where you are nor why they were chasing you...");
        CLI.print("Only thing you know is that you want to get out of there before they can get to you!");

        //game starts here
        while(!World.gameOver){
            CLI.print(" ");
            CLI.print(" ");
            CLI.print(" ");
            World.aboutRoom();
            World.printOptions();
            World.actOptions(CLI.getInput());
            if(World.gameEnded){
                CLI.print("You won by " + World.cause);
                CLI.getInput();
                System.exit(0);
            }
            CLI.print("========================");
        }//ends the game
        CLI.print("You lost because");
        CLI.print(World.cause); //hopefully interesting enough 少
        CLI.getInput();
        System.exit(0);
    }
}
