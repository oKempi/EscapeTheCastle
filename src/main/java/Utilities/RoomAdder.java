package Utilities;

import Core.World;
import Enviroment.Room;
import Enviroment.Rooms.*;

import java.util.ArrayList;

public class RoomAdder {//purely made for the purpose of adding rooms so the main code does not look messy
    private static final ArrayList<Room> rooms = new ArrayList<>();

    public static void main(String[] args){
        rooms.add(new MainHall());
        rooms.add(new Library());
        rooms.add(new Balcony());
        rooms.add(new KnightsHallSmall());
        rooms.add(new KnightsHallBig());
        rooms.add(new SecretCorridor());
        rooms.add(new Laboratory());
        rooms.add(new Kitchen());
        rooms.add(new RoyalBedroom());
        rooms.add(new DiningRoom());
        rooms.add(new Bathroom());
        rooms.add(new Pantry());
        //dumps them into World.java
        World.addRooms(rooms);
    }
}
