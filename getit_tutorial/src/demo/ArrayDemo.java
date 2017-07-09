package demo;

public class ArrayDemo {
	protected static int[] array; 
	public static void main(String[] args) {
		array=new int[10]; 
		
		array[0]=10;
		array[1]=20;
		array[2]=30;
		
		
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		System.out.println(array[3]);
		
		for(int i=0;i<=3;i++){
			System.out.println(array[i]);
		}
		
		int j=0;
		do{
			System.out.println(array[j]);
			j++;
		}
		while(j<=3);
		
		
//		System.out.println(array[11]);
		
		int[][] twoDarray=new int[10][10]; 
		
		twoDarray[3][2]=100;
		System.out.println(twoDarray[3][2]);
	}
}
