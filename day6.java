import java.util.*;

public class day6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // int n;
        // // int[] a=new int[5];
        // int[] a={10,2,3,4,5};
        // System.out.println("Enter number upto 5:");
        // n=in.nextInt();
        // // for(int i=0;i<n;i++){
        // //     a[i]=in.nextInt();
        // // }
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }

        // int[] a={1,3,10,-4,1};
        // int min=a[0];
        // for(int i=1;i<a.length;i++){
        //     if(a[i]<min){
        //         min=a[i];
        //     }
        // }
        // System.out.print(min);

        // int[] a={1,3,10,-4,1};
        // int max=a[0];
        // for(int i=1;i<a.length;i++){
        //     if(a[i]>max){
        //         max=a[i];
        //     }
        // }
        // System.out.print(max);

        // int[] a={10,3,4,5,-9,6};
        // int min=a[0];
        // int secondmin=0;

        // for(int i=1;i<a.length;i++){
        //     if(a[i]<min){
        //         secondmin=min;
        //         min=a[i];
                
        //     }else if (a[i] < secondmin && a[i] > secondmin) {
        //         secondmin = a[i];
        //     }
        // }
        // System.out.println(secondmin);

    
        // int max=a[0];
        // int secondmax=0;

        // for(int i=1;i<a.length;i++){
        //     if(a[i]>max){
        //         secondmax=max;
        //         max=a[i];
                
        //     }else if (a[i] > secondmax && a[i] < max) {
        //         secondmax = a[i];
        //     }
        // }
        // System.out.println(secondmax);

        // int[] a={2,1,4,5,7,6};
        // for(int i=0;i<a.length-1;i++){
        //     for(int j=i+1;j<a.length;j++){
        //         if(a[i]>a[j]){
        //             int temp=a[i];
        //             a[i]=a[j];
        //             a[j]=temp;
        //         }
        //     }
        // }for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        // System.out.println("");

       
        // for(int i=0;i<a.length-1;i++){
        //     for(int j=i+1;j<a.length;j++){
        //         if(a[i]<a[j]){
        //             int temp=a[i];
        //             a[i]=a[j];
        //             a[j]=temp;
        //         }
        //     }
        // }for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }

        // int[] a={1,2,4,5,6,7,8};
        // for(int i=0;i<a.length-3;i++){
        //     for(int j=a.length-(i+1);j==a.length-(i+1);j++){
              
        //         int temp=a[i];
        //         a[i]=a[j];
        //         a[j]=temp;
        //     }
        // }
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }

        // int i,j;
        // int[] b=new int[a.length];
        // for(i=a.length-1,j=0;i>=0;i--,j++){
        //     b[i]=a[j];
        // }
        // for( i=0;i<a.length;i++){
        //     System.out.println(b[i]);
        // }

        //duplicate element in array
        //    int[] a = {1,2,5,1,2,1,5,3,3,4};
        //     int count = 0;
           
        //     for (int i = 0; i < a.length; i++) {
        //          Boolean alreadycount=false;
        //         for(int k=0;k<i;k++){
        //             if(a[i]==a[k]){
        //             alreadycount=true;
        //             break;}
        //         }
        //         if(alreadycount){
        //              continue;
        //             }
        //         for (int j = i + 1; j < a.length; j++) {
        //             if (a[i] == a[j]) {
        //                 count++;
        //                 break;   
        //             }
        //         }
        //     }

        //     System.out.println(count);

         

        // for(int i=0;i<a.length;i++){
        //     Boolean unique=true;
        //     for(int j=0;j<a.length;j++){
        //         if(i!=j && a[j]==a[i]){
        //             unique=false;
        //             break;
        //         }
        //     }
        //         if(unique){
        //             System.out.print(a[i]);
        //         }
            
        // }
    //   int[] a = {1,2,3,1,2,2,4,4,5};
    //     boolean[] v=new boolean[a.length];
    //     int c2=0;
    //     int un=0;
    //     for(int i=0;i<a.length;i++){
    //         if(v[i]==true){
    //             continue;
    //         }
    //         int count1=0;
    //         for(int j=i+1;j<a.length;j++){
    //             if(a[i]==a[j]){
    //                 count1+=1;
    //                 v[j]=true;
    //             }
    //         }
    //         if(count1>=2){
    //             count1=1;
    //         }
    //         if(count1==0){
    //             System.out.println(a[i]);
    //             un++;
    //         }
    //         c2=count1+c2;
    //     }
    //     System.out.println(un);
    
   
    // int[] a={1,2,3,4};
    // int[] b={5,6,7};
    //  int[] c1=new int[a.length+b.length];
    // int c=a.length+b.length;
    // int j=0;
    // for(int i=0;i<a.length;i++){
    //    c1[i]=a[i];
    // }
  
    //  for(int i=0;i<b.length;i++){
    //    c1[a.length+i]=b[i];
      
    // }
    // for(int i=0;i<c;i++){
    //         System.out.println(c1[i]);
        // }


        int[] a={1,3,3,3,4,3,3,4,4,4,7,8,9,6};
        int b=3;
        int co=0;
          for(int i=0;i<a.length;i++){
          if(a[i]!=co){
          for (int j =i+1; j < a.length; j++) {
            for(int k=0;k<i;k++){
                    if (a[i] == a[j] && a[k]!=a[i]) {
                       System.out.println("find"+a[j]);
                       co=a[j];
                       break;

                    }}
                    break;
                }}
    }




    }
}
