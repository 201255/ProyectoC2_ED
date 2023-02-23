package proyectoC2;

import java.util.Objects;

public class Alumno {
	String nombre, apellido,materia;
    int matricula;
	
	public Alumno(String n, String a, String c,int m) {
		nombre = n;
		apellido = a;
		matricula = m;
        materia = c;
	}
	
	public String MostrarInformacion(int pos) {
		String Concatenar = "[" + matricula + " - " + nombre + " - " + apellido + "]";
		return Concatenar;
	}
		
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public boolean equals(Object O) {
		return this.hashCode() == O.hashCode();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.matricula,this.nombre,this.apellido);
	}
}
