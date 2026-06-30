import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class T15{
    // static void printList(ArrayList<Integer> curr){
    //     System.out.print("[");
    //     for(int i=0;i<curr.size();i++){
    //         System.out.print(curr.get(i));
    //         if(i!=curr.size()-1){
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.print("]");
    // }
    // static void generate(int[] arr,int index,ArrayList<Integer> curr){
    //     printList(curr);
    //     System.out.println();
    //     for(int i=index;i<arr.length;i++){
    //         curr.add(arr[i]);
    //         generate(arr,i+1,curr);
    //         curr.remove(curr.size()-1);
    //     }
    // }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        // int n=in.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=in.nextInt();

        // }
        // generate(arr, 0, new ArrayList<>());
        String s1=in.nextLine();
        String s2=in.nextLine();
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[n+1][m+1];
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(s1.charAt(i-1)==s2.charAt(j-1)){
        //             dp[i][j]=1+dp[i-1][j-1];
        //         }else{
        //             dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        //         }
        //     }
        // }
        System.out.println(dp[n][m]);
        int maxlength=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    maxlength=Math.max(maxlength,dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        System.out.println(maxlength);
    }
}