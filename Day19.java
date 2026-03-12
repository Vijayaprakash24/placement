public class Day19 {
    static int top=-1;
    static char[] arr=new char[20];
    public static void push(char ca){
        top=top+1;
        arr[top]=ca;
    }
      public static int check(char s){
        if(s=='+'){
            return 1;
        }else if(s=='-'){
            return 2;
        }else if(s=='*'){
            return 3;
        }else if(s=='/'){
            return 4;
        }else{
            return -1;
        }
      }

      public static char peak(){
          char c= arr[top];
          top--;
          return c;
      }

    public static void main(String[] args) {
        // String s="53+2*2/8+7-";
        String s="532/-25*-7+";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                push(c);
            }else{
               int j=peak()-'0';
               int k=peak()-'0';
                switch (check(c)) {
                    case 1:
                        char tot=(char)((k+j)+'0');
                        push(tot);
                        break;
                    case 2:
                        char tot1=(char)((k-j)+'0');
                        push(tot1);
                        break;
                    case 3:
                         char tot2=(char)((k*j)+'0');
                         push(tot2);
                         break;
                    case 4:
                          char tot3=(char)((k/j)+'0');
                          push(tot3);
                          break;
                    default:
                        System.out.println("Invalid data.");
                        break;
                }
            }
        }
        System.out.println(peak());
    }
}
