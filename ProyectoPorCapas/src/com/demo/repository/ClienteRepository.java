package com.demo.repository;

import java.util.ArrayList;
import com.demo.entidades.Cliente;

public class ClienteRepository {

	
private ArrayList<Cliente> clientes=new ArrayList<Cliente>();
	
	public ClienteRepository(){
		clientes.add(new Cliente("0999999", "Desconocido", "Desconocido", 10));
		clientes.add(new Cliente("0888888", "María", "Vera", 30));
		clientes.add(new Cliente("0777777", "Jose", "Muños", 40));
		clientes.add(new Cliente("0666666", "Patricio", "Garcia", 20));
	}
	
	public void ingresar(Cliente cliente){
		clientes.add(cliente);
	}
	
	public ArrayList<Cliente> getClientes(){
		return clientes;
	}
	
	public Cliente getCliente(String identificacion){
		for(int i=0;i<clientes.size();i++){
			if(clientes.get(i).getIdentificacion().equals(identificacion))
				return clientes.get(i);
		}
		return null;
	}
	

}




