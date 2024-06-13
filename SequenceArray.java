import java.util.Scanner;
public class SequenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int [] arr=new int[8];
		int count=0;
		for(int idx=0;idx<arr.length;idx++) {
			System.out.print("Enter element"+(idx+1)+": ");
			arr[idx]=scnr.nextInt();
		}
		for(int idx=0;idx<arr.length;idx++) {
			if(arr[0]==1 && arr[1]==2 && arr[2]==3) {
				count=0;	
			}
			else {
				count++;
			}
		}
		if(count==0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
