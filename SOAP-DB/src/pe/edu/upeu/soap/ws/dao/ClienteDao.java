package pe.edu.upeu.soap.ws.dao;

import javax.jws.WebService;

import pe.edu.upeu.soap.ws.entity.Cliente;

@WebService
public interface ClienteDao {
	public Cliente readVenta(String fecha_ini, String fecha_fin, int id);

}
