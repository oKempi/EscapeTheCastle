package UI;

import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);
    public static void print(String text){
        System.out.println(text);
    }
    public static void printRoom(String name, String description){ //might delete
        print("You are in " + name);
        print(description);
    }
    public static String getInput(){ //TODO maybe add try catch statement for overflowing numbers
        return scanner.nextLine();
    }
    public static void err(String message){
        print("[!]Error: " + message);
    }
}
