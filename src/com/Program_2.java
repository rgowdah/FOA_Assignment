package com;

//Divide and Conquer Approach
public class Program_2 {
	public static int divAndConq(int[] nums,int start,int end){	
		if(start==end)return nums[start];
		int middle=(start+end)/2;
		int left=divAndConq(nums,start,middle);
		int right=divAndConq(nums,middle+1,end);
        int subMax = Math.max(left,right);
		int lmax = nums[middle];
        int temp = nums[middle];
        for(int i=middle-1;i>=start;i--) {
            temp += nums[i];
            if(temp > lmax) lmax = temp;
        }
        if(lmax <= 0)
            return subMax;
        temp = nums[middle+1];
        int rmax = nums[middle+1];
        for(int i=middle+2;i<=end;i++) {
            temp += nums[i];
            if(temp > rmax) rmax = temp;
        }
        if(rmax <= 0)
            return subMax;
        return Math.max(subMax,lmax+rmax);
	}
	public static int maxSubArray(int[] nums) {
		if(nums.length==0)return 0;
		int start=0;
		int end=nums.length-1;		
		return divAndConq(nums,start,end);
	}
	public static void main(String[] args) {
		int[] nums={1,2,-1,-2,2,1,-2,1,4,-5,4};
		System.out.println(maxSubArray(nums));
	}
}

/*Brute force--time limit exceeded
int ans=nums[0];
for (int i = 0; i < nums.length; i++) {
	int sum=0;
	for (int j = i; j < nums.length; j++) {
		sum+=nums[j];
		if(sum>ans)
			ans=sum;
			}
			}	*/