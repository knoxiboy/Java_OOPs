package CodeWithHarry.java;

class A{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class oops4_method_overriding{
    public static void main(String[] args) {
        A a = new A();
        a.meth1();
        a.meth2();

        B b = new B();
        b.meth1();  //meth1 of A is printed
        b.meth2();  //meth2 of B is printed
        b.meth3();
    }
}
