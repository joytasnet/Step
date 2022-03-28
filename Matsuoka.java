import java.util.*;
public class Matsuoka{
	public static void main(String[] args){
		int num;
		System.out.print("何段？>>");
		num=new Scanner(System.in).nextInt();
		for(int i=0;i<num;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<num;i++){
			for(int j=num;j>i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

