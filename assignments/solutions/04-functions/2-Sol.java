import java.util.*;

public class Main{

	public static String check(int num){
		String res = "";
		if(num%2==0)
			res="even";
		else
			res="odd";
		return res;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result = check(num);
		System.out.printf("The given number %d is an %s number.",num,result);
	}
}