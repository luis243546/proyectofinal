package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Detalle_ingreso;


@Repository
public interface Detalle_ingresoRepository extends JpaRepository<Detalle_ingreso, String>{

}
