package _003_baul;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class Cuenta {
	
	Integer id;
	
	private BigDecimal saldoTotal;
	private Map<String,BigDecimal> divisas;
	
	private Double TotalPrestamoAdevolver;
	private boolean prestamoSolicitado;
	
	private Double depositoAPlazos;
	private boolean depositoRealizado;
	
	public Cuenta(Integer id) {
		this.id=id;
		this.saldoTotal=new BigDecimal("0.0");
		this.divisas=new TreeMap<>();
		
		this.TotalPrestamoAdevolver=0.0;
		this.prestamoSolicitado=false;
		
		this.depositoAPlazos=0.0;
		this.depositoRealizado=false;
		
	}
	public Cuenta(Integer id, BigDecimal saldoTotal, Double totalPrestamoAdevolver,
			boolean prestamoSolicitado, Double depositoAPlazos, boolean depositoRealizado) {
		super();
		this.id = id;
		this.saldoTotal = saldoTotal;
		this.divisas=new TreeMap<>();
		TotalPrestamoAdevolver = totalPrestamoAdevolver;
		this.prestamoSolicitado = prestamoSolicitado;
		this.depositoAPlazos = depositoAPlazos;
		this.depositoRealizado = depositoRealizado;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void ingresar(Double cantidad) {
		this.setSaldoTotal(cantidad+this.getSaldoTotal());
	}
	
	public void retirar(Double cantidad) {
		this.setSaldoTotal(this.getSaldoTotal()-cantidad);
	}
	
	public Double getSaldoTotal() {
		return this.saldoTotal.setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	public void setSaldoTotal(Double saldoTotal) {
		this.saldoTotal = new BigDecimal(""+saldoTotal);
	}
	public Map<String, BigDecimal> getDivisas() {
		return divisas;
	}
	public void setDivisas(Map<String, BigDecimal> divisas) {
		this.divisas = divisas;
	}
	public Double getTotalPrestamoAdevolver() {
		return TotalPrestamoAdevolver;
	}
	public void setTotalPrestamoAdevolver(Double totalPrestamoAdevolver) {
		TotalPrestamoAdevolver = totalPrestamoAdevolver;
	}
	public boolean isPrestamoSolicitado() {
		return prestamoSolicitado;
	}
	public void setPrestamoSolicitado(boolean prestamoSolicitado) {
		this.prestamoSolicitado = prestamoSolicitado;
	}
	public Double getDepositoAPlazos() {
		return depositoAPlazos;
	}
	public void setDepositoAPlazos(Double depositoAPlazos) {
		this.depositoAPlazos = depositoAPlazos;
	}
	public boolean isDepositoRealizado() {
		return depositoRealizado;
	}
	public void setDepositoRealizado(boolean depositoRealizado) {
		this.depositoRealizado = depositoRealizado;
	}
	
}
