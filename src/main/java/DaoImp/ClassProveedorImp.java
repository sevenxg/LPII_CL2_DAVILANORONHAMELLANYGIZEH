package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorcl2;

public class ClassProveedorImp implements IProveedor {

	public void RegistrarProveedor(TblProveedorcl2 tblproveedor) {
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_DAVILANORONHAMELLANYGIZEH");
		// gestionar entidades
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(tblproveedor);
		//emitimos mensaje
		System.out.println("Producto registrado en BD correctamente!!!!!!!!");
		//confirmamos
		em.getTransaction().commit();
		//cerramos la transaccion...
		em.close();
		
	}  //fin del metodo....


	public void ActualizarProveedor(TblProveedorcl2 tblproveedor) {
		// TODO Auto-generated method stub
		
	}

	public void EliminarProveedor(TblProveedorcl2 tblproveedor) {
		// TODO Auto-generated method stub
		
	}

	public List<TblProveedorcl2> ListadoProveedor() {
		// TODO Auto-generated method stub
		return null;
	}

	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblproveedor) {
		// TODO Auto-generated method stub
		return null;
	}

}
