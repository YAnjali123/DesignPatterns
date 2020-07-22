package design.pattern;
import phone.Os;
import phone.Android;
import phone.Ios;
import phone.Windows;
import phone.Operatingsysfact;

public class Factorydesign {
	public static void main(String args[])
	{
		Operatingsysfact  osf=new Operatingsysfact ();
	    Os obj=osf.getInstance("Open");
	    obj.specific();
	}


}
