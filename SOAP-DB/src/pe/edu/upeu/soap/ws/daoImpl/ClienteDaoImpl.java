package pe.edu.upeu.soap.ws.daoImpl;

import java.sql.ResultSet;

import javax.jws.WebService;


import java.sql.Connection;
import java.sql.PreparedStatement;

import pe.edu.upeu.soap.ws.dao.ClienteDao;
import pe.edu.upeu.soap.ws.entity.Cliente;
import pe.edu.upeu.soap.ws.util.Conexion;

@WebService(endpointInterface = "pe.edu.upeu.soap.ws.dao.ClienteDao")
public class ClienteDaoImpl implements ClienteDao{
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx;
	@Override
	public Cliente readVenta(String fecha_ini, String fecha_fin, int id) {
		Cliente client = new Cliente();
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement("SELECT * from cliente c JOIN venta v ON (c.Idcliente = v.Idcliente) JOIN detalle d ON (v.Idventa = d.Idventa) JOIN producto p ON (p.Idproducto = d.Idproducto) WHERE v.fecha BETWEEN ? AND ? AND c.Idcliente = ? ");
		
			ps.setString(1, fecha_ini);
			ps.setString(2, fecha_fin);
			ps.setInt(3, id);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				client.setNombres(rs.getString("nombres"));
				client.setApellidos(rs.getString("apellidos"));
				client.setFecha(rs.getString("fecha"));
				client.setNomProducto(rs.getString("nomprod"));
				client.setPrecio(rs.getDouble("precio"));
				client.setCantidad(rs.getInt("cantidad"));
				
				
				
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return client;
	}

}
