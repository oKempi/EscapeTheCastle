package Enviroment.Rooms;
import Core.World;
import Enviroment.Item;
import Enviroment.Items.Book;
import Enviroment.Room;
import UI.CLI;
import Utilities.RoomAdder;

import java.util.ArrayList;
import java.util.Random;

public class Library extends Room {
    private Book book = new Book();

    private int id = 1;
    private String name = "Royal library";
    private String description = "The library is giant, with thousands of bookshelves and even more books. You might find something of interest in here!";
    private ArrayList<Item> items = new ArrayList<Item>(){{add(book);}};

    public void printOptions(){
        CLI.print("[1] Go through beautiful glass doors onto balcony");
        CLI.print("[2] Go down the stairs to get to the main hall");
        CLI.print("[3] Inspect the library"); //like 50/50 chance to find the book
    }
    public void act(int option){
        if(option == 1){
            World.movePlayer(3);
        }
        if(option == 2){
            World.movePlayer(1);
        }
        if(option == 3){
            int chance = new Random().nextInt(2);
            if(chance == 1){
                World.addItem(book);
                CLI.print("You found a book!");
            }
            if(chance == 0){
                CLI.print("You haven't found anything");
            }
        }
    }
    public void print(){
        CLI.print("You are in " + name);
        CLI.print(description);
    }
}