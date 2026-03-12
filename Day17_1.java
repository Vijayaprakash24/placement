// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }

// public class Day17_1 {

//     public static Node insertatbeg(int data,Node head){
//         Node temp=new Node(data);
//         if(head==null){
//             temp.next=temp;
//             return temp;
//         }else{
//             Node last=head;
//             while(last.next!=head){
//                 last=last.next;
//             }
//             temp.next=head;
//             last.next=temp;
//             head=temp;
//             return head;
//         }
//     }

//     public static Node insertatmid(int data,int data1,Node head){
//         Node temp=new Node(data);
//         Node prev=head;
//         while(prev.data!=data1&&prev!=null){
//             prev=prev.next;
//         }
//         temp.next=prev.next;
//         prev.next=temp;
//         return head;
//     }

//     public static Node insertatend(int data,Node head){
//         Node temp=new Node(data);
//         Node prev=head;
//         while(prev.next.data!=head.data&&prev!=null){
//             prev=prev.next;
//         }
//         temp.next=head;
       
//         prev.next=temp;
//         return head;
//     }

//     public static Node delete(Node head,int data){
//         Node temp=head;
//         if(head.data==data){
//             while(temp.next!=head){
//                 temp=temp.next;
//             }
//             temp.next=head.next;
//             head=head.next;
//             return head;
//         }
//         while(temp.next.data!=data){
//             temp=temp.next;
//         }
//         temp.next=temp.next.next;
//          return head;
//     }

//         public static void display(Node head){
//             if (head == null) return;
//         Node temp=head;

//         do{
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }while(temp!=head);
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         Node head=null;
//          head=insertatbeg(10,head);
//         head=insertatbeg(20, head);
//         head=insertatbeg(30, head);
//         head=insertatmid(25, 20, head);
//         head=insertatend(0, head);
//         head=delete(head, 30);
//         display(head);
        
//     }
// }
