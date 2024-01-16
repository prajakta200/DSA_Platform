public class Program3 {
    public static void main(String[] args) {
        int arr[]=new int[]{2,11,15,6,9,7};
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        
        if (arr.length< 2) {
            return;
        }

        for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                   secondmin=min;
                   min=arr[i];
                }
                else if(arr[i]<secondmin && arr[i]!=min){
                    secondmin=arr[i];
                }
        }
        if (secondmin == Integer.MAX_VALUE) {
            System.out.println("Smallest and second smallest do not exist.");
        } else {
            System.out.println("Smallest element: " + min);
            System.out.println("Second smallest element: " + secondmin);
        }
    }
      
    }

