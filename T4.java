public class T4 {
    static int[] queue=new int[5];
    static int front=0;
    static int rear=-1;

    static void inzqueue(int data){
        if(rear==queue.length-1){
            System.out.println("Queue is Full.");
            return;
        }
        rear++;
        queue[rear]=data;
    }

    static void dequeue(){
        if(rear<front){
            System.out.println("Queue is Empty.");
            return;
        }
        System.out.println("Removed element is:"+queue[front]);
        front++;
    }

    static void dsplay(){
      
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i] + " ");
        }
    System.out.println();
    }

    static void cirdisplay(int data){
       
       rear=(rear+1)%queue.length;
       queue[rear]=data;

    }

    public static void main(String[] args){
        // inzqueue(10);
        // inzqueue(20);
        // inzqueue(30);
        // inzqueue(50);
        // inzqueue(60);
        // dsplay();
        // dequeue();
        // cirdisplay(80);
        // dsplay();
        int[] arr = {1, -2, 3, 4};
int k = 3;
int max = Integer.MIN_VALUE;

for (int i = 0; i <= arr.length - k; i++) {
    int sum = 0;

    for (int j = i; j < i + k; j++) {
        sum += arr[j];
    }

    max = Math.max(max, sum);
}

System.out.println(max);
    }
}
