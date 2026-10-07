package com.contactos.service;

import com.contactos.model.Contacto;
import com.contactos.repository.IContactoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService implements IContactoService{

    private final IContactoRepository contactoRepository;
    public ContactoService(IContactoRepository contactoRepository){
        this.contactoRepository = contactoRepository;
    }

    @Override
    public List<Contacto> listarContactos() {
        return contactoRepository.findAll();
    }

    @Override
    public Contacto buscarContactoPorId(Integer idContacto) {
        return contactoRepository.findById(idContacto).orElse(null);
    }

    @Override
    public void guardarContacto(Contacto producto) {
        contactoRepository.save(producto);
    }

    @Override
    public void eliminarContacto(Contacto contacto) {
        contactoRepository.delete(contacto);
    }
}
