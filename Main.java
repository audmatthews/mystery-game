
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //temp user input--> later chances to buttons in gui
        //Scanner input = new Scanner(System.in);
        //System.out.println("which option?: ");
        //String userinfo = input.nextLine();
        //System.out.println("Your choice was:" + userinfo);

        //object gets called
        Thingamabob objref = new Thingamabob();
        System.out.println(objref.book);

    }
}
// Main
//Superclass Obj
//Sub.Obj->Room
//Sub.Obj->Player
//class gui
//
//Super Class Obj {
//	Obj {
//		Name
//		Description }
//	Return obj attributes (programmer defined)
//
//Subclass Room {
//	Room {
//		Name
//		Description}
//	Return Room attributes (programmer defined)
//	{
//	add/delete objects from room}
//  }
//Subclass Player {
//	Player {
//		Name
//		Description}
//	{
//	add/delete objects from room}
//  }
// Main {
// Obj in whole house {
// Book1( “name define”, “desc”);
// Book2( “name define”, “desc”);
// Book3( “name define”, “desc”);
// etc…(name, desc)
// }
////make rooms, objects of room class
//Room newroom =new Room (name, desc);
//Room newroom =new Room (name, desc);
//Room newroom =new Room (name, desc);
//Etc…
//
////addobj to rooms where they start in
//study.addobj(book1);
//study.addobj(book2);
//study.addobj(book3);
//Etc…
//
//
//Idk how to do this exactly but->
//(Study) {
//	Description;
//	{switch
//		Case1-book1
////delete obj from room if interacted (and needed for story or unlocks dialogue, could eventually be all
// objects if you want), add to player inventory
//		Case2-book2
//		Case3-book3
//		Case4-leave} Loop until case 4 selected
//	Option to go to hall or hidden room (if unlocked)
//	//also a switch?
//	}
//Copy and paste basically for other rooms
//
//Npc Dialogue->
//Works by taking obj in user inventory and having x item will unlock a unique player dialogue, which in
// turn makes the npc react differently.
//Ex.
// Player Inventory
//	{obtained.grandmasdiaryobj
//		If (speak w/ kyle)
//{+ dialogue option (“hey why was my grandma writing about you in her diary, that's kinda weird”}
//	}
// Npc Kyle
//	{
//	If player case1→kyle says x
//	If player case2→kyle says y
// Unlocked dialogue w/grandmasdiaryobj dialogue (“hey why…”)-->kyle says (“uhhh dont worry about it haha…”)
// Unlocked dialogue w/otheritem (player says this) → kyle says that
//	Choose to leave loop and go into living room }
// Npc Myrtle{}
// Npc Daisy{pry more complex than the other three}
// Npc Barf {}
