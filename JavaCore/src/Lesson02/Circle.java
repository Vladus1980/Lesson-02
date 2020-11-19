package Lesson02;

public class Circle {

	
	private double radius;
	private double diametr;
	
	
	Circle (double radius) {
		this.radius = radius;
		
		
	}
	
	Circle () {
		this.diametr = 12;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiametr() {
		return diametr;
	}

	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}
	@Override
	public String toString() {
		return "«Площа кола = " + Math.PI*radius*radius + "», «Довжина кола = " + Math.PI*diametr + "»";
	}
}

