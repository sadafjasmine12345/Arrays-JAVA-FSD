import java.util.Scanner;
public class FibnoiiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int arr[]=new int[10];
		arr[0]=0;
		arr[1]=1;
		for(int idx=2;idx<10;idx++) {
			arr[idx]=arr[idx-1]+arr[idx-2];		
		}
		System.out.println("Array: ");
		for(int idx=0;idx<10;idx++) {
			System.out.print(" "+arr[idx]);
		}
		

	}

}
