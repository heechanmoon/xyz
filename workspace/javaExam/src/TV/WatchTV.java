package TV;

public class WatchTV {

	public static void main(String[] args) {
		tv tv = new tv();
		if(tv.isPower())
			System.out.println("TV가 켜져있습니다.");
		else
			System.out.println("TV가 꺼져있습니다.");
		System.out.println(tv.getChannel());
		System.out.println(tv.getVolume());
		
		tv.powerOff();
		if(tv.isPower())
			System.out.println("TV가 켜져있습니다.");
		else
			System.out.println("TV가 꺼져있습니다.");
		System.out.println(tv.getChannel());
		System.out.println(tv.getVolume());
	}

}
