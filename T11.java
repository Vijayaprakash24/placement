import java.util.ArrayList;
import java.util.List;

public class T11 {
    public static void count(int num){
        if(num==0) return;
        System.out.println(num);
        count(num-1);
    }

     public static int fact(int num){
        if(num==0) return 1;
        
        return fact(num-1)*num;
    }

    public static boolean palidrom(String s,int r,int l){
        if(l>=r) return true;
        char r1=s.charAt(r);
        char l1=s.charAt(l);
        if(r1!=l1) return false;
        
        return palidrom(s, r-1, l+1);
        
        
    }
  
    public static int power(int a,int b){
        if(b==0) return 1;
    
        return a*power(a,b-1);
    }

    public static void stack(int n){
        if(n==0) return;
        System.out.println("Start"+n);
        stack(n-1);
        System.out.println("End"+n);
    }
    public static void subset(int[] nums,int index,String current){
        if(index==nums.length){
            System.out.println(current);
            return;
        }
        subset(nums, index+1,current+nums[index]+"");
        subset(nums, index+1,current);
    }
    public static void backtrack(int[] nums,int index,List<Integer> current){
        if(nums.length==index){
            System.out.println(current);
            return;
        }
        current.add(nums[index]);
        backtrack(nums, index+1, current);
        current.remove(current.size()-1);
        backtrack(nums, index+1, current);

    }
    public static void main(String[] args) {
        // count(10);
        // System.out.println(fact(5));
        // String s="mam";
        // System.out.println(palidrom(s, s.length()-1, 0));
        // System.out.println(power(2,4));
        // stack(5);
        int[] nums={1,2};
        // subset(nums,0,"");
        backtrack(nums, 0,new ArrayList<>());
    }
}
