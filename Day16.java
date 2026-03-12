// class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
      
//     }

// class Day16{

//       public static Node insertbeg(Node head,int data){
//             Node temp=new Node(data);
//             if(head==null){
//                 head=temp;
                
//             }else{
//                temp.next=head;
//                head=temp;
//             }
//             return head;
//         }

//         public static Node insertmid(Node head,int data){
//             int key=30;
//             Node temp=new Node(data);
//             Node prev=head;
//             while(prev.data!=key){
//                 prev=prev.next;
//             }
//             temp.next=prev.next;
//             prev.next=temp;
//             return head;
//         }

//         public static Node insertatend(Node head,int data){
//             Node temp=new Node(data);
//             Node last=head;
//             while(last.next!=null){
//                 last=last.next;
//             }
//             last.next=temp;
//             return head;
//         }

//         public static void display(Node head){
//          Node temp=head;

//          while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//          }
//         System.out.println("null");
//         }

//         public static Node delete(Node head,int key){
//             Node temp=head;
//             Node prev=null;
//             if(head.data==key){
//                 head=head.next;
//             }
//             while(temp!=null&&temp.data!=key){
//                 prev=temp;
//                 temp=temp.next;
//             }
            
//             if(temp==null){
//                 System.out.println("No node Present with in give node");
//                 return head;
//             }
//             prev.next=temp.next;
//             return head;
//         }
        
//     public static void main(String[] args) {
//         Node head=new Node(10);
//         display(head);
//         head=insertbeg(head, 20);
//         display(head);
//         head=insertbeg(head,30);
//         display(head);
//         head=insertmid(head, 60);
//         display(head);
//         head=insertatend(head, 1);
//         display(head);
//         head=delete(head, 1);
//         display(head);

        
//     }
// }