public class Vehicle {
    private String name;
    private int currentspeed;
    private int currentdirection;

    public Vehicle(String name2) {
        //TODO Auto-generated constructor stub
    }
    public void Vehicle(String name) {
        this.name = name;
        this.currentspeed=0;
        this.currentdirection=0;
    }
    public void stop()
    {
        this.currentspeed=0;
        System.out.println("vehicle is stoped");
    }
    public void steer(int a)
    {
        this.currentdirection=currentdirection+a;
        System.out.print("steer method called: steering at "+currentdirection+" degrees");
    }
    public void move(int speed,int direction)
    {
        currentspeed=speed;
        currentdirection=direction;
        System.out.println("move method called: moving at "+currentspeed+" in direction "+currentdirection);
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public void setcurrentdirection(int currentdirection)
    {
        this.currentdirection=currentdirection;
    }
    public int getcurrentdirection()
    {
        return currentdirection;
    }
    public void setcurrentspeed(int currentspeed)
    {
        this.currentspeed=currentspeed;
    }
    public int getcurrentspeed()
    {
        return currentspeed;
    }
    
}
