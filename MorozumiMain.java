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
		System.out.println("//逆");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
					System.out.print(j<i? " ":"*");
				}
				System.out.println();
		}
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print((i+j)%2==0?"X":" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<2; i++){
			for(int j=0; j<7; j++){
				System.out.print((i+j)%2==0?"X":" ");
			}
			System.out.println();
		}
	}
}
