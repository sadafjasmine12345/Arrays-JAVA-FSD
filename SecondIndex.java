import java.util.Scanner;

public class SecondIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int [] arr=new int[5];
		int esum=0,osum=0;
		for(int idx=0;idx<arr.length;idx++) {
			System.out.print("Enter element"+(idx+1)+": ");
			arr[idx]=scnr.nextInt();
		}
		for(int idx=0;idx<arr.length;idx++) {
			if(idx%2==0||arr[2]%2!=0) {
				esum+=arr[idx];	
			}
			else if(idx%2!=0){
				osum+=arr[idx];
			}
			
		}
			System.out.println("evensum:"+esum);
			System.out.println("oddsum:"+osum);
		}
				

	}


