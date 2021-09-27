package libreria;

public class Resistencia {
	double ohm=0;
	String a="";
	
public Resistencia(double ohm) {
	this.ohm=ohm;
	
}
public Resistencia(String a) {
	this.a=a;
}
@Override
public String toString() {
	if(a!="") 
		return ohm+"<0";
	else
		return a;
	
}
}
