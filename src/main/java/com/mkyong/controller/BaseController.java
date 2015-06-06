package com.mkyong.controller;

import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    private static final String ARTICLE = "helloarticle";
    private static int counter = 0;
	private static final String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String welcome(ModelMap model) {
//
//		model.addAttribute("message", "Welcome");
//		model.addAttribute("counter", ++counter);
//		logger.debug("[welcome] counter : {}", counter);
//
//		// Spring uses InternalResourceViewResolver and return back index.jsp
//		return VIEW_INDEX;
//
//	}

//
//	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
//	public String welcomeName(@PathVariable String name, ModelMap model) {
//
//		model.addAttribute("message", "Welcome " + name);
//		model.addAttribute("counter", ++counter);
//		logger.debug("[welcomeName] counter : {}", counter);
//		return VIEW_INDEX;
//
//	}

    @RequestMapping(value = "/greeting/{}", method = RequestMethod.GET, consumes = "application/json", produces = "text/html")
    public String serveContect(@RequestParam("fun") String id) {
        if(id.equalsIgnoreCase("times")) {
            logger.info("id value is: " + id);
            return ARTICLE;
        }
		return null;
	}

}