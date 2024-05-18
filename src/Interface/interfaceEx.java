package Interface;

interface keyboard
{
	void login ();
}

public class interfaceEx implements keyboard 
{

	public static void main(String[] args) 
	{
		interfaceEx x = new interfaceEx();
		x.login();
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

}
 