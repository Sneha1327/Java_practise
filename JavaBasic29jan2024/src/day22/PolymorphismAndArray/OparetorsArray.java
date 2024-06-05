package day22.PolymorphismAndArray;

public class OparetorsArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 5,6,4,1,3,2};
		for(int num: arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		double addition=0;
		double subtract=0, multiplication=1, Average; 
		for(int num1: arr) {
			addition += num1;
		}
		System.out.println("Addition of array is: "+addition);
	
	for(int num2: arr) {
		subtract -= num2;
	}
	System.out.println("subtraction of array is: "+subtract);
	
	
	for(int num: arr) {
		multiplication =multiplication * num;
	}
	System.out.println("multiplication of array is: "+multiplication);
	
	Average= addition/arr.length;
	System.out.println("Average of Array is: "+Average);
	}
}/*


*/
