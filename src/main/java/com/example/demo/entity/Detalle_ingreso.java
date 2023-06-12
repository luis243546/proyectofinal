package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name="detalle_ingreso")
@Entity(name="Detalle_ingreso")
public class Detalle_ingreso {
	
	@Id
	String detalle_ingreso;
	String ingreso;
	String articulo;
	int cantidad;
	double precio_compra;
	double precio_venta;
	
	
	public Detalle_ingreso() {}


	public Detalle_ingreso(String detalle_ingreso, String ingreso, String articulo, int cantidad, double precio_compra,
			double precio_venta) {
		super();
		this.detalle_ingreso = detalle_ingreso;
		this.ingreso = ingreso;
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
	}


	public String getDetalle_ingreso() {
		return detalle_ingreso;
	}


	public void setDetalle_ingreso(String detalle_ingreso) {
		this.detalle_ingreso = detalle_ingreso;
	}


	public String getIngreso() {
		return ingreso;
	}


	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}


	public String getArticulo() {
		return articulo;
	}


	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio_compra() {
		return precio_compra;
	}


	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}


	public double getPrecio_venta() {
		return precio_venta;
	}


	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	
}
