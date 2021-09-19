
public class ComplexNum {
	private int real,imag;
	public ComplexNum() {
		this(0,0);
	}
	public ComplexNum(int real,int imag) {
		this.real=real;
		this.imag=imag;
	}
	public void setReal(int a) {
		real=a;
	}
	public void setImag(int b) {
		imag=b;
	}
	public int getReal() {
		return real;
	}
	public int getImag() {
		return imag;
	}
	public void sum(ComplexNum n1) {
		this.real+=n1.real;
		this.imag+=n1.imag;
	}
	public String toString() {
		return (this.real+"+"+this.imag+"i");
//		return "Priyanshu Giri";
	}
}
