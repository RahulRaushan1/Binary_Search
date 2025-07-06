package A11_BinarySearch;

public class A11_SmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        int []arr={5,1,9,2};
        int t =6;
        int mx= Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
          mx= Math.max(mx,arr[i]);
        }
        int d=1;
        for( d=1;d<=mx;d++) {
            int sum = 0;
            for (int i = 0; i <n; i++) {
                if (arr[i] % d == 0) sum += arr[i]/d;
                else sum += arr[i]/ d + 1;
            }
            if(sum<=t) {
                break;}
            }
        System.out.print(" "+ d);
    }
}
