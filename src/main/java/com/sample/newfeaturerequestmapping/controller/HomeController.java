package com.sample.newfeaturerequestmapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ittipol
 *
 */
@Controller
public class HomeController {

	
	@RequestMapping("/")
    public String homeHandle(Model model) {
        model.addAttribute("msg", "home!!");
        return "index";
    }
	
}
