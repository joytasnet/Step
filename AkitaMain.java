import java.util.*;
public class AkitaMain{
	public static void main(String[] args){
		System.out.print("何段？>>");
		int n = new Scanner(System.in).nextInt();
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
