package Collections.ArrayList.DSA;

public class Rotate_2D_Array90degree {

	public static void main(String[] args) {
		int arr[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		//Transpose for matrix
				
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j < i; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		System.out.println("After Transpose of Matrix");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		//Reverse of each row of Matrix
		for(int i=0; i<arr.length; i++) {
				int k=0;
				int	l=arr.length-1;
				while(k < l) {
					int temp=arr[i][k];
					arr[i][k]=arr[i][l];
					arr[i][l]=temp;
					k++;
					l--;
				}
		}
		
		System.out.println("After Reverse of Each row of Matrix");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
