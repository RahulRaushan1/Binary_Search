package A11_BinarySearch;

public class A6_PeakMountainArray {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50,60,70,90,20,10};
        int n = arr.length;
        int lo=1,hi=n-2;
        int pi=-1;
        while(lo<=hi){
           int mid=lo +(hi-lo)/2;
           if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
               pi=mid;
               break;
           }
           if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo=mid+1;
           if(arr[mid]<arr[mid-1]&& arr[mid]>arr[mid+1]) hi=mid-1;
        }
        System.out.println("peak index:"+ pi);
    }
}
