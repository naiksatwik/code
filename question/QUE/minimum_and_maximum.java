package QUE;

public class minimum_and_maximum {
    public static void main(String[] args) {
        int[]arr={1,2,3,-1,1000,2,5};

        // time complexity O(n)

        
        long min=99999999999L;
        long max=-1;

        for(int i=0; i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        for(int i=0; i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println("min element:"+min);
        System.out.println("max element:"+max);

    }
}
