package General;

public class Persona implements Comparable<Persona>{
	
	private int dni;
	private String nombre;
	private float peso;
	
	//constructor
	public Persona(String n, float p, int d){
		dni=d; nombre=n; peso=p;
	}
	public Persona(String n){
		dni=111; nombre=n; peso=60;
	}
	//metodos
	public String getNombre(){return nombre;}
	public float getPeso(){return peso;}
	public int getDni(){return dni;}
	public int compareTo(Persona p){
		return nombre.compareTo(p.getNombre());}
	public void setNombre(String n){nombre=n;}
	public void setPeso(float p){peso=p;}
	public void setDni(int d){dni=d;}
}

