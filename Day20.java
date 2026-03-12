import java.util.Scanner;

class Day20{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // int n=in.nextInt();
        // int temp=n;
        // int sum=0;
        // while(temp!=0){
        //     int d=temp%10;
        //     sum+=d;
        //     temp=temp/10;
        // }
        // if(n%sum==0){
        //     System.out.println("Good Number");
        // }else{
        //     System.out.println("Bad Number");
        // }

        int[] arr=new int[6];
        int index=0;
        System.out.println("Enter the Numbers:");
        for(int i=0;i<arr.length;i++){
              arr[i]=in.nextInt();
        }

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=0){
        //         arr[index]=arr[i];
        //         index++;
        //     }

        // }

        // for(int i=index;i<arr.length;i++){
        //     arr[i]=0;
        // }

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        for(int i=0;i<arr.length;i++){
          int count=0;
            for(int j=0;j<arr.length;j++){
               if(arr[i]==arr[j]){
                count++;
               }   
            }
            if(count==1){
                 System.out.println(arr[i]);
               }
        
        }

        //  System.out.println("Enter the nmber:");
        // int n=in.nextInt();
        // int[] temp=new int[n];
        // for(int i=0;i<n;i++){
        //      temp[i]=arr[i];
        // }
        // int l=n;
        // for(int i=0;i<arr.length-n;i++){
        //     arr[i]=arr[l];
        //     l++;
        // }
        // System.out.println(temp[0]);
        // int j=0;
        // for(int i=arr.length-n;i<arr.length;i++){
        //     arr[i]=temp[j];
        //     j++;
        // }

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        
        

        
    }
}