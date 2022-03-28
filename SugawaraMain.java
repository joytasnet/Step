import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		System.out.print("何段？>>");
		int a =new Scanner(System.in).nextInt();
		for(int i=1 ; i<=a ; i++){
			for(int j=1 ; j<=i ; j++){
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
