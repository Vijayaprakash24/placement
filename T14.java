import java.util.*;

class T14{
    static int climb(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        // int a=1;
        // int b=2;
        // for(int i=3;i<=n;i++){
        //     int temp=b;
        //     b=a+b;
        //     a=temp;
        // }
        // return b;
        return climb(n-1)+climb(n-2);
    }
    static int fib(int n){
        int[] arr3=new int[n+1];
        arr3[0]=0;
        arr3[1]=1;
        for(int i=2;i<=n;i++){
            arr3[i]=arr3[i-1]+arr3[i-2];
        }
        return arr3[n];
    }
        static int fib1(){
        int n=6;
        int[] arr3=new int[n+1];
        arr3[0]=0;
        arr3[1]=1;
        for(int i=2;i<=n;i++){
            arr3[i]=arr3[i-1]+arr3[i-2];
        }
        return arr3[n];
    }
 public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    // System.out.println(climb(4));
    System.out.println(fib1());
    System.out.println(fib(in.nextInt()));
 }
}