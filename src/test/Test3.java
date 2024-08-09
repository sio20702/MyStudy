package test;

import java.util.*;

public class Test3
{
	public static void main(String[] args)
	{
		System.out.println("String method indexOf() practice: ");
		String str="Please locate where 'locate' occurs.";
		System.out.println(str.indexOf("locate"));
		
		System.out.println("\nString method concat() practice: ");
		String str_="Su"; System.out.println(str_.concat("jeong"));
		System.out.println("to".concat("get").concat("her"));
		
		System.out.println("\nConcatenation btw int and str: ");
		String x="10"; int y=20;
		System.out.println(x+y);
		
		System.out.println("\nEscape sequences practice: ");
		System.out.println("\\n : "); System.out.println("Hello\nWorld");
		System.out.println("\\r : "); System.out.println("Hello\rWorld");
		System.out.println("System.lineSeparator() : "); System.out.println("Hello" + System.lineSeparator() + "World");
		System.out.println("\\t : "); System.out.println("Hello\tWorld");
		System.out.println("\\b : "); System.out.println("Hel\bloWorld");
		
		System.out.println("\nJava Math class practice: ");
		int a=5; int b=10; int c=-12;
		System.out.print("max: "); System.out.println(Math.max(a,b));
		System.out.print("min: "); System.out.println(Math.min(a,b));
		System.out.print("sqrt: "); System.out.println(Math.sqrt(a)+", "+Math.sqrt(b));
		System.out.print("abs: "); System.out.println(Math.abs(c));
		System.out.print("random1: "); System.out.println(Math.random());
		System.out.print("random2: "); System.out.println((int)(Math.random()*101));
		
		Random random=new Random(); //create obj for class Random
		int randomN=random.nextInt(10);
		System.out.print("\npseudo Random: "); System.out.println(randomN);
		
		random = new Random(1);
		System.out.print("\npseudo Random with seed 1: "); System.out.println(random.nextInt(10));
		
	
		System.out.print("\nTesting boolean expression: \n");
		System.out.println(10<9);
		int i=10; System.out.println(i==10);
	}
}
