package com.abc.planyourtrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abc.planyourtrip.service.PackageService;


@Controller
@SessionAttributes("packageLocation")
public class PreferenceController {

	@Autowired
	PackageService service;
	
//	@Autowired
//	PackageRepository repo;
	
	@RequestMapping(value="/preferences", method = RequestMethod.GET)
	public String showHomePage(ModelMap model) {
		return "preferences";
	}
	
	@RequestMapping(value="/preferences", method = RequestMethod.POST)
	public String HomePage(ModelMap model, @RequestParam String packageLocation ) {
		
		if(!service.validateLocation(packageLocation)) {
			return "preferences";
		}
		model.put("packageLocation", packageLocation);
//		model.put("packagesList", repo.findByLocation(packageLocation));
		model.put("packagesList", service.retrievePackages(packageLocation));
		return "packages";
	}
	
//	@RequestMapping("/index")
//	public String showIndex() {
//		return "index";
//	}
//	
}
