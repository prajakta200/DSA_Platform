/*Given an array Arr of N positive integers and another number X. Determine
whether or not there exist two elements in Arr whose sum is exactly X.

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
*/
 
 class keyPair {
    static void EqeSum(int arr[],int X){
    
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==X){
                    System.out.println("Yes");
                }
            }
        }
    }
}
class Solution{
    public static void main(String[] args){
        int arr[]=new int[]{1,2,4,3,6};

        int num=10;

        keyPair.EqeSum(arr,num);
    }
}
