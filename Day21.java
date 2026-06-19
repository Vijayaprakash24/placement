import java.util.Scanner;
class Day21{
    static public void prime(int n){
        if(n<=1){
            System.out.println("It is not an Prime number");
            return;
        }else{
            boolean flag=true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=false;
                }
            }
            if(flag){
                System.out.println("It is an prime number.");
            }else{
                System.out.println("It is not an prime number.");
            }
        }
    }

    static public void check(int n){
        if(n>0){
            System.out.println("It is Positive number.");
            prime(n);
        }else{
            System.out.println("Enter Positive number only");
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        // int jar=10;
        // int k=5;
        // int can=jar;
        // System.out.println("Enter the candies to buy by customer:");
        // int n=in.nextInt();
        // if(n>can){
        //     System.out.println("Invalid Input.");
        // }
        // else{
        //     can=can-n;
        //     System.out.println("No of candies sold:"+n);
        //     System.out.println("No of candies remaining in jar:"+can);
        //     if(can<k){
        //         can=jar;
        //         System.out.println("Jar as Refilled.");
        //     }
        // }

        // int[][] arr=new int[3][3];
        // int[] avg=new int[3];
        // System.out.println("Enter the oxygen level for trains:");
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         int value=in.nextInt();
        //         if(value<1||value>100){
        //             System.out.println("Invalid input.");
        //             return;
        //         }
        //            arr[i][j]=value;
        //     }
        // }

        // for(int i=0;i<arr.length;i++){
        //     int avg1=0;
        //     for(int j=0;j<arr[i].length;j++){
        //         avg1+=arr[i][j];
        //     }
        //     avg[i]=Math.round(avg1/3.0f);
        // }
        
        // int max=avg[0];
        // for(int i=1;i<avg.length;i++){
        //     if(avg[i]>max){
        //        max=avg[i];
        //     }
        // }

        // if(max<70){
        //     System.out.println("All the trains are unfit.");
        // }else{
        //     for(int i=0;i<avg.length;i++){
        //         if(avg[i]==max){
        //             System.out.println("The train is:"+(i+1));
        //         }
        //     }
        // }

        // System.out.println("Enter the weight of the clouth in grams:");
        // int weight=in.nextInt();
        // if(weight<0){
        //     System.out.println("Invalid Inputs.");
        // }else if(weight==0){
        //     System.out.println("0 Min.");
        // }else if(weight<2000){
        //     System.out.println("25 Mins");
        // }else if(weight>=2001&&weight<=4000){
        //     System.out.println("35 Mins");
        // }else if(weight<=7000){
        //     System.out.println("45 Mins.");
        // }else{
        //     System.out.println("Machine overloaded");
        // }

    //     System.out.println("Enter the Alphabets to Encryption:");
    //     String al=in.nextLine();
    //     System.out.println("Enter the key value:");
    //     int key=in.nextInt();
    //     String en="";
    //     for(int i=0;i<al.length();i++){
    //         char ch=al.charAt(i);
    //     if(Character.isAlphabetic(ch)){
    //     if(Character.isUpperCase(ch)){
    //         ch = (char)((ch - 'A' + key) % 26 + 'A');
    //     }
    //     else{
    //         ch = (char)((ch - 'a' + key) % 26 + 'a');
    //     }
    // }else if(Character.isDigit(ch)){
    //      ch = (char)((ch - '0' + key) % 10 + '0');
    // }


    // en = en + ch;

    //     }
    //     System.out.println(en);

    // double innerwallarea=0;
    // double exteerarea=0;
    // System.out.println("Enter the number of InnerWalls:");
    // int innerwalls=in.nextInt();
    // System.out.println("Enter the Number of Exteer Walls");
    // int exteerwalls=in.nextInt();
    // if(innerwalls>0){
    // for(int i=0;i<innerwalls;i++){
    //     innerwallarea+=in.nextDouble();
    // }}
    // if(exteerwalls>0){
    // for(int i=0;i<exteerwalls;i++){
    //     exteerarea+=in.nextDouble();
    // }}

    // double innercost=innerwallarea*18;
    // double exteercost=exteerarea*12;
    // double total=innercost+exteercost;
    // System.out.println(total);


    // int[] arr={800,600,750,900,1400,1200,1100,1500};
    // String[] place={"TH","GA","IC","HA","TE","LU","NI","CA"};
    // String so=in.nextLine();
    // String de=in.nextLine();
    // int totalarea=0;
    // int sindex=-1;
    // int dindex=-1;
    // for(int i=0;i<place.length;i++){
    //     if(place[i].equals(de)){
    //             dindex=i;
    //         }
    //          if(place[i].equals(so)){
    //             sindex=i;
    //         }
    //     if(sindex==-1||dindex==-1||so.equals(de)){
    //    System.out.println("Invalid Index.");
    //    return;  
    // }
    //         int j=sindex;
    //         while(!place[j].equals(de)){
    //              totalarea+=arr[j];
    //              j=(j+1)%place.length;
    //     }
    // }
 
    
    // double far=Math.ceil((totalarea/1000.0)*5);
    // System.out.println(far);

//     System.out.println("Enter the Number of Monkeys:");
//     int n=in.nextInt();
//     System.out.println("Enter number of Bananas eaten by single Monkey:");
//     int k=in.nextInt();
//     System.out.println("Enter the number of Peanuts eaten by single Monkey:");
//     int j=in.nextInt();
//     System.out.println("Enter the Total Numbers of Bananas:");
//     int m=in.nextInt();
//     System.out.println("Enter the Total Number of Peanuts:");
//     int p=in.nextInt();
//     if(n<=0||k<=0||j<=0||m<=0||p<=0){
//         System.out.println("Invalid Input");
//         return;
//     }
//     int remb=m/k;
//     int remp=p/j;
//     int onb=m%k;
//     int onp=p%j;
//     int total=remb+remp;
//     if(onb>0||onp>0){
//         total++;
//     }
//    total=n-total;
//    if(total<=0){
//     total=0;
//    }
    
//     System.out.println(total);

//     System.out.println("Enter the Parent name:");
    
   
//     String name=in.nextLine();
//     char ch=in.nextLine().charAt(0);
//     boolean flag=false;
//     int scm=5000;
//     int parentcom=0;
//     if(ch=='Y'||ch=='y'){
//        flag=true;
//     }
//     if(flag){
//         String child=in.nextLine();
//         String[] chil=child.split(",");
//         int tot=chil.length+1;
//         parentcom=chil.length*(scm*10/100);
//         System.out.println("Total Memebers"+tot);
//         System.out.println(name+":"+parentcom+"INR");

    
//     for(String child1:chil){
//            int chcom=scm*5/100;
//            System.out.println(child1+":"+chcom+"INR");
//     }
// }else{
//     int tot=1;
//     int com=scm*5/100;
//     System.out.println("Toatal Members:"+tot);
//     System.out.println("Commission Details.");
//     System.out.println(name+":"+com+"INR");
// }


    // char ch=in.nextLine().charAt(0);
    // if(ch=='c'||ch=='C'){
    //     int i=in.nextInt();
    //     System.out.println("Welcome to CCD!.");
    //     switch (i) {
    //         case 1:
    //             System.out.println("Espresso Coffee.");
    //             break;
    //         case 2:
    //             System.out.println("Cappuccino Coffee.");
    //             break;
    //         case 3:
    //             System.out.println("Latte Coffee.");
    //             break;
    //         default:
    //             System.out.println("Invalid Input.");
    //             break;
    //     }
    // }else if(ch=='t'||ch=='T'){
    //     int i=in.nextInt();
    //     System.out.println("Welcome to CCD!.");
    //     switch (i) {
    //         case 1:
    //             System.out.println("Plain Tea.");
    //             break;
    //         case 2:
    //             System.out.println("Assam Tea.");
    //             break;
    //         case 3:
    //             System.out.println("Ginger Tea.");
    //             break;
    //         case 4:
    //             System.out.println("Cardamom Tea");
    //             break;
    //         case 5:
    //             System.out.println("Masala Tea");
    //             break;
    //         case 6:
    //             System.out.println("Lemon Tea");
    //             break;
    //         case 7:
    //             System.out.println("Green Tea");
    //             break;
    //         case 8:
    //             System.out.println("Organic Darjeeling Tea");
    //             break;
    //         default:
    //             System.out.println("Invalid Input.");
    //             break;
    //     }
    // }else if(ch=='s'||ch=='S'){
    //     int i=in.nextInt();
    //     System.out.println("Welcome to CCD!.");
    //     switch (i) {
    //         case 1:
    //             System.out.println("Hot and Sour Soup.");
    //             break;
    //         case 2:
    //             System.out.println("Veg Corn Soup.");
    //             break;
    //         case 3:
    //             System.out.println("Tomato Soup.");
    //             break;
    //         case 4:
    //             System.out.println("Spicy Tomato Soup.");
    //             break;
    //         default:
    //             System.out.println("Invalid Input.");
    //             break;
    //     }
    // }else if(ch=='b'||ch=='B'){
    //     int i=in.nextInt();
    //     System.out.println("Welcome to CCD!.");
    //     switch (i) {
    //         case 1:
    //             System.out.println("Hot Chocolate Drink.");
    //             break;
    //         case 2:
    //             System.out.println("Badam Drink.");
    //             break;
    //         case 3:
    //             System.out.println("Badam-Pista Drink.");
    //             break;
    //         default:
    //             System.out.println("Invalid Input.");
    //             break;
    //     }
    // }else{
    //     System.out.println("Invalid Input");
    // }
 
      
    //   int amount=0;
    //   int i=0;
    //   while(i<20){
    //     String input=in.nextLine();
    //   if(input.isEmpty()){
    //     break;
    //   }
    //  int age=Integer.parseInt(input);
    //  if(age<=0||age>120){
    //     System.out.println("INVALID INPUT");
    //     break;
    //  }else if(age<17){
    //     amount+=200;
    //  }else if(age>=17&&age<40){
    //     amount+=400;
    //  }else if(age>=40){
    //     amount+=300;
    //  }
    // }
    // System.out.println("Total Income "+amount+" INR");

    int n=in.nextInt();
    check(n);

    




    }
}