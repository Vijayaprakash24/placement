// import java.util.*;
// class Solution {
//      static Stack<Character> stack=new Stack<>();
//     public  int len(){
//         return stack.size();
//     }
//     public boolean isValid(String s) {
       

//         for(char c:s.toCharArray()){
//             if(c=='('||c=='{'||c=='['){
//                 stack.push(c);
//             }else{
//                 if(stack.isEmpty()){
//                     return false;
//                 }
//                 char top=stack.pop();
//                 if(c==')'&&top!='(') return false;
//                 if(c==']'&&top!='[') return false;
//                 if(c=='}'&&top!='{') return false;

//             }

//         }
//         return stack.isEmpty();
//     }
   
// }

// public class T3 {
//     public static void main(String[] args){
//         Solution s=new Solution();
//         System.out.println(s.isValid("[]{}()("));
//         System.out.println(s.len());
//     }
// }
