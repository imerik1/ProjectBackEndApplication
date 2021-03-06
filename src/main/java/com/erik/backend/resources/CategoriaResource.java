package com.erik.backend.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
    @RequestMapping(method = RequestMethod.GET)
    static String listar() {
        return "listando";
    }
}
