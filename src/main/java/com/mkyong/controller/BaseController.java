package com.mkyong.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    private static final String ARTICLE = "helloarticle";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);

    @RequestMapping(value = "/greeting/{}", method = RequestMethod.GET, consumes = "application/json", produces = "text/html")
    public String serveContect(@RequestParam("fun") String id) {
        if(id.equalsIgnoreCase("times")) {
            logger.info("id value is: " + id);
            return ARTICLE;
        }
		return null;
	}

}