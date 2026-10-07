package com.contactos.service;

import com.contactos.model.Contacto;

import java.util.List;

public interface IContactoService {
    List<Contacto> listarContactos();

    Contacto buscarContactoPorId(Integer idContacto);

    void guardarContacto(Contacto producto);

    void eliminarContacto(Contacto contacto);
}
