/*Given a non-empty array of integers nums, every element appears
twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use
only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1
*/


import java.util.Scanner;

class Solution{
    static void SingleNum(int arr[]){
    
        for(int i=0;i<arr.length;i++){
            int count=0;
          for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count==1){
        System.out.println("Element occuring once in array is : "+ arr[i]);
        } 
    }
         
    }

}
class MainMeth{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] Arr={2,2,1};

        Solution.SingleNum(Arr);

        sc.close();




    }
}
