package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Categoria;
import com.example.demo.repository.CategoriaRepository;


@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	CategoriaRepository c;
	
	@Override
	public Categoria registrar(Categoria categoria) {
		// TODO Auto-generated method stub
		return c.save(categoria);
	}

	@Override
	public Categoria actualizar(Categoria categoria) {
		// TODO Auto-generated method stub
		return c.save(categoria);
	}

	@Override
	public void eliminar(Categoria categoria) {
		// TODO Auto-generated method stub
		c.delete(categoria);
	}

	@Override
	public List<Categoria> ver() {
		// TODO Auto-generated method stub
		return c.findAll();
	}

}
