package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Articulo;
import com.example.demo.repository.ArticuloRepository;

@Service
public class ArticuloServiceImpl implements ArticuloService{

	@Autowired
	ArticuloRepository b;
	
	@Override
	public Articulo registrar(Articulo articulo) {
		// TODO Auto-generated method stub
		return b.save(articulo);
	}

	@Override
	public Articulo actualizar(Articulo articulo) {
		// TODO Auto-generated method stub
		return b.save(articulo);
	}

	@Override
	public void eliminar(Articulo articulo) {
		// TODO Auto-generated method stub
		b.delete(articulo);
	}

	@Override
	public List<Articulo> ver() {
		// TODO Auto-generated method stub
		return b.findAll();
	}

}
