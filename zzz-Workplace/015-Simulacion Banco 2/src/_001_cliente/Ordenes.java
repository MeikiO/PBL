package _001_cliente;

import java.io.Serializable;
import java.math.BigDecimal;

import compute.Task;



public class Ordenes implements Task<String>,Serializable {

    private static final long serialVersionUID = 227L;

   private String ordenMandada;
   
	public Ordenes(String ordenMandada) {
		super();
		this.ordenMandada = ordenMandada;
	}

	public Ordenes() {
		
	}

	@Override
	public String recibirOrden() {
		return this.ordenMandada;
	}
    
}
