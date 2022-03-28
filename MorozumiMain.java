import java.util.*;
public class MorozumiMain{
	public static void main(String[] args){
		System.out.println("何段>>?");
		int n = new Scanner(System.in).nextInt();
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
