 public class Items 
 {
    protected String name;
    protected String desc;
    protected int room;

    public Items(String ename, String edesc, int eroom)
    {
        this.name=ename;
        this.desc=edesc;
        this.room=eroom;
    }
    
    public String toString()
    {
        String allinfo = "Name:" + name + "\n";
        allinfo += "Description:" + desc + "\n";
        allinfo += "Room Number:" + room;
        
        return allinfo;
    }
}
