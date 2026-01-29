public class day5 {
    public static void main(String[] args) {
        // String hex=" ";
        // int dec=173;
        // while(dec>0){
        //     int rem=dec%16;
        //     if(rem<0){
        //           hex=rem+hex;
        //     }else if(rem>=10){
        //         hex=(char)((rem-10)+'A')+hex;
        //     }
        //     dec/=16;
        // }
        // System.out.println(hex);

        // String binary=" ";
        // int dec=173;
        // while(dec>0){
        //     int rem=dec%2;
        //     if(rem>=0){
        //           binary=rem+binary;
        //     }
        //     dec/=2;
        // }
        // System.out.println(binary);

        // String octal=" ";
        // int dec1=173;
        // while(dec1>0){
        //     int rem=dec1%8;
        //     if(rem>=0){
        //           octal=rem+octal;
        //     }
        //     dec1/=8;
        // }
        // System.out.println(octal);

        // int value;
        // String octal=" ";
        // String binary="1010111";
        // while(binary.length()%3!=0){
        //     binary="0"+binary;
        // } 
        // for(int i=0;i<binary.length();i=i+3){
        //    value=0;
        //    value+=(binary.charAt(i)-'0')*4;
        //    value+=(binary.charAt(i+1)-'0')*2;
        //    value+=(binary.charAt(i+2)-'0')*1;
        //    octal+=value;

        // }
        // System.out.println(octal);

        // int value;
        // String octal=" ";
        // String binary="11111";
        // while(binary.length()%4!=0){
        //     binary="0"+binary;
        // } 
        // for(int i=0;i<binary.length();i=i+4){
        //    value=0;
        //    value+=(binary.charAt(i)-'0')*8;
        //    value+=(binary.charAt(i+1)-'0')*4;
        //    value+=(binary.charAt(i+2)-'0')*2;
        //    value+=(binary.charAt(i+3)-'0')*1;
        //    if(value>10){
        //     int rem=value%16;
        //     octal+=(char)((rem-10)+'A');
        //    }else{
        //    octal+=value;
        // }

        // }
        // System.out.println(octal);

        // String hex="1F";
        // String bin=" ";
        // for(int i=0;i<hex.length();i++){
        //     if(hex.charAt(i)>='0' && hex.charAt(i)<='9'){
        //         int dec=hex.charAt(i)-'0';
                
               
        //         while(dec>0){

        //             int rem=dec%2;
        //             if(rem>=0){
        //             bin=rem+bin;
        //             }

               
        //         dec/=2;
        //          }
        //     }else{
        //         int dec=((hex.charAt(i)-'A')+10);
        //          while(dec>0){

        //             int rem=dec%2;
        //             if(rem>=0){
        //             bin=rem+bin;
        //             }

               
        //         dec/=2;
        //          }
        //     }
            
        // }
        // System.out.println(bin);
        
        // String hex="1F";
        // String bin=" ";
        // for(int i=0;i<hex.length();i++){
        //     if(hex.charAt(i)>='0' && hex.charAt(i)<='7'){
        //         int dec=hex.charAt(i)-'0';
                
               
        //         while(dec>0){

        //             int rem=dec%8;
        //             if(rem>=0){
        //             bin=rem+bin;
        //             }

               
        //         dec/=8;
        //          }
        //     }else{
        //         int dec=((hex.charAt(i)-'A')+10);
        //         System.out.println(dec);
        //          while(dec>0){

        //             int rem=dec%8;
        //             if(rem>=0){
        //             bin=rem+bin;
        //             }

               
        //         dec/=8;
        //          }
        //     }
            
        // }
        // System.out.println(bin);

        // String n1="010011";
        // String n2="101010";
        // int sum;
        // int carry=0;
        // String sum1="";
    
        // for(int i=n1.length()-1;i>=0;i--){
        //     int n3=n1.charAt(i)-'0';
        //     int n4=n2.charAt(i)-'0';
        //     n3=n3%10;
        //     n4=n4%10;
          
        //     if(n3==1&& n4==1){
        //         if(carry!=0){
        //             sum=0;
        //             carry=1;
        //         }else{
        //             sum=0;
        //             carry=1;
        //         }
        //     }else if(n3==0 && n4==1){
            
        //         if(carry!=0){
        //             sum=0;
        //             carry=1;
        //         }else{
        //             sum=1;
        //         }
        //     }else if(n3==1&& n4==0){
        //         if(carry!=0){
        //             sum=0;
        //             carry=1;
        //         }else{
        //             sum=1;
        //         }
        //     }else{
        //         if(carry!=0){
        //             sum=1;
        //             carry=0;
        //         }else{
        //             sum=0;
        //             carry=0;
        //         }
                    
        //         }
        //         n3/=10;
        //         n4/=10;
              
        //       sum1=String.valueOf(sum)+sum1;
              
                
        // }
        // System.out.print(carry);
        // System.out.print(sum1);

        String a="73";
        String b="64";
        int a1=a.charAt(0)-'0';
        int a2=b.charAt(0)-'0';
        int d=(a1+a2)%8;
        System.out.print(d);
       

    }
}
