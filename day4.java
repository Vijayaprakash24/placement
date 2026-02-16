import java.util.Scanner;

public class day4{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(1+" ");
        //     }
        //     System.out.println("");
        // }
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println("");
        // }
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");
        // }
        // int sum=0;
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         sum=sum+1;
        //         System.out.print(sum+" ");
        //     }
        //     System.out.println("");
        // }

        // int num=9;
        // for(int i=1;i<5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num);  
        //     }
        //     System.out.print(" ");
        // }

        // int sum=0;
        // for(int i=1;i<5;i++){
        //     int num=0;
        //     for(int j=1;j<=i;j++){
        //         num*=10;
        //         num=num+9;
        //     }
        //     sum+=num;
        // }
        // System.out.print(sum);
 
        // int n=4;
        // for(int i=1;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         System.out.print(" ");
        //     }for(int k=1;k<=(2*i)-1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=n;j>i;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=(2*i)-1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        // int n=4;
        // for(int i=1;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print(k);
        //     }for(int l=i-1;l>=1;l--){
        //         System.out.print(l);
        //     }
        //     System.out.println(" ");
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=n;j>i;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print(k);
        //     }for(int l=i-1;l>=1;l--){
        //         System.out.print(l);
        //     }
        //     System.out.println(" ");
        // }

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     if(i==1 || i==5){
        //         for(int j=1;j<=n;j++){
        //             System.out.print("#"+" ");
        //         }
        //     }else{
        //         System.out.print("#");
        //         for(int k=1;k<n;k++){
        //             System.out.print(" "+" ");
        //         }
        //         System.out.print("#");
        //     }
        //     System.out.println(" ");
        // }

         int n=4;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
}