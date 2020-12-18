package bubblesort;

public class BubbleSortdemo {
	public static void main(String[] args) {
		
		int array[]= {8,13,20,5,1,17,25,6};
		
		System.out.println("Before sorting: ");
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println("After sorting: ");
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
