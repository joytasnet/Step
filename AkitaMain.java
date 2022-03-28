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
		System.out.println();
		System.out.println("//逆");
		System.out.println();
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				System.out.print(j<i?" ":"*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("//X");
		System.out.println();
		for(int i = 1;i<=3;i++){
			for(int j = 1;j<=3;j++){
				System.out.print((i+j)%2==0?"x":" ");
			}
			System.out.println();
		}
	}
}
