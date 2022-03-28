import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		System.out.print("何段？>>");//段→行
		int n =new Scanner(System.in).nextInt();
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<=i ; j++){//j<=iとすることでiの数分＊を表示してくれる
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("//逆");
		for(int i=0 ; i<n ; i++){//i=行(横のライン) , j=列(縦のライン)
			for(int j=0 ; j<n ; j++){//j<=iとすることでiの数分＊を表示してくれる
				System.out.print(j<i?" ":"*");//列のカウントが行のカウントよりも少ない時は"　",多いときは"＊"
			}
			System.out.println();
		}

		//Xとスペース
		for(int i=0 ; i<3 ; i++){
			for(int j=0 ; j<3 ; j++){
				System.out.print((i+j)%2==0?"X":" ");
			}
			System.out.println();
		}
		for(int i=0 ; i<3 ; i++){
			for(int j=0 ; j<3 ; j++){
				System.out.print((i+j)%2==0?"X":" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
//for(int i=0 ; i<a ; i++){
// for(int j=0 ; j<i+1 ; j++){
//  System.out.print("*");
// }
// System.out.println();
//}
