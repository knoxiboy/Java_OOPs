package CodeWithHarry.java;

class Cylinder{
    private int radius, height;

    public void setRadius(int r){
        this.radius = r;
    }
    public void setHeight(int h){
        this.height = h;
    }

    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }

    public void surfaceArea(){
        System.out.println("Surface Area = " + 2*3.14*height*radius);
    }
    public void volume(){
        System.out.println("Volume = " + 3.14*height*radius*radius);
    }

    public Cylinder(int r, int h){        //constructor
        radius = r;
        height = h;
    }
}

public class oops2_constructor {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(21, 87);

        //c1.setRadius(10);
        //c1.setHeight(40);

        System.out.println("height = " + c1.getHeight());
        System.out.println("radius = " + c1.getRadius());

        c1.surfaceArea();
        c1.volume();
    }
}
