public class Main {
    public static void main(String[] args) throws Exception {
       SUV fortuner=new SUV("fortuner", false);
       fortuner.move(40,0);
       //fortuner.accelerate(20);
       fortuner.accelerate(-40);
      System.out.println("Current Gear :"+fortuner.getCurrentgear());
      System.out.println("Current speed :"+fortuner.getcurrentspeed());
    }
}
