public class T12{
    public static int findnumber(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) high=mid-1;
            if(nums[mid]<target) low=mid+1;
            
        }
        return -1;
    }

    public static int upperbound(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) high=mid-1;
            if(nums[mid]<target) low=mid+1;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,90};
        System.out.println(findnumber(arr, 90));
    }
}