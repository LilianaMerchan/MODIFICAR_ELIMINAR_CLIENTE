package consola;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.demo.entidades.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente cl1=new Cliente ("0999999","Denisse","Bailon",31);
		Cliente cl2=new Cliente ("0977799","Andrea ","Vera  ",21);
		Cliente cl3=new Cliente ("5678699","Carlos ","Perez ",19);
		
		ArrayList<Cliente> clientes=new ArrayList<Cliente>();
		clientes.add(cl1);
		clientes.add(cl2);
		clientes.add(cl3);
		/*
		Cliente temp1=clientes.get(0);
		Cliente temp2=clientes.get(1);
		Cliente temp3=clientes.get(2);
		
		
		System.out.println(temp1);
		System.out.println(temp2);
		System.out.println(temp3);
		
		
		System.out.println("Tamaño de Cientes: "+clientes.size());
        for (int i=0;i<clientes.size();i++){
        	Cliente temp=clientes.get(i);
			System.out.println(temp);
		}
        */
		
		int op=0;
		do {
			System.out.println("<1> Ingresar Cliente ");
			System.out.println("<2> Modificar Cliente");
			System.out.println("<3> Eliminar Cliente");
			System.out.println("<4> Mostrar Clientes ");
			System.out.println("<5> Salir ");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Leer opción");
			op=sc.nextInt();
			
			Iterator<Cliente> nombreIterator;
			switch (op){
			case 1: 
				System.out.println("Ingrese identificación");
			    String identificacion=sc.next();
			    System.out.println("Ingrese Nombres");
			    String nombres=sc.next();
			    System.out.println("Ingrese Apellidos");
			    String apellidos=sc.next();
			    System.out.println("Ingrese edad");
			    int edad=sc.nextInt();
			    
			    Cliente cl=new Cliente(identificacion,nombres,apellidos,edad);
			    clientes.add(cl);
			    break;
			case 2: 
				
			case 3:
				// Obtenemos el numero de elementos del ArrayList
				int numElementos = clientes.size();
				System.out.println("El ArrayList tiene: "+numElementos+" elementos");

				// Eliminamos el primer elemento del ArrayList, es decir el que ocupa la posición '0'
				System.out.println("Eliminamos el primer elemento del ArrayList ("+clientes.get(0)+")...");
				clientes.remove(0);

				// Imprimimos el ArrayList despues de eliminar los elementos iguales a "Elemento 3"
				System.out.println("Lista de clientes actualizadas: ");
				nombreIterator = clientes.iterator();
				while(nombreIterator.hasNext()){
					Cliente elemento = nombreIterator.next();
					System.out.print(elemento+" / ");
				}

				// Mostramos el numero de elementos que tiene el ArrayList tras las eliminaciones:
				numElementos = clientes.size();
				System.out.println("nNumero de elementos del ArrayList tras las eliminaciones = "+numElementos);
				break;
				
			case 4:
				System.out.println("Lista de clientes");
				for(int i=0;i<clientes.size();i++){
					Cliente temp=clientes.get(i);
					System.out.println(temp);
					
				}
			}
		}while (op!=5);
	}
}

