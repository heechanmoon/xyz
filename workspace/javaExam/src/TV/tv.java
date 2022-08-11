package TV;

public class tv {
	static int channel;
	static int volume;
	static boolean power;
	
	public tv() {
		channel = 7;
		volume = 20;
		power = true;
	}
	
	public void channelUp(){
		channel++;
	}
	
	public void channelDown(){
		channel--;
	}
	
	public void volumeUp() {
		volume++;
	}
	
	public void volumeDown() {
		volume--;
	}
	
	public void powerOn() {
		power = true;
	}
	
	public void powerOff() {
		power = false;
	}
	
	public void setChannel(int channel) {
		tv.channel = channel;
	}
	
	public int getChannel() {
		if(isPower())
			return channel;
		else
			return -1;
	}
	
	public boolean isPower() {
		return power;
	}
	
	public int getVolume() {
		if(isPower())
			return volume;
		else
			return -1;
	}
}