package TV;

public class WatchTV {

	public static void main(String[] args) {
		tv tv = new tv();
		if(tv.isPower())
			System.out.println("TV�� �����ֽ��ϴ�.");
		else
			System.out.println("TV�� �����ֽ��ϴ�.");
		System.out.println(tv.getChannel());
		System.out.println(tv.getVolume());
		
		tv.powerOff();
		if(tv.isPower())
			System.out.println("TV�� �����ֽ��ϴ�.");
		else
			System.out.println("TV�� �����ֽ��ϴ�.");
		System.out.println(tv.getChannel());
		System.out.println(tv.getVolume());
	}

}
