public class hello{
  public static void main(String[] args) {
      int[]num={1,2,4,5,6,8,9};
      int target=5;
      int ans=findBinary(num,target);
      if(ans==-1){
        System.out.println("Target is not found :(");
      }else{
        System.out.println("The target in this "+ans+" index :)");
      }
  }
  public static int findBinary(int[]num,int target){
    int start=0;
    int end=num.length-1;

    while(start<=end){
      int mid=start+(end-start)/2;

      if(target>num[mid]){
        start=mid+1;
      }else if(target<num[mid]){
        end=mid-1;
      }else{
        return mid;
      }
    }
    return -1;
  }
}