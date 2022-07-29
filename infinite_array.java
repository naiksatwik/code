public class infinite_array {

    public static void main(String[] args) {
        //take an array of interger with asc and dsc order
        int[]num={2,4,5,6,7,8,9,8,6,3,2,1};
        int ans=findBinary(num);//caling the function
        System.out.println(ans);//print ing the ans
    }
    public static int findBinary(int[]num){
        int start=0;
        int end=num.length-1;

        if(start<=end){
            int mid=start+(end-start)/2;
            if(num[mid]>num[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return num[start];
    }
}
