public class RemoveEle {
    public static void main(String[] args) {
        int arr[]=new int[]{3,2,2,3};
        int arr1[]=new int[arr.length];
        int val=3;
        int temp,count=0;
        

        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i]!=val){
                temp=arr[i];
                arr1[j]=temp;
                count++;
            }
            j++;
        
        }
        System.out.println("Number of Array elements after removal : "+ count);
        for(int i=0;i<arr.length;i++){
          System.out.print(arr1[i]+" ");
        }
    }
}
