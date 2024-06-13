import java.util.Scanner;
public class ArrayEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int [] arr=new int[5];
		int sum=0,cou=0;
		float avg=0;
		for(int idx=0;idx<arr.length;idx++) {
			System.out.print("Enter element"+(idx+1)+": ");
			arr[idx]=scnr.nextInt();
		}
		for(int idx=0;idx<arr.length;idx++) {
			if(idx%2==0) {
				cou++;
				sum+=arr[idx];
				avg=sum/cou;
				
			}
			
		}
		System.out.println("average of even indexes is:"+avg);
		
			
			
		

	}

}
