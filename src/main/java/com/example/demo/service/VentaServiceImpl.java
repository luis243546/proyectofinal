package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Venta;
import com.example.demo.repository.VentaRepository;


@Service
public class VentaServiceImpl implements VentaService{

	
	@Autowired
	VentaRepository k;
	
	
	@Override
	public Venta registrar(Venta venta) {
		// TODO Auto-generated method stub
		return k.save(venta);
	}

	@Override
	public Venta actualizar(Venta venta) {
		// TODO Auto-generated method stub
		return k.save(venta);
	}

	@Override
	public void eliminar(Venta venta) {
		// TODO Auto-generated method stub
		k.delete(venta);
	}

	@Override
	public List<Venta> ver() {
		// TODO Auto-generated method stub
		return k.findAll();
	}

}
