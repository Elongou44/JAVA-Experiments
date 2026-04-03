package shuzu_paixu;
public class shuzu{
    public static void main(String[] args) {
        int[]arr=new int[]{5,2,3,1};
        int n =arr.length;
        for (int i=0;i<n-1;i++)
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        System.out.print("[");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i<3)
                System.out.print(",");
        }
        System.out.print("]");
    }
}