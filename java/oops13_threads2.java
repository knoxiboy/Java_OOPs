package CodeWithHarry.java;

class t1 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i < 40000){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class t2 implements Runnable{
    @Override
    public void run(){
        int j = 0;
        while(j < 40000){
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            j++;
        }
    }
}

public class oops13_threads2{
    public static void main(String[] args) {
        t1 obj1 = new t1(); 
        Thread t = new Thread(obj1); 

        t2 obj2 = new t2();
        Thread tt = new Thread(obj2);

        t.start();
        tt.start();
    }
}
