import java.util.Scanner;
public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"-"+arr[i].length());
		}
	}


}

