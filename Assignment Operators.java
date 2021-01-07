import java.io.*;
public class Ass{

public static void main(String args[])
{
	int a = 10;
	int b = 20;
	int c = 0;

	c = a + b;
	System.out.println("line 1 - value of c is" +c);

	c +=a;
	System.out.println("line 2  - value of c is" +c);

	c -=a;
	System.out.println("line 3 - value of c is" +c);

	c *=a;
	System.out.println("line 4 - value of c is"+ c);

	c /=a;
	System.out.println("line 5 - value of c is"+ c);
}
}
