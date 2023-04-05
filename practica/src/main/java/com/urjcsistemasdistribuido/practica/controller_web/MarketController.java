package com.urjcsistemasdistribuido.practica.controller_web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/market")
public class MarketController {

    private Logger log = LoggerFactory.getLogger(MarketController.class);
}
