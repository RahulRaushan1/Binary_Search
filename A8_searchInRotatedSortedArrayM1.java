package A11_BinarySearch;
public class A8_searchInRotatedSortedArrayM1 {
    public static int bs(int[]arr ,int lo,int hi,int target){
        int n =arr.length;
         lo =0;hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]>target) hi=mid-1;
            else lo = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
    int []arr={3,4,5,6,7,12,0,1,2};
    int n = arr.length;
    int target=6;
    int lo=0;int hi=n-1;
    int p=-1;
    while(lo <= hi){
        int mid= lo+(hi-lo)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
            p=mid;
            break;
        }
        else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){
            p=mid-1;
            break;
        }
        else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
            if(arr[mid]>arr[n-1])lo=mid+1;
            else hi=mid-1;
        }


    }
        System.out.println(p);
        bs(arr,0,p,6);
        bs(arr,p+1,n-1,6);
        System.out.println( bs(arr,0,p,6));
        System.out.println(bs(arr,p+1,n-1,6));



    }
}
