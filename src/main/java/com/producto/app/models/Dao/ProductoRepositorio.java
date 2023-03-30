package com.producto.app.models.Dao;

import com.producto.app.models.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepositorio  extends CrudRepository<Producto,Long> {

    public Producto findByNombre(String nombre);
}
