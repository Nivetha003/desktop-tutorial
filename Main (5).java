class Landline{
    void call(){
        System.out.println("Ring ring ring");
    }
}
class Button_phone extends Landline{
    void message(){
        System.out.println("Hi,How are you?");
    }
}
class Smart_phone extends Button_phone{
    void game(){
        System.out.println("Free fire");
    }
}

public class Main
{
	public static void main(String[] args) {
	    //classname  objectname  =  new  classname() 
		Smart_phone sp = new Smart_phone();
		sp.call();
		sp.message();
		sp.game();
	
	}
}