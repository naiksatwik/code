import java.util.Arrays;

public class reverse{
    public static void main(String[] args) {
        int[]r={1,2,3,4};
        int[]ans=revBy(r);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] revBy(int[]num){
        int[]ans=new int[num.length];
        int j=0;
        for (int i=num.length-1;i>0;i--){
          ans[j]=num[i];
           j++;
        }
      return ans;
    }
}
