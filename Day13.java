abstract class Shape{
    double area;
    double pi;
    abstract public void calc();
    Shape(double area){
        this.pi=area;
        System.out.println(this.pi);
    }
}
class Circle extends Shape{
         int r;
         Circle(int r,double pi){
            super(pi);
            this.r=r;
         }
         public void calc(){
            area=pi*r*r;
            System.out.println("Area="+area);
         }
}
public class Day13  {
    public static void main(String[] args) {
        Circle obj=new Circle(5,3.14);
        obj.calc();
       
        
    }
}
