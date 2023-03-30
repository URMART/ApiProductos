package com.producto.app.service;

import com.producto.app.models.Dao.ProductoRepositorio;
import com.producto.app.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImp implements ProductoService{


    @Autowired
    ProductoRepositorio productoRepositorio;

    @Override
    @Transactional(readOnly = true)
    public Producto findByNombre(String nombre) {
        return productoRepositorio.findByNombre(nombre);
    }


    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll(){
        return (List<Producto>) productoRepositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Producto> findById(Long id) {
        return Optional.of(productoRepositorio.findById(id).orElseThrow());
    }

    @Override
    @Transactional
    public Producto save(Producto producto)  {

        return  productoRepositorio.save(producto);
    }

    @Override
    @Transactional
    public void deleteByid(Long id) {

            productoRepositorio.deleteById(id);

    }


}
