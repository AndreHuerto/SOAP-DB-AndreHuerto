package pe.edu.upeu.soap.ws.publico;

import javax.xml.ws.Endpoint;

import pe.edu.upeu.soap.ws.daoImpl.ClienteDaoImpl;

public class ClientePublico {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:6060/soap/cliente/venta", new ClienteDaoImpl());;
		System.out.println("Ejecutando......!");
	}
}
