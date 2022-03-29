import java.util.*;
public class NagatsuMain{
	public static void main(String[] args){
		/*System.out.print("何段？>>");
		int n = new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(j<i?" ":"*");
			}
			System.out.println();
		}*/
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print((i+j)%2==0?"X":" ");
			}
			System.out.println();
		}
	}
}
