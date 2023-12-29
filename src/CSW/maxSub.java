package CSW;

public class maxSub
{
    public static void main(String[] args) {
        int arr[]={0,-4,-7,11};
        int currSum=0;
        int Maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
             currSum=Math.max(currSum+arr[i],arr[i]);
             Maxsum=Math.max(currSum,Maxsum);
        }
        System.out.println(Maxsum);
    }
}
