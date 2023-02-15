/****************************************Question*************************************/
Add to Array-Form of Integer

The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

  
Example 1:
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
  
  
Example 2:
Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
  
  
Example 3:
Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
 

Constraints:
1 <= num.length <= 104
0 <= num[i] <= 9
num does not contain any leading zeros except for the zero itself.
1 <= k <= 104
  
Program:

import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<Integer>();//initialize the empty LinkedList
        int carry=0,i=num.length-1;
        while(i>=0 || k>0 || carry==1)
        {
            int a=i>=0?num[i]:0;// array index > 0 take array element at the specified index otherwise 0
            int b=k%10;
            carry+=a+b;
            result.addFirst(carry%10);//perform the mulo operation with carry and store it into the linkedlist as front element.
            carry/=10;//divide the carry by 10 to get the quotient.
            k/=10;//divide the k value by 10 for the place value of 10th or 100th value
            i--;
        }
        return result;
    }
}
class AddtoArrayFormofInteger
{
  public static void main(String args[])
  {
    AddtoArrayFormofInteger ob = new AddtoArrayFormofInteger();//create an object the class
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();//read the array elements for an array
    int k = sc.nextInt();
    List<Integer> list = addToArrayForm(arr,k);
   System.out.println(list);
  }
}
