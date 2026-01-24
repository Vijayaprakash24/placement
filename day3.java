import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        // System.out.println("Enter the Number to Print days:");
        // int a=in.nextInt();
        // String ab=in.nextLine();

        // switch (ab) {
        //     case "Sunday":
        //         System.out.println("Sunday");
        //         break;
        //     case "Monday":
        //         System.out.println("Monday");
        //         break;
        //     case "Wednesday":
        //         System.out.println("Wednesday");
        //         break;
        //     case "friday":
        //         System.out.println("Friday");
        //         break;
        //     case "Tuesday":
        //         System.out.println("Tuesday");
        //         break;
        //     case "Thursday":
        //         System.out.println("Thursday");
        //         break;
        //     case "Saturday":
        //         System.out.println("Saturday");
        //         break;
        //     default:
        //         System.out.println("Invalid Number");
        //         break;
        // }

        // System.out.println("Enter value for n:");
        // int n=in.nextInt();
        // for(int i=1;i<=n;i++){
        //     System.out.print(i+" ");
        // }

        // System.out.println("Enter value for print Even numer n:");
        // int n=in.nextInt();
        // for(int i=2;i<=n;i=i+2){
        //     System.out.print("The Even number are up to"+" "+n+" "+i+" ");
        // }

        //  System.out.println("Enter value for print n:");
        // int n=in.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(i+"*"+n+"="+(i*n));
        // }

        // int sum=0;
        // System.out.println("Enter the number to sum:");
        // int n=in.nextInt();
        // for(int i=1;i<=n;i++){
        //     sum=sum+i;
        // }
        // System.out.println("Sum of number is:"+" "+sum);

        // System.out.println("Enter the number to find sum of digits:");
        // String n=in.nextLine();
        // for(int i=1;i<=10;i++){
        //     sum=n[i]%10;
        // }
        // System.out.println("Sum of number is:"+" "+sum);

        // int count=0;
        // System.out.println("Enter the number to find digits:");
        // int n=in.nextInt();
        // while(n!=0){
        //     n=n/10;
        //     count++;
        // }
        // System.out.println("Number of digits is:"+" "+count);

        // System.out.println("Sum of digits is:");
        // String n=in.nextLine();
        // int sum=0;
        // for(int i=0;i<n.length();i++){
        //     sum+=n.charAt(i)-'0';
        // }
        // System.out.println("Sum of digits is:"+sum);

        //  System.out.println("Sum of digits is:");
        // String n=in.nextLine();
        // int pow=n.length();
        // int sum=0;
        // int sum1=0;
        // for(int i=0;i<n.length();i++){
        //     for(int j=0;j<pow;j++){
        //         sum1=n.charAt(i)-'0';
        //     }
        //     sum+=n.charAt(i)-'0';
        // }
        // System.out.println("Sum of digits is:"+sum);

        //  System.out.println("Sum of digits is:");
        // int n=in.nextInt();
        // int pow=3;
        // int sum=0;
        // while (n!=0){
        //     int rem=n%10;
        //     sum+=Math.pow(rem,pow);
        //     n=n/10;   
        // }
        // System.out.println("Sum of digits is:"+sum);

        // int fact=1;
        // int n=in.nextInt();
        // for(int i=1;i<=n;i++){
        //     fact*=i;
        //     System.out.println(fact);
        // }

        // System.out.println("Enter the number:");
        // int n=in.nextInt();
        // int n1=0;
        // int n2=1;
        // for(int i=1;i<=n;i++){
        //     System.out.println(n1+" ");
        //     int n3=n1+n2;
        //     n1=n2;
        //     n2=n3;

        // }

        // System.out.println("Enter the number to check prime or not");
        // int b=in.nextInt();
        // Boolean prime=true;
        // for(int i=2;i<b;i++){
        //     if(b%i==0){
        //         prime=false;
        //         break;
        //     }
        // }
        // System.out.println(prime);
       
        // System.out.println("Enter the number to check prime or not");
        // for(int i=2;i<10;i++){
        //     Boolean prime=true;
        //     for(int j=2;j<=Math.sqrt(i);j++){
        //         if(i%j==0){
        //             prime=false;
        //             break;
        //         }       
        //     }
        //     if(prime){
        //      System.out.println(i);}
        // }

        // for(int i=1;i<=10;i++){
        //     if(i==2){
        //         break;
        //     }
        //     System.out.print(i+" ");  
        // }
        //   System.out.println(" ");
     
        //  for(int i=1;i<=10;i++){
        //     if(i%2==0){
        //         continue;
        //     }
        //     System.out.print(i+" ");  
        // }
        //   System.out.println(" ");
        
        // for(int i=1;i<=10;i++){
        //     if(i==5){
        //         return;
        //     }
        //     System.out.print(i+" ");
           
        // }
        //     System.out.println("j ");
           
        // int i=2;
        // do{
        //     System.out.println(i);
        //     i+=2;
        // }while(i<=10);

        int i=in.nextInt();
        String length=String.valueOf(i);
        for(int j=1;j<=length.length();j++){
            System.out.print(i%10);
            i/=10;

        }


        
    }
}
