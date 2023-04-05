package com.urjcsistemasdistribuido.practica.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class TeamsRestController {

    private Logger log = LoggerFactory.getLogger(TeamsRestController.class);
}
