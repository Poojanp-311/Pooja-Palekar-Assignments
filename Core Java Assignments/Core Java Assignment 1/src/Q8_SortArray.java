
public class Q8_SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array is:");
		for(int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+ " ");
		}
	}

}
