import java.util.Scanner;

public class day7 {
      public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // int n=in.nextInt();
        // int[] a=new int[n];
        // a[0]=0;
        // a[1]=1;
        // for(int i=2;i<n;i++){
        //     a[i]=a[i-1]+a[i-2];
        // }
        // for(int i=0;i<n;i++){
        //     System.out.println(a[i]);
        // }

        // int[] a={3,2,4,-2,4,1,1};
        // int k=6;
        // int count=0;
        //  int count1=0;
        // for(int i=0;i<=a.length;i++){
        //       int ans=0;
        //     for(int j=i;j<=a.length-1;j++){
        //          ans+=a[j];
        //          if(ans>=5){
        //             if(ans==5){
        //             count1=j-i+1;}
        //             break;
        //         }
        //         if(count<count1){
        //             count=count1;
                    
        //         }
        //     }

        // }
        // System.out.print(count);

        // int[] a={3,2,4,-2,4,1,1};
        // int secondmax=0;
        // int max=a[0];
        // for(int i=1;i<a.length;i++){
        //         if(max<a[i]){
        //             secondmax=max;
        //              max=a[i];    
        //     }
        // }
        // System.out.println(secondmax);

        // int[] a={10,20,30,40,50};
        // int[] b=new int[a.length];
        // int[] c=new int[a.length];
        // int[] b1={50,20,30,60,10};
        // Boolean rot=false;
    //      for(int i=0;i<a.length;i++){
    //         c[i]=a[i];
    //     }
        

    //     for(int j=0;j<5;j++){
    //      b[0]=a[a.length-1];
    //     for(int i=1;i<a.length;i++){
    //           b[i]=a[i-1];    
    //     }

    //     for(int i=0;i<a.length;i++){
    //         a[i]=b[i];
    //     }
    
    // }

    //   int[] a = {1, 2,3, 3, 4, 5};
    //     int[] b = {3, 4, 5, 1, 2};
    //     if (a.length == b.length) {
    //         int n = a.length;
    //         boolean flag = false;
    //         for (int i = 0; i < n; i++) {   
    //             int count = 0;
    //             for (int j = 0; j < n; j++) {  
    //                 if (a[(i + j) % n] == b[j]) {
    //                     count++;
    //                 } 
    //                 else{
    //                     break;
    //                 }
    //             }

    //             if (count == n) {
    //                 flag = true;
    //                 break;
    //             }
    //         }
    //         if (flag)
    //             System.out.println("rotation");
    //         else
    //             System.out.println("not rotation");
    //     }
    //     else{
    //         System.out.println("Not a rotation");
    //     }


    //  for(int i=0;i<a.length;i++){
    //         if(a[i]!=b1[i] ){
    //             for(int j=0;j<a.length;j++){
    //                  if(b1[i]==a[j] ){
                       
    //                      rot=true;
    //         continue;
    //                  }
    //             }
    //             continue;
           
    //         }
           
    //     }  


    
    
    
    //     if(rot){
    //         System.out.print("roated");
    //     }else{
    //         System.out.print("not Roated");
    //     }

    // int[] a={9,8,7,2,6,5,9,3,0,1};
    
  
    // for(int i=0;i<a.length;i++){
    //     Boolean flag=true;
    //     for(int j=i+1;j<a.length;j++){
    //         if(a[i]<a[j]){
    //             flag=false;
    //             break;
    //         }   
    //     }
    //     if(flag){
    //     System.out.println(a[i]);
    // }
    //     }

//    int[] a={9,10,8,11,7,6,2,1,5,1};
    // for(int i=0;i<a.length-1;i++){
    //     Boolean flag=true;
    //     if(a[i]<a[i+1]){
    //             flag=false;
    //     }
    //     if(flag){
    //         System.out.println(a[i]);
    //     }
       
    // }

    // int max=a[a.length-1];
    // for(int i=a.length-2;i>=0;i--){
    //     if(a[i]>max){
    //         max=a[i];
    //         System.out.println(a[i]);
    //     }
    // }

    int[] a={1,2,3,4};
    
    for(int i=0;i<a.length-1;i++){
        int pro=1;
        for(int j=0;j<a.length;j++){  
            if(a[i]!=a[j]) {
            pro=a[j]*pro;
        
        }
        System.out.println(pro);
        }
        
    }

    // for(int i=0,j=a.length-1;i<a.length;i++,j--){
    //         int pro=1;
    //         if(a[i]!=a[j]){
    //         pro=a[j]*pro*a[i];
    //          System.out.println(pro);}
    //     }
       
    
    

       
      


      }
}
