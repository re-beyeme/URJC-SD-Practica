package com.urjcsistemasdistribuido.practica.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/player")
public class JugadorRestRestController {

    private Logger log = LoggerFactory.getLogger(JugadorRestRestController.class);
}
