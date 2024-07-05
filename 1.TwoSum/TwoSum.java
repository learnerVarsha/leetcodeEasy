//Author: Varsha Rajawat
//Date: 5 July 2024
//Source: https://leetcode.com/problems/two-sum/description/?source=submission-ac

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create hashmap to store the number and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // calculate the complement
            int complement = target - nums[i];
            // check if the complement is present
            if (map.containsKey(complement)) {

                // return integer array with the complement index and the current index
                return new int[] { map.get(complement), i };
            }

            // else add the number and its index to the map and move on
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}