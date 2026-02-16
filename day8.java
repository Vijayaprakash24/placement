import java.util.*;
public class day8{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // int[][] a=new int[3][3];
        // int[][] b=new int[3][3];
        // int[][] c=new int[3][3];

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         int d=in.nextInt();
        //         a[i][j]=d;
        //     }
        // }

        // System.out.println(" ");

        //  for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         int e=in.nextInt();
        //         b[i][j]=e;
        //     }
        // }

        //  for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
                
        //         c[i][j]=a[i][j]+b[i][j];
        //     }
        // }

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
               
        //         System.out.print(c[i][j]);
        //         System.out.print(" ");
                
        //     }
        //     System.out.println("");
        // }

        // int[][] a=new int[3][];
        // int r,c;
        // r=in.nextInt();
        // for(int i=0;i<r;i++){
        //     System.out.println("Enter C: ");
        //     c=in.nextInt();
        //     a[i]=new int[c];
        //     for(int j=0;j<c;j++){
        //         a[i][j]=in.nextInt();
        //     }
        // }

        // System.out.println("Matrix: ");
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println(" ");
        // }
        
        // int ra=in.nextInt();
        // int ca=in.nextInt();
        // int[][] a=new int[ra][ca];
        // int rb=in.nextInt();
        // int cb=in.nextInt();
        // int[][] b=new int[rb][cb];
        // int[][] c=new int[ra][ra];
        // if(ca<=rb){
        //        for(int i=0;i<ra;i++){
        //     for(int j=0;j<ca;j++){
        //         int e=in.nextInt();
        //         a[i][j]=e;
        //     }
        // }
        //   for(int i=0;i<rb;i++){
        //     for(int j=0;j<cb;j++){
        //         int e=in.nextInt();
        //         b[i][j]=e;
        //     }
        // }
        //     for(int i=0;i<a.length;i++){
        //         for(int j=0;j<b[0].length;j++){
        //             for(int k=0;k<b.length;k++){
        //                 c[i][j]+=(a[i][k]*b[k][j]);
        //             }
        //         }
        //     }
        // }
        //  for(int i=0;i<c.length;i++){
        //     for(int j=0;j<c[i].length;j++){
        //         System.out.print(c[i][j]+" ");
        //     }
        //     System.out.println("");
        // }

        int[][] a=new int[4][4];
        // int sum=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=in.nextInt();
            }
        }
        // // for(int i=0;i<3;i++){
        // //     for(int j=0;j<3;j++){
        // //         sum+=a[i][j];
        // //     }
        // // }
        // int [] sum1=new int[3];
        // for(int i=0;i<3;i++){
        //     sum=0;
        //     for(int j=0;j<3;j++){
        //         sum+=a[j][i];
        //     }
        //    System.out.println(sum);
        // }
           
    //    int max=a[0][0];
    //     int min=a[0][0];
    //     for(int i=0;i<a.length;i++){
    //         for(int j=0;j<a.length;j++){
    //             if(max<a[i][j]){
    //                 max=a[i][j];
    //             }
    //             if(min>a[i][j]){
    //                 min=a[i][j];
    //             }
    //         }
    //     }
    //     System.out.println(max);
    //     System.out.println(min);
        
    //  int[][] b=new int[a.length][a.length];
    //  for(int i=0;i<3;i++){
    //         for(int j=0;j<3;j++){
    //             System.out.print(a[j][i]+" ");
    //         }
    //         System.out.println();
    //     }

        // int [] sum1=new int[3];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         sum1[i]+=a[i][j];
        //     }
        // }
        // int max=sum1[0];
        // for(int i=1;i<a.length;i++){
        //     if(max<sum1[i]){
        //          max=sum1[i];
        //     }
        // }
        // System.out.println("max of row is:"+max);

    
        // for(int i=0;i<1;i++){
        //     for(int j=0;j<a.length;j++){
        //         b[0][j]=a[a.length-1][j];
                
        //         a[a.length-1][j]=a[i][j];
        //         a[i][j]=b[0][j];
        //     }
        // }

        // for(int j=0;j<a.length;j++){
        //     int b=0;
        //     b=a[a.length-1][j];
        //     a[a.length-1][j]=a[0][j];
        //     a[0][j]=b;
        // }

        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //        System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
        // }
      int n=in.nextInt();
      int[] b=new int[a.length];
       int l=in.nextInt();
     for(int k=0;k<l;k++) {
            for(int i=1;i<a.length;i++){
                b[i]=a[n][i-1];
            }
             b[0]=a[n][a.length-1];
             for(int i=0;i<3;i++){
                a[n][i]=b[i];
            }
}
          
  
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
       


        
    }
}