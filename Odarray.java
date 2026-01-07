//sum of all elements in an array using methods
import java.util.*;
public class Odarray
{
    public int arr_add(int a[]){
        int sum = 0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }   

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n= sc.nextInt();
	    Odarray obj = new Odarray();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	        
	    }
	        int res = obj.arr_add(a);
		System.out.println(res);
	}
}