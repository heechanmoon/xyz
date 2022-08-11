package Lotto;

public class Lottoball {
	private int number;
	
	public int getnumber() {
		number = (int)((Math.random()*10000)%45);
		return number;
	}
}