import java.util.Scanner;
// class Animals{
//     protected String a;
//     Animals(String a){
//         this.a=a;
//     }
// }

// class Fruits extends Animals{
//     String b;
//     Fruits(String a,String b){
//         super(a);
//         this.b=b;
//     }
// }

// class Area{
//     protected int r;
//     Area(int r){
//         this.r=r;
//     }
// }

// class Circle extends Area{
//     double pie=3.14;
//     Circle(int r){
//         super(r);
       
//     }
// }

// class Rectangel extends Area{
//     int l,w;
//     Rectangel(int l,int w,int r){
//         super(r);
//         this.l=l;
//         this.w=w;
//     }
// }

// class Square extends Area{
//     Square(int a){
//         super(a);
//     }
// }

// class A5{
//     int a;
//     A5(){
//         a=0;
//     }
//     public void get(int a){
//         // Scanner in=new Scanner(System.in);
//         // a=in.nextInt();
//         System.out.println("A="+" "+a);
//     }
// }

class Area{
    double r;
    public void get(int r){
        this.r=r;
    }
    public void calc(){
        double area=3.14*r*r;
        System.out.println("Area="+area);
    }
}


public class Sample12 extends Area{

//     int b;
//     Sample12(){
//         super();
//         b=0;
//     }
    
//     public void get(){
//         super.get(5);
//         Scanner in=new Scanner(System.in);
//         b=in.nextInt();
//         System.out.println("B="+" "+b);
//     }
    //    public void print1(Fruits obj){
    //     System.out.println(obj.a+" "+obj.b);
    //    }

    // public void printarea(Circle obj){
    //     System.out.println(obj.pie*obj.r*obj.r);
    // }

    //  public void printrecarea(Rectangel obj){
    //     System.out.println(obj.l*obj.w);
    // }
    //  public void printsqr(Square obj){
    //     System.out.println(obj.r*obj.r);
    // }

    // double peri;
    // protected void calc(){
    //     peri=2*3.14*r;
    //     System.out.println("Permeter="+peri);
    // }

    public static void main(String[] args) {

        // Fruits obj=new Fruits("Hours", "Apple");
        // Sample12 obj1=new Sample12();
        // obj1.print1(obj);

        // Circle obj=new Circle(12);
        // Rectangel obj2=new Rectangel(2, 4,12);
        // Square obj3=new Square(12);
        // Sample12 obj1=new Sample12();
        // obj1.printarea(obj);
        // obj1.printrecarea(obj2);
        // obj1.printsqr(obj3);
        // Sample12 obj=new Sample12();
        // obj.get();
        // Area obj=new Area();
        // obj.get(3);
        // obj.calc();
        // obj=new Sample12();
        // obj.get(4);
        // obj.calc();
        
        
    }
}
