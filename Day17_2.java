// class Node{
//     int data;
//     Node next,prev;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//         this.prev=null;
//     }
// }

// public class Day17_2 {
    
//     public static Node insertatbeg(Node head,int data){
//         Node temp=new Node(data);
//         if(head==null){
//             temp.next=temp;
//             temp.prev=temp;
//             head=temp;
//             return head;
//         }
//         Node last=head;
//         while(last.next!=head){
//             last=last.next;
//         }
//         last.next=temp;
//         head.prev=temp;
//         temp.next=head;
//         temp.prev=last;
//         head=temp;
//         return head;
//     }

//     public static void display(Node head){
//         if (head == null) return;
//         Node temp=head;

//         do{
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }while(temp!=head);
//         System.out.println("null");
//     }
    

//     public static void main(String[] args) {
//         Node head=null;
//         head=insertatbeg(head, 20);
//         head=insertatbeg(head, 30);
//         display(head);
//     }
// }
