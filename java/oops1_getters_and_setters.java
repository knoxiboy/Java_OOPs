package CodeWithHarry.java;

class Emp{
    private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }

    public void setId(int i){
        id = i;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return this.id;
    }
}

public class oops1_getters_and_setters {
    public static void main(String[] args) {
        Emp E1 = new Emp();
        Emp E2 = new Emp();

        E1.setId(123456);
        E1.setName("Karan");

        E2.setId(1234);
        E2.setName("Harry");

        System.out.println(E1.getId());
        System.out.println(E2.getName());
    }
}
