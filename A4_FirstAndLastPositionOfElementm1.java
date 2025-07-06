//  Findind first and last position of element in sorted
//  array
package A11_BinarySearch;

public class A4_FirstAndLastPositionOfElementm1 {
    public static void main(String[] args) {
        int []arr ={10,10,20,20,20,20,30,30,40,50};
        int n = arr.length;
        int target =30;
        int lo = 0;int hi =n-1;
        // Binary search
        boolean flag = false;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target){
                flag = true;
                break;
            }
            else if(arr[mid]>target)hi=mid-1;
            else lo = mid+1;
        }
        if(!flag) System.out.println("not present");;

        // lower bound
        int lb = n;
        lo =0; hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=target){
                lb = Math.min(mid,lb);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        System.out.println("First element"+lb);

        // upperbound
        int ub = n;
        lo =0; hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>target){
                ub = Math.min(mid,ub);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        System.out.println("last element"+ (ub-1));
        
    }
}
