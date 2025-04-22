package ejerunodos;

import java.util.Collections;

public class Alumno {
	
	private Integer obj;
	private String nombre;
	private double precio;
	private int edad;
	
	public Alumno(Integer obj, String nombre, double precio, int edad) {
		this.obj = obj;
		this.nombre = nombre;
		this.precio = precio;
		this.edad = edad;
	}
	public Integer getObj() {
		return obj;
	}
	public void setObj(Integer obj) {
		this.obj = obj;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Alumno [obj=" + obj + ", nombre=" + nombre + ", precio=" + precio + ", edad=" + edad + "]";
	}
}