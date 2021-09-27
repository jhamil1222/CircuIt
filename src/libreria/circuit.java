package libreria;
public class circuit
{
	
	

	public static String getCuaPol(String gato)
	{
		String i="";
		String j="";
		boolean ga=false;
		for(int a =0; a<gato.length(); a++){

			if(gato.substring(a,a+1).equals("<"))
			{
				ga=true;
			}
			if(ga){
				i+=gato.substring(a,a+1);
			}
			if(!ga){
				j+=gato.substring(a,a+1);
			}
		}
		i=i.replace("<","");
		
		double w=Double.valueOf(i);
		double q=Double.valueOf(j);
		
		//System.out.println(q);
		print(String.format("%f+j%f",q*Math.cos(Math.toRadians(w)),q*Math.sin(Math.toRadians(w))));
		return (q*Math.cos(Math.toRadians(w)))+"j"+(q*Math.sin(Math.toRadians(w)));
	}
	public static String getPolCua(String gato)
	{
		String o="";
		String p="";
		boolean tr=false;
		for(int a =0; a<gato.length(); a++){
			{

				if(tr){
					o+=gato.substring(a,a+1);
				}

				if(gato.substring(a,a+1).equals("+"))
				{
					tr=true;
				}
				if(!tr){
					p+=gato.substring(a,a+1);
				}
			}
		}
		o=o.replace("j","");
		o=o.replace("(","");
		o=o.replace(")","");
		double e=Double.valueOf(o);
		double f=Double.valueOf(p);
		System.out.printf("%n newline \"\"=sqrt{(%f)^2+(%f)^2}",e,f);
		System.out.printf("%n newline \"\"=sqrt{%f}",Math.pow(e,2)+Math.pow(f,2));
		double u=Math.sqrt(Math.pow(e,2)+Math.pow(f,2));
		System.out.printf("%n newline \"\"=%f",u);
		System.out.printf("%n newline \"\"=arctan({%f}over{%f})",e,f);
		double g=Math.toDegrees(Math.atan2(e,f));
		System.out.printf("%n newline \"\"=%f",g);
		System.out.printf("%n newline \"\"=%f<%f",u,g);
		return u+"<"+g;
	}
	public static void print(String a){
		a=a.replace(".", ",");
		System.out.println("\nnewline \"\"="+a);
		
	}
	// si devuelve 0 el elemento 2 del array es polar y si devuelve 1 es rectangular 
	private static double [] getDatos(String gato) {
		String i="";
		String j="";
		double w=0;
		double q=0;
	
		boolean ga=false;
		for(int a =0; a<gato.length(); a++){

			if(gato.substring(a,a+1).equals("<"))
			{
				ga=true;
			}
			if(ga){
				i+=gato.substring(a,a+1);
			}
			if(!ga){
				j+=gato.substring(a,a+1);
			}
		}
		i=i.replace("<","");
		if(!ga) {
		
			String o="";
			String p="";
			boolean tr=false;
			for(int a =0; a<gato.length(); a++){
				{

					if(tr){
						o+=gato.substring(a,a+1);
					}

					if(gato.substring(a,a+1).equals("+"))
					{
						tr=true;
					}
					if(!tr){
						p+=gato.substring(a,a+1);
					}
				}
			}
			o=o.replace("j","");
			o=o.replace("(","");
			o=o.replace(")","");
			w=Double.valueOf(o);
			q=Double.valueOf(p);
		}
		else {
			
		w=Double.valueOf(i);
		q=Double.valueOf(j);
		}
		
		return new double []{q,w};
	}
	
	public static String DivPol(String pol1, String pol2, boolean print) {
		double [] datpol1=getDatos(pol1);
		double [] datpol2=getDatos(pol2);
		
		if(print) {
		print("{"+pol1+"}over{"+pol2+"}");
		print((datpol1[0]/datpol2[0])+"<"+(datpol1[1]-datpol2[1]));
		}
		return ((datpol1[0]/datpol2[0])+"<"+(datpol1[1]-datpol2[1]));
		
		
	}
	public static String SumRec(String rec1, String rec2, boolean print) {
		double [] datpol1=getDatos(rec1);
		double [] datpol2=getDatos(rec2);
		if(print) {
			print("("+rec1+")"+"+"+"("+rec2+")");
			print((datpol1[0]+datpol2[0])+"<"+(datpol1[1]+datpol2[1]));
		}
		return ((datpol1[0]+datpol2[0])+"<"+(datpol1[1]+datpol2[1]));
	}
	public static String SumPol(String pol1, String pol2) 
	{
		pol1=getPolCua(pol1);
		pol2=getPolCua(pol2);
		pol1=SumRec(pol1, pol2, true);
		return getCuaPol(pol1);
	}
}