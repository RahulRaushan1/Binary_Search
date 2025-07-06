package A11_BinarySearch;

public class A3_UpperBound {
    public static void main(String[] args) {
        int[]arr= {10,20,30,30,40,50,60,70};
        int n = arr.length;
        int target=30;
        int ub = 8;
        int lo = 0;
        int hi =n;
        while(lo<=hi){
          int mid = (lo+hi)/2;
          if(arr[mid]>target){
              ub= Math.min(ub,mid);
              hi = mid-1;
          }
          else lo= mid+1;
        }
        System.out.println(ub);
    }
}
