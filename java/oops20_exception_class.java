package CodeWithHarry.java;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}

public class oops20_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a > 125){
            try{
                //throw new ArithmeticException("This is an exception");  ---> throw keyword
                // throw new MyException();
                throw new MaxAgeException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                // e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
