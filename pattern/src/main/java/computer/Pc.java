package computer;
public class Pc extends Computer {
	private String ram;
    private String hdd;
    private String cpu;
    public Pc(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    public String getRAM() {
        return this.ram;
    }
 
    public String getHDD() {
        return this.hdd;
    }
 
    public String getCPU() {
        return this.cpu;
    }



}
