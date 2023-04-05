package com.urjcsistemasdistribuido.practica.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/market")
public class MarketRestController {

    private Logger log = LoggerFactory.getLogger(MarketRestController.class);
}
