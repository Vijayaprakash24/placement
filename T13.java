import java.util.*;
class T13{
    static void pri(int num){
        if(num==0) return;
        System.out.print(num+" ");
        pri(num-1);
    }
    public static void main(String[] args) {
        // Scanner in=new Scanner(System.in);
        // // System.out.println("Enter the number of activities");
        // int n=4;
        // // int[] start=new int[n];
        // // int[] end=new int[n];
        // int[] start={1,3,2,6};
        // int[] end={2,5,6,9};
        // // System.out.println("Enter the Start and End time:");
        // // for(int i=0;i<n;i++){
        // //     start[i]=in.nextInt();
        // //     end[i]=in.nextInt();
        // // }
        // int lastend=end[0];
        // int  count=1;
        // for(int i=1;i<n;i++){
        //     if(start[i]>=lastend){
        //         count++;
        //         lastend=end[i];
        //     }
        // }
        // System.out.println("Max Activities is: "+count);
        // int[] start={1,3,4,9};
        // int[] end={2,4,5,10};
        // int n=4;
        // int count=1;
        // int lastend=end[0];
        // for(int i=1;i<n;i++){
        //     if(start[i]>=lastend){count++;
        //     lastend=end[i];}
        // }
        // System.out.println("Max Activities:"+count);
        pri(99);
    }
}