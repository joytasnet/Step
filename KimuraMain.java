import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		System.out.print("何段>>");
		int input = new Scanner(System.in).nextInt();

		for(int i=0;i<input;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
