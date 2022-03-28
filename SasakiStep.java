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
			for(int j=0;j<num;j++){
					System.out.print(j<i?" ":"*");
			}
			System.out.println();
		}
		//X
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print((j+i)%2==0?"X":" ");
			}
			System.out.println();
		}
		//ひし形

		System.out.print("好きな奇数を入れてください>>");
		int numNum = new Scanner(System.in).nextInt();
		int num22 = (numNum-1)/2;
		for(int i=0;i<numNum;i++){
			for(int j=0;j<numNum;j++){
				if(Math.abs(i-num22)+Math.abs(j-num22) == num22){
					System.out.print("X");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
