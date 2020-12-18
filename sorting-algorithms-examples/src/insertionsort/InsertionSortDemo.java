package insertionsort;

public class InsertionSortDemo {
	public static void main(String[] args) {
		
		int array[] = {5,1,6,2,2,3};
		
		System.out.println("Before sort: ");
		for(int item: array) {
			System.out.print(item+" ");
		}
		System.out.println();
		for(int i=1;i<array.length;i++) {
			int j=i;
			int temp=array[j];
			for(;j>0;j--) {
				if(array[j-1]>temp) {
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		
		System.out.println("After sort: ");
		for(int item: array) {
			System.out.print(item+" ");
		}
		
		
	}
}
