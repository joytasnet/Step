import java.util.*;
public class StepMain{
	public static void main(String[] args){
		System.out.print("何段>>");
		int n=new Scanner(System.in).nextInt();

		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//逆
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(j<i? " ":"*");
			}
			System.out.println();
		}
		//x

	}
}
