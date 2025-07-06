package A11_BinarySearch;

public class A9_SearchInRotatedSortedArrayM2 {
    public static void main(String[] args) {
        int []arr={3,4,5,6,7,12,0,1,2};
        int n = arr.length;
        int target = 6;
        int indx=-1;
        int lo =0,hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (arr[mid]==target) {
                indx= mid;break;
            }
            else if(arr[mid]<=arr[hi]){ // i am in right sorted array(mid to high everything is sorted)
                if(target>arr[mid] && target<=arr[hi]) lo=mid+1;
                else hi=mid-1;
            }
            else if(arr[mid]>=arr[hi]) { // i am in left sorted array(lo to mid everything is sorted)
                if(target>=arr[lo] && target<arr[mid]) hi = mid-1;
                else lo = mid+1;
            }
        }

        System.out.println(indx);
    }
}
