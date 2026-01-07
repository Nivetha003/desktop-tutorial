class Hall{
    void hello(){
        System.out.println("welcome");
    }
}
public class Main
{
	public static void main(String[] args) {
	    //classname  objectname  =  new  classname() 
		Hall h = new Hall();
		h.hello();
	}
}