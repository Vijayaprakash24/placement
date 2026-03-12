

public class Day18_1 {
    static int top=-1;
    static char arr[]=new char[30];
    public static void push(char c){
        top=top+1;
        arr[top]=c;
    }
    public static  char pop(){
         if (isEmpty()){
            System.out.println("Stack is empty");
        } 
      
        char temp=arr[top];
        top--;
        return temp;
        
    }
    public static char peak(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        } 
       
        return arr[top];
    }

    public static  boolean isEmpty(){
        return top==-1;
    }

    public static int presistance(char c){
        if(c=='+'||c=='-'){
            return 1;
        }else if(c=='*'||c=='/'){
            return 2;
        }else if(c=='^'){
            return 3;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        String infix="a+b*c/d-g";
        String postfix="";
        for(int i=0;i<infix.length();i++){
            char c=infix.charAt(i);
            if(Character.isLetterOrDigit(c)){
                postfix=postfix+c;
            }else if(c=='('){
                push(c);
            }else if(c==')'){
                while(!isEmpty()&& peak()!='('){
                    postfix=postfix+pop();
                }
                pop();
            }else{
                 while(!isEmpty()&&presistance(c)<=presistance(peak())){
                    char d=pop();
                    System.out.println(d);
                    postfix+=d;
                }
                 push(c);
            }
            }
             while(!isEmpty()){
                postfix=postfix+pop();
            
        }
        System.out.println(postfix);
    }

}
