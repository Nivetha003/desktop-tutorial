import java.util.Scanner; 
public class Great
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    if((a>b || a>c) || (b>c || b>a))
		{
		    System.out.println("Yes,it is greatest");
		    
		}
		/*else if (b>c&&b>a) 
		{
		   System.out.println("Yes,B is greatest");
		}*/
		else 
		{
		    System.out.println("No,it is Smallest");
		}
	}
}