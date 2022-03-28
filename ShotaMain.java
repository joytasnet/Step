import java.util.*;
public class ShotaMain{
	public static void main(String[] args){
		System.out.println("なんだん>>");
		int num =new Scanner(System.in).nextInt();

		for(int i = 0; i< num+1; i++){
			for(int j = 0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

