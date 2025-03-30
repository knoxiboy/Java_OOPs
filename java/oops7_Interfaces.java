package CodeWithHarry.java;

interface Bicycle{ 
    int a = 45;
    void  apply_brake(int decrement); 
    void  speed_up(int increment);
}

interface HornBicycle{
    int x = 45;
    void blow_Horn_K3g();
    void blow_Horn_mhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    int speed = 7 ;

    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }

    public void apply_brake(int decrement){
        System.out.println("Applying Brake");
        speed = speed - decrement;
    }

    public void speed_up(int increment){
        System.out.println("Applying SpeedUP");
        speed = speed + increment; 
    }

    public void blow_Horn_K3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }

    public void blow_Horn_mhn(){
        System.out.println("Main hoon naa po po po po");
    }
}

public class oops7_Interfaces{
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.apply_brake(1);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454; error
        // System.out.println(cycleHarry.a);

        cycleHarry.blow_Horn_K3g();
        cycleHarry.blow_Horn_mhn();
        System.out.println(cycleHarry.speed);
    }
}

