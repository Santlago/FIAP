package dddencapsulamento2;

public class Triangulo {

	private double x;
	private double y;
	private double z;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public String valida() {
		if (x < (y + z) && y < (x + z) && z < (x + y)) {
			if (x == y && x == z) {
				return "Triângulo equilátero";
			} if (x == y || x == z || y == z) {
				return "Triângulo isóceles";
			} else {
				return "Triângulo escaleno";
			}
		} else {
			return "Os valores não formam um triângulo";
		}
	}
}
