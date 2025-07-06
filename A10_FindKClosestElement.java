package A11_BinarySearch;
import java.util.*;
public class A10_FindKClosestElement {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int x=3 ; int k=5;
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if(x<arr[0]){
            for(int i=0;i<k;i++){
                ans.add(arr[i]);
            }
            for(int ele : ans)
                System.out.print(ele+" ");
            System.out.println();
            return ;

        }
        if(x>arr[n-1]){
            for(int i=n-1;i>=n-k;i--){
                ans.add(arr[i]);

            }
            Collections.sort(ans);
            for(int ele : ans)
                System.out.print(ele+" ");
            System.out.println();
            return;
        }
        int lb=n;
        int lo=0;int hi =n-1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(arr[mid]>=x){
                lb=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        int j=lb,i=lb-1;
        while(k>0 && i>=0 && j<n){
            int di=Math.abs(x-arr[i]);
            int dj=Math.abs(x-arr[j]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
            }
            else{
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while(i<0 && k>0){
            ans.add(arr[j]);
            j++;
            k--;

        }
        while(j>n-1 && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
        Collections.sort(ans);
        for(int ele : ans)
        System.out.print(ele+" ");

    }
}
