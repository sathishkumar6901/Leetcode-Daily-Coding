/*******************************************Question*******************************/
Find Peak Element

A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

  
Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
  
  
Example 2:
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 

Constraints:
1 <= nums.length <= 1000
-231 <= nums[i] <= 231 - 1
nums[i] != nums[i + 1] for all valid i.
  
Program:(Using Two Pointer)

import java.util.*;

class Solution {
    public int findPeakElement(int[] nums) {
        int i=0,j=nums.length-1;//one pointer points the start index and another one index points to the end index
        while(i<j)//iterate till both the pointers are meet
        {
            if(nums[i]>=nums[j])//if starting element greater than or equal to ending element then move towards to the leading pointer otherwise move towards to the end element.
                j--;
            else
                i++;
        }
        return i;
    }
}
public class FindPeakElement
{
  public static void main(String args[])
  {
    FindPeakElement ob = new FindPeakElement();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
    int result = findPeakElement(arr);
    System.out.println(result);
  }
}
