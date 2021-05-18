package pe.edu.upeu.soap.ws.cliente;

import pe.edu.upeu.soap.ws.daoImpl.ClienteDaoImplService;

public class ClienteService {
	public static void main(String[] args) {
		ClienteDaoImplService pds = new ClienteDaoImplService();
		pe.edu.upeu.soap.ws.daoImpl.ClienteDao pd = pds.getClienteDaoImplPort();
		
		System.out.println("Fecha " + pd.readVenta("2021-05-01", "2021-12-12", 1).getFecha());
		System.out.println("Nombre Completo: " + pd.readVenta("2021-05-01", "2021-12-12", 1).getNombres() + " " + pd.readVenta("2021-05-07", "2021-12-12", 1).getApellidos());
		System.out.println("Nombre del producto: " + pd.readVenta("2021-05-07", "2021-12-12", 1).getNomProducto()); 
		System.out.println("Precio: " + pd.readVenta("2021-05-07", "2021-12-12", 1).getPrecio());
		System.out.println("Cantidad: " + pd.readVenta("2021-05-07", "2021-12-12", 1).getCantidad());
		

	}
	
	
	
	
}
