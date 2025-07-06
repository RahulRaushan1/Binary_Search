package A11_BinarySearch;

public class M2 {
    public static void main(String[] args) {
        int []arr={5,1,9,2};
        int t =6;
        int mx= Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            mx= Math.max(mx,arr[i]);
        }
        int d=1;
        int lo=1;int hi =mx;
        while(lo<=hi){
            int mid= lo + (hi-lo)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]%2==0) sum += arr[i]/mid;
                else sum += arr[i]/mid +1;
            }
            if(sum<=t){
                d=mid;
                hi = mid-1;

            }
            else lo=mid+1;
        }
        System.out.println(d);
    }
}
