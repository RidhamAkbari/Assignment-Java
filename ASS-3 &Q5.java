public class Q5
{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int total = 0;
		int size = arr.length;
		for(int ele : arr){
			total +=ele;
		}
		
		System.out.println(total/size);
	}
}
		

 