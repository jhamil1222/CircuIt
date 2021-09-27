package libreria;

public class Inductor {
	double w=0;
	public double henryos=0;
	String a="";
	public Inductor(String a) {
		this.a=a;
	}
	public Inductor(double henryos, double hertz, boolean print) {
		this.henryos=henryos;
		w=2*Math.PI*hertz;
		if(print) {
		System.out.println("newline w=2%pi"+hertz);
		System.out.println("newline w="+(2*Math.PI*hertz));
		}
	}
	public String obtainPol( boolean print) {
		if(print) {
			circuit.print("("+w+")"+henryos);
			circuit.print((w*henryos)+"<90");
		}
		a= (w*henryos)+"<90";
		return (w*henryos)+"<90";
	}
	public Inductor serie(Inductor a) {
		circuit.print(henryos+"+"+a.henryos);
		a.henryos+=this.henryos;
		circuit.print(a.henryos+"");
		return a;
	}
	public Inductor paralelo(Inductor a) {
		circuit.print("{"+a.henryos+"+"+henryos+"}over{"+a.henryos+"*"+henryos+"}");
		circuit.print((a.henryos+henryos)+"over"+henryos*a.henryos);
		circuit.print(""+(a.henryos+henryos)/(henryos*a.henryos));
		a.henryos=(a.henryos+henryos)/(henryos*a.henryos);
		return a;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return a;
	}
}
