package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Ingreso;

public interface IngresoService {

	public Ingreso registrar(Ingreso ingreso);
	public Ingreso actualizar(Ingreso ingreso);
	public void eliminar(Ingreso ingreso);
	
	public List<Ingreso>ver();
}
