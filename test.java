public class test {
    public static void main(String[] args) {
        String hex1="4B";
        int add=0;
        int n=hex1.length();
        for(int i=0;i<n;i++){
            if(hex1.charAt(i)>='0'&&hex1.charAt(i)<='9'){
                int rem=(hex1.charAt(i)-'0');
                add=rem+add*16;
            }else{
                int rem=(((char)(hex1.charAt(i)-'A')+10));
                add=rem+add*16;
            }
        }
        System.out.println(add);
    }
}
