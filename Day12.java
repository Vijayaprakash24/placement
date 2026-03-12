import java.util.Scanner;

class A{
    int a,b;
    public void getdata(){
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
    }
}


public class Day12 extends A{

    int c;
    public void sum(){
        c=a+b;
        System.out.println("Sum="+c);
    }
    public static void main(String[] args) {
        Day12 obj=new Day12();
        obj.getdata();
        obj.sum();
    }
}