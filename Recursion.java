public class recursion{
	public static void main(String[] args){
		int num=IO.readInt();
		System.out.println(num+"!="+ factorial(num));
	}
	public static int factorial(int n){
		if(n<0) return -1;
		if(n==0 || n==1) return 1;
		return n*factorial(n-1);
	}
	public static int binarySearch(int[] nums, int target, int low, int high){
		System.out.println("low: "+low+",high:"+high);
		if(low>high)return-1;
		int mid=(high+low)/2;
		int current=nums[mid];
		if(current==target) return mid;
		if(current<target) return binarySearch(nums,target,mid+1,high);
		if(current>target) return binarySearch(nums, target, low,mid-1);
		return -1;
	}
	public static int fib(int n){
		if(n==0 || n==1) return 1;
		if(n<0) return -1;
		return fib(n-1)+fib(n-2);
	}
}