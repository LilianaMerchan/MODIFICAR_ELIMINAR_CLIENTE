package com.demo.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.demo.entidades.Cliente;
import com.demo.repository.ClienteRepository;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class frmClienteextendsJframe {

private ClienteRepository clienteRepository=new ClienteRepository();
	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtIdentificacion;
	private JTextField txtEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCliente frame = new frmCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void frmCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(119, 37, 146, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(119, 68, 146, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtIdentificacion = new JTextField();
		txtIdentificacion.setBounds(119, 11, 146, 20);
		contentPane.add(txtIdentificacion);
		txtIdentificacion.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(119, 99, 143, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int edad=Integer.parseInt(txtEdad.getText());
				Cliente cl=new Cliente(txtIdentificacion.getText(),
						txtNombre.getText(),txtApellido.getText(), edad);
				
				clienteRepository.ingresar(cl);
				
			}
		});
		btnGuardar.setBounds(119, 134, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblIdentificacin = new JLabel("Identificaci\u00F3n");
		lblIdentificacin.setBounds(10, 11, 94, 20);
		contentPane.add(lblIdentificacin);
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setBounds(10, 40, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(10, 71, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 102, 89, 14);
		contentPane.add(lblEdad);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ArrayList<Cliente> temp=clienteRepository.getClientes();
				
				for(int i=0;i<temp.size();i++){
					System.out.println(temp.get(i));
				}
			}
		});
		btnMostrar.setBounds(119, 168, 89, 23);
		contentPane.add(btnMostrar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente temp=clienteRepository.getCliente(txtIdentificacion.getText());
				txtApellido.setText(temp.getApellidos());
				txtEdad.setText(temp.getEdad()+"");
				txtNombre.setText(temp.getNombres());
			}
		});
		btnBuscar.setBounds(275, 10, 89, 23);
		contentPane.add(btnBuscar);
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}

	private void setBounds(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
}
