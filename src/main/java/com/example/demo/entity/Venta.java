package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="venta")
@Entity(name="Venta")
public class Venta {

	@Id
	String idventa;
	String idcliente;
	String tipo_comprobante;
	String serie_comprobante;
	String num_comprobante;
	Date fecha_hora;
	double impuesto;
	double total_venta;
	String estado;
	
	
	public Venta() {}


	public Venta(String idventa, String idcliente, String tipo_comprobante, String serie_comprobante,
			String num_comprobante, Date fecha_hora, double impuesto, double total_venta, String estado) {
		super();
		this.idventa = idventa;
		this.idcliente = idcliente;
		this.tipo_comprobante = tipo_comprobante;
		this.serie_comprobante = serie_comprobante;
		this.num_comprobante = num_comprobante;
		this.fecha_hora = fecha_hora;
		this.impuesto = impuesto;
		this.total_venta = total_venta;
		this.estado = estado;
	}


	public String getIdventa() {
		return idventa;
	}


	public void setIdventa(String idventa) {
		this.idventa = idventa;
	}


	public String getIdcliente() {
		return idcliente;
	}


	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
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


	public double getTotal_venta() {
		return total_venta;
	}


	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
