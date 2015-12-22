package com.demo.ui;

import java.util.ArrayList;
import com.demo.entidades.Cliente;
import com.demo.repository.ClienteRepository; 

public class Main {
	
	public static void main(String[] args) {
		ClienteRepository clienteRepository=new ClienteRepository();
		Cliente cl1=new Cliente("0333333", "Esther", "Alava", 18);
		Cliente cl2=new Cliente("0444444", "Narcisa", "Alvarado", 18);
		
		clienteRepository.ingresar(cl1);
		clienteRepository.ingresar(cl2);
		
		ArrayList<Cliente> temp=clienteRepository.getClientes();
		
		for(int i=0;i<temp.size();i++){
			System.out.println(temp.get(i));
		}
		
		
	}

}



