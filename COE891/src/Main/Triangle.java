package Main;

public class Triangle {
	public int side1, side2, side3;
	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3; 
		}
	public double calculateArea() {
	    
		if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2) {
		    throw new IllegalArgumentException("Invalid triangle sides.");
		}
	    // Calculate area using Heron's formula
	    double s = (side1 + side2 + side3) / 2.0;
	    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}
