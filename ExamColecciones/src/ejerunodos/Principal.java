package ejerunodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Alumno> arr = new ArrayList<Alumno>();
		
		arr.add(new Alumno (1, "Daniel", 400.00 , 2005));
		arr.add(new Alumno (2, "Sebas", 400.00, 2004));
		arr.add(new Alumno (3, "Ernesto", 400.00, 2006));
		arr.add(new Alumno (4, "Alvaro", 400.00, 2006));
		arr.add(new Alumno (5, "Mario", 400.00, 2006));
		arr.add(new Alumno (6, "Jorge", 400.00, 2006));
	

		System.out.println("El primer alumno es " + arr.get(0));
		System.out.println("El ultimo alumno es " + arr.get(arr.size() - 1));
		
		
		for (int i = 0; i < arr.size(); i++) {
			Alumno alumno = arr.get(i);
		if (alumno.getObj() < 0 || alumno.getEdad() < 2000) {
			arr.remove(i);
		}	
	}
		//Collections.sort(arr)
		System.out.println();
		System.out.println("LISTA DE ALUMNOS");
		for (Alumno valor : arr) { 
			System.out.println(valor +  " ");
		
		}
		
		HashMap <Integer,Alumno> map =  new HashMap<Integer, Alumno>();
		
		String clavebuscar;
		
		map.put (1, (new Alumno (1, "Daniel", 400.00 , 2005)));
		map.put (2, (new Alumno (2, "Sebas", 400.00 , 2004)));
		map.put (3, (new Alumno (3, "Ernesto", 400.00 , 2006)));
		map.put (4, (new Alumno (4, "Alvaro", 400.00 , 2006)));
		map.put (5, (new Alumno (5, "Mario", 400.00 , 2006)));
		map.put (6, (new Alumno (6, "Jorge", 400.00 , 2006)));
		
		  System.out.println("Introduce la clave del alumno :");
		  clavebuscar = sc.next();
		  for (Integer clave : map.keySet()) {
              if (map.containsKey(clavebuscar.toLowerCase())) {
                  System.out.println(map.get(clavebuscar));
		
		}	 
		 
	}
	
	}}



