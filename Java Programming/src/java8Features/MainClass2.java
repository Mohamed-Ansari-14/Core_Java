package java8Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface calc1
{
	int add(int num1,int num2);
}

interface calc2
{
	boolean greatest(int num1,int num2);
}

class MyThread implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Hiiiiiiiiii");
	}
}

public class MainClass2 
{
	public static void main(String[] args) 
	{
		calc1 c1 = (a,b)->a+b;
		System.out.println(c1.add(10, 20));
		
		calc2 c2 = (a,b)->a < b;
		System.out.println(c2.greatest(100, 200));
		
		MyThread mt1 = new MyThread();
		Thread t1 = new Thread(mt1);
		t1.start();
		
		Runnable r1 = new Runnable() 
		{
			@Override
			public void run() 
			{
				System.out.println("Hellooooooo");
			}
		};
		
		Thread t2 = new Thread(r1);
		t2.start();
		
		Runnable r2 = ()->System.out.println("Byeeeeee");		//==>Overriding... By Using Lambda Expression
		Thread t3 = new Thread(r2);
		t3.start();
		
		Thread t4 = new Thread(()->System.out.println("Good Byeeeeee"));	//==>Overriding... By Using Lambda Expression
		t4.start();
		
		Consumer<Integer> c = (n)->System.out.println(n*n);
		c.accept(5);
		c.accept(4);
		
		Predicate<Integer> p = (n)->n>0;
		System.out.println(p.test(5));
		
		Function<Integer, Integer> f = (n)->n*n*n;
		System.out.println(f.apply(3));
			
	}
}




























