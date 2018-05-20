package com.fangjian;

public class TwoSum {
	public static void main(String[] args) {
		int[] a = {-1,-2,-3,-4,-5};
		int[] r = twoSum(a,-8);
		for (int i = 0; i < r.length; i++) {
			//System.out.println(i);
			System.out.println(r[i]);
		}

	}
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int length = nums.length;
		for (int i = 0; i < length; i++){
//            if (nums[i] > target){
//                continue;
			//          } else {
			int goal = target - nums[i];
			for (int x = i + 1; x < length; x++){
				if (nums[x] == goal) {
					result[0] = i;
					result[1] = x;
					return result;
				}
			}
			// }
		}
		return result;
	}
}
