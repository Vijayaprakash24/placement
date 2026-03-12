public class test {
    public static void main(String[] args) {
        // String hex1="4B";
        // int add=0;
        // int n=hex1.length();
        // for(int i=0;i<n;i++){
        //     if(hex1.charAt(i)>='0'&&hex1.charAt(i)<='9'){
        //         int rem=(hex1.charAt(i)-'0');
        //         add=rem+add*16;
        //     }else{
        //         int rem=(((char)(hex1.charAt(i)-'A')+10));
        //         add=rem+add*16;
        //     }
        // }
        // System.out.println(add);

//         String s1="train";
//         String s2="";
//        int i;
// for (i = 0; i < s1.length(); i++) {
//     char cr = s1.charAt(i);
//     System.out.print(cr);
// }

String hex="FF";
int sec1=Integer.parseInt(hex,16);
String sec=Integer.toOctalString(sec1);
System.out.println(sec);
    }
}
