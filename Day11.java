import java.util.Scanner;

class Main{
    // double area,r;
    // public void getdata(){
    //     Scanner in=new Scanner(System.in);
    //     System.out.println("Enter r:");
    //     r=in.nextDouble();
    // }
    // public void calc(){
    //     area=3.14*r*r;
    //     System.out.println("Area= "+area);
    // }

    //  double area,r;
    // private void getdata(){
    //     Scanner in=new Scanner(System.in);
    //     System.out.println("Enter r:");
    //     r=in.nextDouble();
    // }
    // public void calc(){
    //     getdata();
    //     area=3.14*r*r;
    //     System.out.println("Area= "+area);
    // }

    // private int a,b,c;
    // public void setter(int x,int y){
    //     this.a=a;
    //     this.b=b;
    // }
    // public int get_a(){
    //     return a;
    // }
    // public int get_b(){
    //     return b;
    // }
    // public void disp(){
    //     c=a+b;
    //     System.out.println(c);
    // }

    int n,fact;
    double n1;
     Main(){
       fact=1;
       n=5;
    }
    Main(int n){
       fact=1;
       this.n=n;
    }
    Main(int n,int fact){
       this.fact=fact;
       this.n=n;
    }
     Main(double n,int fact){
       this.fact=fact;
       this.n1=n;
    }
    public void calc(){
        System.out.println(fact+" "+n);
    }
    public void calc1(){
        System.out.println(fact+" "+n1);
    }
    // public void calc(){
    //     for(int i=1;i<=n;i++){
    //         fact*=i;
    //     }
    //     System.out.println("Factorial="+fact);
    // }
}


public class Day11 {
    // static String college="HICET";
    // String name;
    // static int count =0;
    // Day11(String name){
    //     this.name=name;
    //     count+=1;
    // }
    static int count;
    static{
        System.out.println("Static initialized.");
        count=0;
    }
    Day11(){
        count+=1;
    }

    public static void disp(){
        // System.out.println(name+"Studies@"+college);
        System.out.println(Day11.count);
     
    }

    public static void main(String[] args) {
    //     int a=5;
    //      Main obj=new Main();
    //      obj.calc();
    //    Main obj1=new Main(5);
    //    obj1.calc();
    //    Main obj2=new Main(5,10);
    //    obj2.calc();
    //    Main obj3=new Main(5.5,10);
    //    obj3.calc1();
    //    obj.setter(5, 10);
    //    System.out.println("A="+obj.get_a());
    //    System.out.println("B="+obj.get_b());
    //    obj.disp();
  System.out.println("Driver class started");
    Day11 obj=new Day11();
         
    // new Day11("s");
    // new Day11("j");
    Day11.disp();
    
  
    


    }
    
}
