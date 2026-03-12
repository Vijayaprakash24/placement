public class Day15 {
    public static void main(String[] args){
        // String[] a={"man","mam"};
        
        // for(int i=0;i<a.length;i++){
        //     StringBuilder b=new StringBuilder(a[i]);
        //      b.reverse();
        //      if(a[i].equals(b.toString())){
        //         System.out.println(a[i]+" "+"is palidrom");
        //      }else{
        //         System.out.println(a[i]+" "+ "It is not an palidrom");
        //      }
        // }



        // String s1="";
        // String s2="";
        // for(int i=0;i<a.length;i++){
        //     s1=a[i];
        //     for(int j=0;j<a[i].length();j++){
        //          char c=s1.charAt(j);
        //          s2=c+s2;
        //     }
        //     if(s1.equals(s2)){
        //        System.out.println(a[i]);
        //     }
        //     s2="";
            
        // }

        // for(int i=0;i<5;i++){
        //     for(int j=i;j<5;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=0;k<(2*i)-1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        int k=6;
        // int[] a={1,2,3,4,5,6};
        // for(int i=0;i<a.length;i++){
        //     for(int j=i;j<a.length;j++){
        //         int b=a[i]+a[j];
        //         if(k==b && j!=i){
        //             System.out.println(i+" "+j);
        //         }
        //     }
        // }
        // int[] b=new int[a.length];
       
        //  int c=1;
        // for(int i=0;i<a.length;i++){
        //     c=1;
        //     for(int j=0;j<a.length;j++){
        //        if(i!=j){
        //        c*=a[j];
        //         b[i]=c;}
        
        //     }
        // }
        // for(int i=0;i<b.length;i++){
        //     System.out.println(b[i]);
        // }

        // int[] a={-2,1,-3,4,-1,2,1,-5,4};
        // int sum=0;
        // for(int i=0;i<a.length;i++){
        //     int sum1=0;
        //     for(int j=i;j<a.length;j++){
        //         sum1+=a[j];
        //          if(sum1>sum){
        //             sum=sum1;
        //          } 
        //     }
          
           
        // }
        // System.out.println(sum);

        StringBuilder s=new StringBuilder("loveleetcode");
       
        int len=s.length()-1;
        for(int i=0;i<s.length();i++){
             int in=0;
            char c=s.charAt(i);
            Boolean flag=false;
            for(int j=i+1;j<s.length();j++){
              char c1=s.charAt(j);
              if(c==c1){
                  flag=false; 
                break; 
              
              }else{
                flag=true;
                in+=1;  
                
              }
             
            }
             if(flag){
                System.out.println(in+" "+i+" "+len);
                if(in==(len-i)){
                   System.out.println(len-in);
                }
                break;
              }
          
        }
      

        
    }
}
