package com.UIR.SiteEcomerce.Membre;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class MembreController {
	@Autowired
	private MembreService membreservice;
	
	
	@PostMapping("/ConnexionMembre")
	public String connexion(@RequestBody Membre membre) {
        System.out.print(membre.getLogin());
		return "home";
	}
	
	@PostMapping("/Incription")
	public String getUserForm(@RequestBody Membre membre)
	{
		//membreservice.addMembre(membre);
		return "home";
	}
	
}