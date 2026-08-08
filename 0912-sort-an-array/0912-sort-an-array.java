class Solution {
    public int[] sortArray(int[] nums) {
        // we will use merge sort due to its stability in case of duplicates 
        mergeSort(nums);
        return nums;
    }
    public void mergeSort(int[] arr){
        int n = arr.length;
        if(n<=1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int indx =0;
        for(int i=0;i<a.length;i++) a[i]=arr[indx++];
        for(int i=0;i<b.length;i++) b[i]=arr[indx++];
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }
    public void merge(int[] a,int[] b,int[] c){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];

        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];

    }
}