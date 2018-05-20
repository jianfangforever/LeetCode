package com.fangjian;
/**
 * @author fangjian
 * @date 2018/5/19
 *给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 *你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *示例:
 *给定 nums = [2, 7, 11, 15], target = 9
 *因为 nums[0] + nums[1] = 2 + 7 = 9
 *所以返回 [0, 1]
*/
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
		//
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
