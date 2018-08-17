import java.util.Scanner;
class UserInput
{
	public static void main(String args[])
   {
   int a,b,c;
   System.out.println("Enter Two number");
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   c=a+b;
   System.out.println(c);
   }
}