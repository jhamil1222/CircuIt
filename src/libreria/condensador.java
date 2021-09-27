package libreria;

public class condensador {
	double w=0;
	String a="";
	private double capacitancia=0;
	public condensador(String a) {
		this.a=a;
	}
	public condensador(double capacitancia, double hertz, boolean print) {
		this.capacitancia=capacitancia;
		w=2*Math.PI*hertz;
		if(print) {
			System.out.println("newline w=2%pi"+hertz);
			System.out.println("newline w="+(2*Math.PI*hertz));
			}
	}
	public String obtainPol( boolean print) {
		if(print) {
			circuit.print("1over{("+w+")"+capacitancia+"}");
			circuit.print((1/(w*capacitancia))+"<-90");
		}
		a= (1/(w*capacitancia))+"<-90";
		return (1/(w*capacitancia))+"<-90";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return a;
	}
	

}
