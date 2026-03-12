import java.util.Scanner;

public class Day16_1 {

    public static int addarray(int[] arr,int k,int position,int size){
      
        for(int i=size-1;i>=position;i--) {
            arr[i+1]=arr[i];     
        }
        arr[position] = k;
        return position+1;
    }
    public static void main(String[] args) {
        // int[] arr=new int[20];
        // arr[0]=10;
        // int size=1;
        // size=addarray(arr, 20, 1,size);
        // size=addarray(arr, 30, 3,size);
        // for(int i=0;i<size;i++){
        //     System.out.println(arr[i]);
        // }

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String len=String.valueOf(n);
        int l=len.length();
        int add=0;
        int p=l;
        int num=n;
        for(int i=0;i<l;i++){
             int digit=num%10;
            int j=p;
            int mul=1;
            while(j>0){
                mul*=digit;
                j--;
            }
            add+=mul;
            
            num/=10;
        }
        if(n==add){
System.out.println("It is Amstrong Number.");
        }else{
            System.out.println("It is not an Amstrong Number");
        }
        

    }
}
