package by.htp.project4.entity;

public class Complex {
	private int real;
	private int imaginary;

	public Complex() {
		real = 1;
		imaginary = 1;
	}
	
	public Complex(int _real, int _imaginary) {
		real = _real;
		imaginary = _imaginary;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + imaginary;
		result = prime * result + real;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complex other = (Complex) obj;
		if (imaginary != other.imaginary)
			return false;
		if (real != other.real)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
	}
	
}
