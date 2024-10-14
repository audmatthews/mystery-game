//Room 1 = Sunroom
//Room 2 = Living Room
//Room 3 = Hidden Room
//Room 4 = Bathroom
//Room 5 = Hall
//Room 6 = Study
//Room 7 = Bedroom
//Room 8 = Entrance
//Room 9 = Attic

public class RoomCollection {

    private static String[] args;
    public void addRoom(String ename, String edesc, int eroom) {
        Room newRoom = new Room(ename, edesc, eroom);
    }

//in items class this is initilized in thingamabob class
    //but the problem is i dont think the rooms is just another item
    //how can we make it so that the rooms holds the Title of the room
    //the descripiton, and all of the items that are (at the start of the game at least)
    //inside of the room, that way we can access them

    //do we need to make every room an individual class (i dont want to do that)
    //is there some other kind of workaround?
    //i literally just dont know what we need to do for rooms i just know what i want them to do
    //rooms need to store the items that are in it.

    //maybe we can all just call different things in the gui? but this also seems like a lot of extra work

    public static void Roomz (String [] args) {
        RoomCollection roomCollection = new RoomCollection();


        roomCollection.addRoom("Sunroom", "From the floor to the ceiling, beautiful exotic flowers, trees, and plants are thriving.", 0);
        roomCollection.addRoom("Living Room", "This room contains all the people that were invited to the party. Sofas, chairs, and tables are scattered throughout with trash strewn about from the night before.", 1);
        roomCollection.addRoom("Hidden Room", "Behind the bookshelf, this room unveils the hidden item, the priceless diamond ring.", 2);
        roomCollection.addRoom("Bathroom", "A glamorous bathroom with a deep porcelain bath and granite tiled shower. On the edge of the counter is crumpled up tissue that might be worth looking at.", 3);
        roomCollection.addRoom("Hall", "This gives access to the many rooms of the house.", 4);
        roomCollection.addRoom("Study", "Along the walls around large bookshelves, filled with books from all over the world. A desk in the corner has a book left open to an image that is somewhat familiar.", 5);
        roomCollection.addRoom("Bedroom", "This was Grammy's bedroom, containing extravagant bedding, curtains, and a wall-length mirror as well as a portrait of herself above the fireplace.", 6);
        roomCollection.addRoom("Entrance", "This is where the entrance of the house begins and on a coat rack contains a ripped up letter that isn't familiar.", 7);
        roomCollection.addRoom("Attic", "A dusty old attic, dark and full of objects covered with blankets.", 8);

    }
}

class Room {
    private String name;
    private String description;
    private int roomNumber;
    
    
    public Room(String ename, String edescr, int eroom) {
        this.name = ename;
        this.description = edescr;
        this.roomNumber = eroom;
    }
    public String toString()
    {
        String allinfo = "Name:" + ename + "\n";
        allinfo += "Description:" + edescr + "\n";
        allinfo += "Room Number:" + eroom;

        return allinfo;
    }
}

