
// Merge two array into one and than find all similar elements from that array ......



class Main {
	public static void main(String []args) {

		int arr[]= {3,4,5,6,8};
		int arr2[]= {5,7,8,3};


		int fetch=arr.length+arr2.length;

		int nums[]=new int [fetch];

		for(int i=0; i<arr.length; i++) {
			nums[i]=arr[i];
		}
		for(int i=0; i<arr2.length; i++) {
			nums[arr.length + i]=arr2[i];
		}

	for(int i=0;i<nums.length;i++){
	    for(int j=i+1;j<nums.length;j++){
	        if(nums[i]==nums[j]){
	            System.out.println(nums[i]);
	        }
	    }
	}

	}
}