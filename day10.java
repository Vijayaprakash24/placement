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

    // int[][] a={
    //     {1,2,3},
    //     {4,5,6},
    //     {7,8,9}
    // };

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



// int row=a.length;
// int col=a[0].length;
// for(int d=0;d<row+col-1;d++){
//     if(d%2==0){
//         int r=(d<row)?d:row-1;
//         int c=d-r;
//         while(r>=0&&c<col){
//             System.out.print(a[r][c]+" ");
//             r--;
//             c++;
//         }
//         System.out.println("");
//     }else{
//         int c=(d<col)?d:col-1;
//         int r=d-c;
//         while(c>=0&&r<row){
//             System.out.print(a[r][c]+" ");
//             c--;
//             r++;
//         }
//         System.out.println("");
//     }
// }


int[][] a={
    {1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}
};
int sum=0;

int n = a.length;

// for(int i = 0; i < n; i++){
//     for(int j = 0; j < n; j++){
//         if(i == 0 || i == n-1 || j == 0 || j == n-1){
//             sum += a[i][j];
//         }
//     }
// }

// System.out.print(sum);


// for(int i=0;i<n;i++){
//     if(i==0 || i==n-1){
//         for(int j=0;j<n;j++){
//             sum += a[i][j];   
//         }
//     } else {
//         sum += a[i][0];     
//         sum += a[i][n-1];     
//     }
// }
// System.out.println(sum);


// int top=0,bottom=n-1;
// int left=0,right=a[0].length-1;
// while(top<=bottom && left<=right){
//     for(int i=left;i<=right;i++){
//         System.out.print(a[top][i]+" ");
       
//     }
//      top++;
//     for(int i=top;i<=bottom;i++){
//         System.out.print(a[i][right]+" ");
    
//     }
//     right--;
  
//         for(int i=right;i>=left;i--){
//             System.out.print(a[bottom][i]+" ");
           
//         }
//         bottom--; 
    
    
//         for (int i = bottom; i >= top; i--)
//             System.out.print(a[i][left] + " ");
        

//         left++;
   
// }
// for(int l=0;l<2;l++){
// int top=0,bottom=n-1;
// int left=0,right=a[0].length-1;
// while(top<bottom && left<right){
//     int prev=a[top+1][left];
//     for(int i=left;i<=right;i++){

//         int curr=a[top][i];
//         a[top][i]=prev;
//         prev=curr;
       
//     }
//      top++;
//     for(int i=top;i<=bottom;i++){
        
//         int curr=a[i][right];
//         a[i][right]=prev;
//         prev=curr;
    
//     }
//     right--;
  
//         for(int i=right;i>=left;i--){
//             int curr=a[bottom][i];
//             a[bottom][i]=prev;
//             prev=curr;
           
//         }
//         bottom--; 
    
    
//         for (int i = bottom; i >= top; i--){
//             int curr=a[i][left];
//             a[i][left]=prev;
//             prev=curr;
//         }
        
//         left++;
   
// }
// }
for(int i=0;i<n;i++){
    for(int j=n-1;j>=0;j--){
        System.out.print(a[j][i]+" ");
    }
    System.out.println();
}


    }

}
