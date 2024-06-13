import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int [] arr=new int[15];
		int sum=0,middle;
		for(int idx=0;idx<arr.length;idx++) {
			System.out.print("Enter element"+(idx+1)+": ");
			arr[idx]=scnr.nextInt();
		}
		middle=arr.length/2;
		sum=arr[0]+arr[14]+arr[middle]+arr[middle-1]+arr[middle+1]+arr[middle+2];
		System.out.println(sum);
		
		
		

	}

}
