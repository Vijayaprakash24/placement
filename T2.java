
// class  Node {
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
    
// }
// public class T2 {
//         public static Node insertatbeg1(int data,Node head){
//             Node temp=new Node(data);    
//             if(head==null){
//                 head=temp;
//             }else{
//                 temp.next=head;
//                 head=temp;
//             }
//             return head;
//         }

//         public static Node insertatend(int data,Node head){
//             Node temp=new Node(data);
//             Node last=head;
//             if(last==null){
//                 head=temp;
//             }else{
//                 while(last.next!=null){
//                     last=last.next;
//                 }
//                 last.next=temp;
                
//             }
//             return head;
//         }

//         public static Node deletenode(int data,Node head){
//             Node last=head;
//             Node prev=null;
//             if(head.data==data){
//                 head=head.next;
//             }
//              while(last.data!=data&&last!=null){
//                     prev=last;
//                     last=last.next;
//                 }
                
//             if(last==null){
//                  System.out.println("No Nodes Found.");
//                  return head;
//             }
//             prev.next=last.next;
//             return head;
//         }

//         public static void middle(Node head){
//             Node temp=head;
//             int count=0;
//             int prev=0;
//             while(temp!=null){
//                 count++;
//                 temp=temp.next;
//             }
//             int avg=count/2;
//             temp=head;
//             int n=0;
//             while(temp!=null&&n!=avg){
//                 prev=temp.next.data;
//                 temp=temp.next;
//                 n++;
//             }
//             System.out.println();
//             System.out.println(prev);
//         }

//         public static void display1(Node head){
//             Node temp=head;
//             while(temp!=null){
//                 System.out.print(temp.data+"->");
//                 temp=temp.next;
//             }
//         }
//         public static void revdisplay1(Node head){
//             Node curr=head;
//             Node prev=null;
//             Node next=null;
//             while(curr!=null){
//                 prev=curr.next;
//                 next=prev.next;
//                 curr=prev;
//             }
//         }

//         public static Node merge(Node head,Node head1){
//             Node temp=head;
//             Node temp1=head1;
//             Node prev;
//             if(head==null){
//                 return head1;
//             }else if(head1==null){
//                 return head;
//             }else{
//                 while(temp!=null){
//                     prev=temp;
//                     temp=temp.next;
//                 }
//                 temp.next=head1;
//             }
//             return temp;
//         }
    
//     public static void main(String[] args) {    
//        Node head=new Node(10);
//        Node head1=insertatbeg1(20, head);
//        Node head2=insertatend(30, head1);
//         Node head4=insertatend(40, head2);
//          Node head5=insertatend(50, head4);
//     //    Node head3=deletenode(10, head2);
//        display1(head5);
//        middle(head5);
//        Node final1=merge(head5, head2);
//        display1(final1);


//     }
// }
