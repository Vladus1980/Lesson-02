package Lesson02;

public class Restange {

	private int hight;
	private int width;
	
	
	Restange (int hight, int width) {
		this.hight = 20;
		this.width = 30;
	}
	
	Restange () {
		this.hight = hight;
		this.width = width;
	}
	
	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "«Площа прямокутника = " + hight * width + "», «Периметр прямокутника = " + 2 * (hight + width) + "»";
	}


}
