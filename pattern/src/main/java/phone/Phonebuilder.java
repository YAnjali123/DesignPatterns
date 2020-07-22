package phone;
public class Phonebuilder {
	private String os;
	private int ram;
	private String processor;
	private double screensize;
	private int battery;
	public Phonebuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public Phonebuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public Phonebuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public Phonebuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	public Phonebuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public Phone getPhone()
	{
	return new Phone(os, ram, processor, screensize, battery);
	}
}
