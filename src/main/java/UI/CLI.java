package UI;

import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);
    public static void print(String text){
        System.out.println(text);
    }

    public static int getInput(){
        int x = 0;
        boolean isError = false;
        do {
            try {
                isError = false;
                x = Integer.parseInt(scanner.nextLine());
            } catch (Exception e){
                isError = true;
                err("Illegal input. Try again!");
            }
        } while (isError);
        return x;
    }

	public static int getInput(int mode){
		int x = 0;
        boolean isError = false;
		if(mode < 0 || mode == 0 || mode > 0){
			do {
            	try {
                	isError = false;
                	x = Integer.parseInt(scanner.nextLine());
            	} catch (Exception e){
                	isError = true;
                	err("Illegal input. Try again!");
            	}
        	} while (isError || x == 0);
        	return x
		}
	}

    public static void err(String message){
        print("[!]Error: " + message);
    }
}
