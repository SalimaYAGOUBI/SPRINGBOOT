package com.UIR.SiteEcomerce.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {
	
	//PagePrincipale
	@GetMapping("/smartech")
	    public String PagePrincipales() {
	        return "PagePrincipale";
	}
	
	//documentation
	@GetMapping("/documentaion")
    public String documentation() {
        return "documentation";
    }
	
	//recherche
	@GetMapping("/recherche")
    public String recherche() {
        return "recherche";
    }
}
