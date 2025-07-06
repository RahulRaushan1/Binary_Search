package A11_BinarySearch;

public class A5_FirstAndLastPositionM2 {
    public static void main(String[] args) {
      int []arr={10,10,20,20,20,20,20,30,30,30,40,50,60,70};
      int n = arr.length;
      int target=30;
      int lo=0;int hi=n-1;
      // First Position
        int fp=-1;
      while(lo<=hi){
         int mid = lo + (hi-lo)/2;
         if(mid>0 && arr[mid]==target){
             if(arr[mid]==arr[mid-1])
                 hi=mid-1;
             else{
                 fp=mid;
                 break;
             }
         }
         else if(arr[mid]>target)hi=mid-1;
         else if(arr[mid]<target)lo=mid+1;
      }
        System.out.println("fisrt position :" + fp );
      // last position
        int lp =-1;
        lo=0;hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid<n-1 && arr[mid]==target){
                if(arr[mid]==arr[mid+1])
                    lo=mid+1;
                else{
                    lp =mid;
                    break;
                }
            }
            else if(arr[mid]>target)hi=mid-1;
            else if(arr[mid]<target)lo=mid+1;
        }
        System.out.println("last position :"+ lp);
    }
}
