package A11_BinarySearch;

public class A7_SqrtX {
    public static void main(String[] args) {
        int x=65;
        int lo=0;int hi=x;
        int sqrt=-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid*mid==x){
                sqrt=mid;
                break;}
            else if(mid*mid>x)hi=mid-1;
            else lo=mid+1;

        }
        if(sqrt== -1) sqrt=hi;
        System.out.println("squareroot :"+ sqrt);

    }
}
