package Interface; // Assignment 53 = Program to demonstrate INTERFACE  try with 2 parents with 1 child class to achieve MULTIPLE LEVEL INHERITANCE concept

interface Youtube
{
	void watch_later();
	void play();
}

interface Gmail
{
	void send_schedule();
	void inbox();
}
public class Goggle_multiple_Level implements Youtube,Gmail
{

	public static void main(String[] args)
	{
		Goggle_multiple_Level x = new Goggle_multiple_Level();
		x.watch_later();
		x.play();
		x.send_schedule();
		x.inbox();
	}

	@Override
	public void send_schedule() {
		// TODO Auto-generated method stub		
	}
	@Override
	public void inbox() {
		// TODO Auto-generated method stub		
	}
	@Override
	public void watch_later() {
		// TODO Auto-generated method stub		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub	
	}

}
