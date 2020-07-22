package design.pattern;
import phone.Phone;
import phone.Phonebuilder;
//builder pattern

public class Builderpattern {
	public static void main(String args[]) {
	Phone p=new Phonebuilder().setOs("Android").setRam(4).getPhone();
	System.out.println(p);
	}
}
