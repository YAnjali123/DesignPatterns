package design.pattern;
public class SingletonDemo {
	public static void main(String args[])
	{
		Thread t1=new Thread(new Runnable() {
			public void run()
			{
				Single obj=Single.getinstance();
			}
	});
		Thread t2=new Thread(new Runnable() {
			public void run()
			{
				Single obj=Single.getinstance();
			}
	});
		t1.start();
		t2.start();

	}

}
class Single
{
	public static Single obj;
	private Single()
	{
		System.out.println("Instance created");
	}
	public static   synchronized Single getinstance()
	{
		if(obj==null)
		{
			obj=new Single();
		}
		return obj;
	}
}
