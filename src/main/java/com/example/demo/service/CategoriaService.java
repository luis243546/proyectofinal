package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Categoria;

public interface CategoriaService {

	public Categoria registrar(Categoria categoria);
	public Categoria actualizar(Categoria categoria);
	public void eliminar(Categoria categoria);
	
	public List<Categoria>ver();
}
