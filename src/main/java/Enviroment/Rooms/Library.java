package Enviroment.Rooms;
import Core.World;
import Enviroment.Item;
import Enviroment.Items.Book;
import Enviroment.Room;
import UI.CLI;
import java.util.ArrayList;
import java.util.Random;

public class Library extends Room {
    private Book book = new Book();

    private int id = 1;
    private String name = "Royal library";
    private String description = "The library is giant, with thousands of bookshelves and even more books. You might find something of interest in here!";
    private final int optionNum = 5;

    public void printOptions(){
        CLI.print("[1] Go through beautiful glass doors onto balcony");
        CLI.print("[2] Go down the stairs to get to the main hall");
        CLI.print("[3] Inspect the library");
        CLI.print("[4] Use the oak doors to get to small Knight's hall");
    }
    public void act(int option){
        if(option == 1){
            World.movePlayer(2);
            return;
        }
        if(option == 2){
            World.movePlayer(0);
            return;
        }
        if(option == 3){
            int chance = new Random().nextInt(2);
            if(World.hasBook || chance == 0){
                CLI.print("You haven't found anything");
            }
            else{
                World.addItem(book);
                World.hasBook = true;
                CLI.print("You found a book!");
            }
        }
        if(option == 4){
            World.movePlayer(3);
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