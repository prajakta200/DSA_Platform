/*Given an array arr[] of size n, find the first repeating element. The element
should occur more than once and the index of its first occurrence should be the
smallest.

Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
*/
 
 class FirstRepeat {
    static int ele(int arr[]){
        int temp=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] ){

                    temp=i;
                    break;
        
                }
                if(temp !=-1){
                    break;
                   }
            }
        
        }
        return temp;


    }
}
class Solution{
    public static void main(String[] args){
        int arr[]=new int[]{2,1,3,5,6,2,3};

       int value= FirstRepeat.ele(arr);
       System.out.println(value);
    }
}


