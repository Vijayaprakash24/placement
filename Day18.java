// // class Node{
// //     int data;
// //     Node next;
// //     Node(int data){
// //         this.data=data;
// //         this.next=null;
// //     }
// // }

// class Day18{
     
//     // public static Node push(int data,Node top){
//     //     Node temp=new Node(data);
//     //     if(top==null){
//     //           top=temp;
//     //     }else{
//     //         temp.next=top;
//     //         top=temp;
//     //     }
//     //     return top;
//     // }

//     // public static Node pop(Node top){
//     //      if(top==null){
//     //         System.out.println("Stack is Empty");
            
//     //      }else{
//     //         System.out.println("Poped element is"+top.data);
//     //         top=top.next;
//     //      } return top;
//     // }

//     // public static void peak(Node top){
//     //     if(top==null){
//     //         System.out.println("Stack is Empty");
//     //     }else{
//     //         System.out.println("Top of element is "+top.data);
//     //     }
//     // }
//     // public static void display(Node top){
//     //     Node temp=top;
//     //     if(top==null){
//     //         System.out.println("Stack is Empty");
//     //     }
//     //     else{
//     //         while(temp!=null){
//     //             System.out.print(temp.data+"->");
//     //             temp=temp.next;
//     //         }
//     //         System.out.print("null");
//     //     }
//     // }

//     static int size=20;
//     static int top=-1;
//     static int[] arr=new int[size];

//        public static boolean isEmpty(){
//         if(top==-1){
//             System.out.println("Stack is underflow");
//             return true;
//         }
//         return false;
//     }

//          public static boolean isFull(){
//         if(top==size-1){
//             System.out.println("Stack is overflow");
//             return true;
//         }
//         return false;
//     }


//     public static void push(int data){
      
//         if(isFull()){
//           return ;
//        }else{
//             arr[top+1]=data;
//             top++;
//         }
//     }

//     public static int pop(){
//         if(isEmpty()){
//           return -1 ;
//        }else{
            
//             return arr[top--];
           
//         }
//     }



//     public static void peak(){
//          if(isFull()){
//           return ;
//        }else{
//             System.out.println(arr[top]);
//         }
//     }
 

//     public static void display(){
//        if(isEmpty()){
//           return ;
//        }else{
//             for(int i=top;i>=0;i--){
//                 System.out.print(arr[i]+"->");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         // Node top=null;
//         // top=push(10, top);
//         // top=push(20,top);
//         // top=push(45,top);
//         // top=pop(top);
//         // top=push(30,top);
//         // peak(top);
//         // display(top);
//         push(20);
//         push(30);
//         push(40);
//         push(50);
//         peak();
//         pop();
//         display();
//     }
    
// }