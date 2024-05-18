package Interface;

interface Interface1
{
	void login();
	void logout();
}

interface Interface2 extends Interface1
{
	void search();
	void payments();
}

public class ClassWithInterface implements Interface2
{
	
	void order_page()
	{
		
	}
	
	static void address_page()
	{
		
	}
	
	public static void main(String[] args) 
	{
		ClassWithInterface x = new ClassWithInterface();
		address_page();
		x.order_page();
		x.login();
		x.logout();
		x.search();
		x.payments();
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payments() {
		// TODO Auto-generated method stub
		
	}
}
