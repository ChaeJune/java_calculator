package °è»ê±â;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		// TODO Auto-generated method stub
try{
	BigDecimal result= Calculator.Calculate(s);
	System.out.println(result);
}
catch(Exception e)
{
	e.printStackTrace();
}
	}

}
