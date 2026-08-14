public class Solution {
    static int count;
    public static int reversePairs(int[] arr){
        count=0;
        mergeSort(arr);
        return count;

    }
    public static void inversion(int[] a, int[] b){
        int i=0;
        int j=0;
        while(i<a.length && j<b.length ){
            if((long)a[i]>(long)(2*(long)b[j])) {
                count+=(a.length-i);
                j++;
            }
            else i++;
        }
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n<=1) return;
        int indx =0;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0;i<a.length;i++) a[i]=arr[indx++];
        for(int i=0;i<b.length;i++) b[i]=arr[indx++];
        mergeSort(a);
        mergeSort(b);
        inversion(a,b);
        merge(a,b,arr);
    }
    public static void merge(int[] a,int[] b,int[] arr){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) {
                arr[k++]=a[i++];
            }
            else {
                arr[k++]=b[j++];
                }
            }
        while(i<a.length) arr[k++]=a[i++];
        while(j<b.length) arr[k++]=b[j++];
    }
}

