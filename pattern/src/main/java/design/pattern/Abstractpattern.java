package design.pattern;
import abstractfactory.*;
import computer.Computer;
public class Abstractpattern 
{
	public static void main(String args[])
	{
		testAbstractFactory();
		
	}
	private static void testAbstractFactory() {
		Computer pc = abstractfactory.ComputerFactory.getComputer(new PcFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = abstractfactory.ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}
}
