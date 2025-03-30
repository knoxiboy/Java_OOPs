package CodeWithHarry.java;

class myThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 100){
            System.out.println("Good morning");
            i++;
        }
    }
}

class myThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 100){
            System.out.println("Welcome");
            i++;
        }
    }
}

public class oops15_practice {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}