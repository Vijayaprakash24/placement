// class Node{
//     int data;
//     Node next,prev;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//         this.prev=null;
//     }
// }

// public class Day17 {

//     public static Node insertatbeg(Node head,int data){
//         Node temp=new Node(data);
//         if(head==null){
//              head=temp;
//         }else{
//             temp.next=head;
//             head.prev=temp;
//             head=temp;
//         }
//         return head;
//     }

//     public static Node insertatmid(Node head,int data1,int data){
//         Node temp=new Node(data1);
//         Node previous=head;
//         while(previous!=null&&previous.data!=data){
//             previous=previous.next;
//         }
//         temp.next=previous.next;
//         previous.next.prev=temp;
//         previous.next=temp;
//         temp.prev=previous;
//         return head;
//     }

//     public static Node delete(Node head,int data){
      
       
//         if(head==null){
//             return null;
//         }
//          Node temp=head;
//         if(temp.data==data){
//               head=temp.next;
//               if(head!=null){
//                 head.prev=null;
//               }
//               return head;
//         }
//         while(temp!=null && temp.data!=data){
//             temp=temp.next;   
//         }
//         if(temp==null){
//             System.out.println("No Data Found.");
//             return head;
//         }

//         if(temp.next==null){
//             temp.prev.next=null;
//             return head;
//         }else{
//         temp.next.prev=temp.prev;
//         temp.prev.next=temp.next;
//         return head;}
//     }

//     public static Node insertatend(Node head,int data){
//         Node temp=new Node(data);
//         Node last=head;
//         while(last!=null&&last.next!=null){
//             last=last.next;
//         }
//         last.next=temp;
//         temp.prev=last;
//         return head;
//     }    

//     public static void display(Node head){
//         Node temp=head;

//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");

//         // while(temp.next!=null){
//         //     temp=temp.next;
//         // }
       
//         //   while(temp!=null){
//         //     System.out.print(temp.data+"->");
//         //     temp=temp.prev;
//         // }
//         // System.out.println("null");
//     }

//     public static void main(String[] args) {
//         Node head=new Node(20);
        
//         head=insertatbeg(head, 40);
//         head=insertatmid(head, 30, 40);
//         head=insertatend(head, 50);
//         // head=delete(head, 30);
//         display(head);
//     }
// }
