package overriding;

class TV
{
	public void SwitchOn()
	{
		System.out.println("TV is Switched ON");
	}
	public void SwitchChannel()
	{
		System.out.println("Change the Channel");
	}
}

class SmartTV extends TV
{
	@Override
	public void SwitchOn()
	{
		System.out.println("SmartTV is switched ON");
	}
	@Override
	public void SwitchChannel()
	{
		System.out.println("Smart TV channel is changed");
	}
	
	public void brows()
	{
		System.out.println("SmartTV browsing");
	}
}

public class overriding_01 {

	public static void main(String[] args) {
		TV t= new SmartTV();
		SmartTV st= new SmartTV();
		t.SwitchOn();
		t.SwitchChannel();
		

	}

}
