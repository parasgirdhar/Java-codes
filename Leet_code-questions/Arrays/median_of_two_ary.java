class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
   
   int []c=new int [nums1.length + nums2.length];
   int k=0;
   for(int i=0;i<nums1.length;i++){
     c[k++] = nums1 [i];
   }
   for(int i=0;i<nums2.length;i++){
      c[k++] = nums2 [i];
   }

   Arrays.sort(c);

int len=c.length;

    if(len % 2 == 0){
   return (c[ len/2] + c[len/2-1])/2.0;
    }
    else{
        return (c[len / 2]);
    }
    }
}