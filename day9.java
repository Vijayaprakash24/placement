import java.math.BigInteger;

public class day9 {
    public static void main(String[] args) {
    //     int a=173;
    //     String hdec="";
    //    while(a>0){
    //     int rdec=a%16;
    //     if(rdec<0){
    //         hdec=rdec+hdec;
    //     }else if(rdec>=10){
    //         hdec=(char)((rdec-10)+'A')+hdec;
    //     }
    //     a=a/16;
    //    }
    //    System.out.println(hdec);

    //Adding two long integer

        // String a = "1234567891011121314789651455184854";
        // String b = "1413121110987654321845544455454854";
        // int i = a.length() - 1;
        // int j = b.length() - 1;
        // int carry = 0;
        // String sum = " ";
        // while (i >= 0 || j >= 0 || carry > 0) {
        //     int c = (i >= 0) ? a.charAt(i) - '0' : 0;
        //     int d = (j >= 0) ? b.charAt(j) - '0' : 0;

        //     int s = c + d + carry;
        //     sum=(s%10)+sum;
            
        //     carry = s / 10;

        //     i--;
        //     j--;
        // }
        // System.out.println(sum.toString());


        int dec=17;
        String hex="";
        String hex1="1C";
        while(dec>0){
            int rdec=dec%16;
            if(rdec<10){
                hex=rdec+hex;
            }else if(rdec>=10){
                hex=(char)((rdec-10)+'A')+hex;
            }
            dec=dec/16;
        }
        
        int i=hex.length()-1;
        int j=hex1.length()-1;
        int carry=0;
        String hexst="";
        while(i>=0||j>=0||carry!=0){
            int x=0;
            if(i>=0){
                char c=hex.charAt(i--);
                char d=hex1.charAt(j--);
                int x1=(c>='0' && c<='9')?c-'0':c-'A'+10;
                int y1=(d>='0' && d<='9')?d-'0':d-'A'+10;
                x=x1+y1;
            }
            int total=x+carry;
            carry=total/16;
            total=total%16;
            if(total>=10){
                hexst=(char)(total-10+'A')+hexst;
            }else{
             hexst=total+hexst;
            }
             
        }

        int k=hexst.length()-1;
        int car=0;
        String d="";
        while(k>=0||car!=0){
              int x=0;
              int y=0;
              if(k>=0){
                char c=hexst.charAt(k--);
                
                if(c>='0' && c<='9'){  
                    x=c-'0'+car;
                    
                }else{
                    
                    int x1=c-55;
                    x=x1+car;
                    
                }
              }
              d=(x%10)+d;
              car=x/10;
        }
        System.out.println(hex);
        System.out.println(hexst);
        System.out.println(d);
        

    

      

       

    }
}
