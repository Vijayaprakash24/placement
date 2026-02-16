import java.util.*;

public class day10 {

    // static void leftrotation(int[] row,int k){
    //         int n=row.length;
    //         int[] temp=new int[k];
    //         for(int i=0;i<k;i++){
    //             temp[i]=row[i];
    //         }
    //         for(int i=k;i<n;i++){
    //             row[i-k]=row[i];
    //         }
    //         for(int i=0;i<k;i++){
    //             row[n-k+i]=temp[i];
    //         }
    // }

    // static void rightrotation(int[] row,int k){
    //     int n=row.length;
    //     int[] temp=new int[k];
    //    for (int i = 0; i < k; i++) {
    //     temp[i] = row[n - k + i];
    // }
    //     for(int i=n-k-1;i>=0;i--){
    //         row[i+k]=row[i];
    //     } for (int i = 0; i < k; i++) {
    //     row[i] = temp[i];
    // }
    // }

    public static void main(String[] args){
    //     Scanner in=new Scanner(System.in);
    //     int[][] a=new int[3][3];
    //     for(int i=0;i<a.length;i++){
    //         for(int j=0;j<a.length;j++){
    //             a[i][j]=in.nextInt();
    //         }
    //     }
    //     for(int i=0;i<a.length;i++){
            
    //             // leftrotation(a[i], i);
    //             rightrotation(a[i], i);
    //         }
        
      
    //      for(int i=0;i<a.length;i++){
    //         for(int j=0;j<a.length;j++){
    //             System.out.print(a[i][j]+" ");   
    //     }
    //     System.out.println("");
    //     }
        
    // }

    int[][] a={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

//     int n=a[0].length;
    


//    for(int i = 0; i < n; i++) {
           
//                 for(int j = 0; j <= i; j++) {
//                     System.out.print(a[j][i-j] + " ");
            
                   
//             }
        
//       System.out.println();

//         }

//         for(int i=1;i<n;i++){
          
//                 for(int j = i; j < n; j++) {
//                     System.out.print(a[j][n+i-j-1] + " ");
//                 }
           
//             System.out.println();
//         }



int row=a.length;
int col=a[0].length;
for(int d=0;d<row+col-1;d++){
    if(d%2==0){
        int r=(d<row)?d:row-1;
        int c=d-r;
        while(r>=0&&c<col){
            System.out.print(a[r][c]+" ");
            r--;
            c++;
        }
        System.out.println("");
    }else{
        int c=(d<col)?d:col-1;
        int r=d-c;
        while(c>=0&&r<row){
            System.out.print(a[r][c]+" ");
            c--;
            r++;
        }
        System.out.println("");
    }
}

    }
}
