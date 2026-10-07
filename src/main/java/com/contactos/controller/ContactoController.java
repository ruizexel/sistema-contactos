package com.contactos.controller;

import com.contactos.model.Contacto;
import com.contactos.service.ContactoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ContactoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContactoController.class);

    private ContactoService contactoService;
    public ContactoController(ContactoService contactoService){
        this.contactoService = contactoService;
    }

    @GetMapping("/")
    public String iniciar(ModelMap modelo){
        List<Contacto> contactos = contactoService.listarContactos();
        contactos.forEach((contacto -> LOGGER.info(contacto.toString())));
        modelo.put("contactos", contactos);
        return "index"; // redirecciona por defecto la extension que maneja thymeleaf es .html
    }
}
