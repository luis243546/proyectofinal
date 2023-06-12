package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Ingreso;
import com.example.demo.repository.IngresoRepository;


@Service
public class IngresoServiceImpl implements IngresoService{

	@Autowired
	IngresoRepository g;
	
	
	@Override
	public Ingreso registrar(Ingreso ingreso) {
		// TODO Auto-generated method stub
		return g.save(ingreso);
	}

	@Override
	public Ingreso actualizar(Ingreso ingreso) {
		// TODO Auto-generated method stub
		return g.save(ingreso);
	}

	@Override
	public void eliminar(Ingreso ingreso) {
		// TODO Auto-generated method stub
		g.delete(ingreso);
	}

	@Override
	public List<Ingreso> ver() {
		// TODO Auto-generated method stub
		return g.findAll();
	}
	
}
