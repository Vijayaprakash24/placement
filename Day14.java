import java.util.Scanner;
// interface Circle1{
//      double pi=3.14;
//     public void calc();
// }

// class Area13 implements Circle1{
//      double r,area;
//      Area13(double r){
//         this.r=r;
        
//      }
//      public void calc(){
//         area=pi*r*r;
//         System.out.println("Area="+area);
//      }
// }

interface Animal1{
    String land="Forest";
    public void result();
}
abstract class Result implements Animal1{
    String ani="Tiger";
    abstract public void result1();
    public void result2(){
        System.out.println("Finished");
    }
}

public class Day14 extends Result {
    public void result(){
        System.out.println("Land="+land);
    }
    public void result1(){
        System.out.println("Animal="+ani);
    }
    public static void main(String[] args) {
        // Area13 obj=new Area13(10);
        // obj.calc();
        // Day14 obj=new Day14();
        // obj.result();
        // obj.result1();
        // obj.result2();

        // String[] arr={"Rainbow","evening","vijay","and","rainbow"};
        String[] arr=new String[3];
        Scanner in =new Scanner(System.in);
        int len=arr.length;
        for(int i=0;i<len;i++){
             arr[i]=in.nextLine();
        }
        System.out.println("Results are:");
         for (int i = 0; i < len; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                char ch = arr[i].toLowerCase().charAt(j);
                if (ch == 'r' || ch == 'e' || ch == 'v') {
                    System.out.println(arr[i]);
                    break;
                }
            }
           
        }
    }
}
