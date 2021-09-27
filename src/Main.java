import libreria.Inductor;
import libreria.circuit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inductor a=new Inductor(25.47E-3, 50, true);
		//a.obtainPol( true);
		//circuit.DivPol("1<0", "19.6<-90", true);
		circuit.SumPol("192+j90", "192+j80");
		Inductor a=new Inductor(12,50,true);
		Inductor b=new Inductor (12,50,true) ;
		a=a.serie(b);
		System.out.println(b.henryos);
	}

}
