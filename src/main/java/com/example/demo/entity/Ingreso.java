package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="ingreso")
@Entity(name="Ingreso")
public class Ingreso {

	@Id
	double ingreso;
	String proveedor;
	String tipo_comprobante;
	String serie_comprobante;
	String num_comprobante;
	Date fecha_hora;
	double impuesto;
	String estado;
	
	
	public Ingreso() {}


	public Ingreso(double ingreso, String proveedor, String tipo_comprobante, String serie_comprobante,
			String num_comprobante, Date fecha_hora, double impuesto, String estado) {
		super();
		this.ingreso = ingreso;
		this.proveedor = proveedor;
		this.tipo_comprobante = tipo_comprobante;
		this.serie_comprobante = serie_comprobante;
		this.num_comprobante = num_comprobante;
		this.fecha_hora = fecha_hora;
		this.impuesto = impuesto;
		this.estado = estado;
	}


	public double getIngreso() {
		return ingreso;
	}


	public void setIngreso(double ingreso) {
		this.ingreso = ingreso;
	}


	public String getProveedor() {
		return proveedor;
	}


	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}


	public String getTipo_comprobante() {
		return tipo_comprobante;
	}


	public void setTipo_comprobante(String tipo_comprobante) {
		this.tipo_comprobante = tipo_comprobante;
	}


	public String getSerie_comprobante() {
		return serie_comprobante;
	}


	public void setSerie_comprobante(String serie_comprobante) {
		this.serie_comprobante = serie_comprobante;
	}


	public String getNum_comprobante() {
		return num_comprobante;
	}


	public void setNum_comprobante(String num_comprobante) {
		this.num_comprobante = num_comprobante;
	}


	public Date getFecha_hora() {
		return fecha_hora;
	}


	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}


	public double getImpuesto() {
		return impuesto;
	}


	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
