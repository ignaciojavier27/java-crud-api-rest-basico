package com.ignacio.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ignacio.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long> {

}
