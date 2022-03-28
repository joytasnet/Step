import java.util.*;
public class Matsuoka{
	public static void main(String[] args){
		int num;
		String mark="*";
		System.out.print("何段？>>");
		num=new Scanner(System.in).nextInt();
		for(int i=0;i<num;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				System.out.print(j<i?" ":"*");
			}
			System.out.println();
		}
		//X
		for(int i=0;i<3;i++){
			for(int j=0;j<1;j++){
				System.out.print(i%2!=0?" X ":"X X");
			}
			System.out.println();
		}
	}
}

