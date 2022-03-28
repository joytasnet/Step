import java.util.*;
public class SasakiStep{
	public static void main(String[] args){
		System.out.print("何段>>");
		int num = new Scanner(System.in).nextInt();
		for(int i=0;i<num;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("//逆");
		for(int i=0;i<num;i++){
			for(int j=num;j>i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
