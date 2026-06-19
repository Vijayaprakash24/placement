import java.io.FileReader;
import java.util.*;
class T9{
    static void mark(int mark){
        if(mark<90||mark>100){
            throw new ArithmeticException("Invalid Mark and Mark should be 90 - 100.");
        }
        System.out.println("Pass");
    }

     static void age(int age){
        if(age<23||age>27){
            throw new ArithmeticException("Invalid Age");
        }
        System.out.println(age);
    }

    static void atm(double amount,double ramount){
        if(amount<ramount){
            throw new RuntimeException("Invalid Balance");
        }
        System.out.println("Successfully Withdrawal"+" "+ramount+" "+"Remaining Balance:"+" "+(amount-ramount));
    }
    public static void main(String[] args) {
        // int a=10;
        // int b=0;
        // // int b=10;33
        // try{
        //     System.out.println(a/b);
        // }catch(Exception e){
        //     System.out.println(e.getClass().getSimpleName());
        // }finally{
        //     System.out.println("Executed.");
        // }
        // int[] arr={1,2,3,4,5};
        // try{
        //     System.out.println(arr[9]);
        // }catch(Exception e){
        //     System.out.println(e.getClass().getSimpleName());
        // }finally{
        //     System.out.println("Executed.");
        // }
        // Scanner in=new Scanner(System.in);
        // try{
        //     int d=in.nextInt();
        //     System.out.println(d);
        // }catch(Exception e){
        //     System.out.println(e.getClass().getSimpleName());
        // }finally{
        //     System.out.println("Executed.");
        // }
        // mark(89);
        // age(27);
        // try{
        //     FileReader file=new FileReader("./Day18.java");

        //     // int character;
        //     // while ((character = file.read()) != -1) {
        //     //     System.out.print((char) character);
        //     // }
        // }catch(Exception e){
        //     System.out.println(e.getClass().getSimpleName());
        // }finally{
        //     System.out.println("File Read");
        // }
        Scanner in=new Scanner(System.in);
        double balance=8000;
        try{
        atm(balance,in.nextDouble());
        }catch(Exception e){
            System.out.println(e.getClass().getSimpleName());
        }
    }
}