package com.abc.planyourtrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abc.planyourtrip.service.PackageService;

@Controller
@SessionAttributes("packageList")
public class PackageController {
	@Autowired
	PackageService service;
	
//	@Autowired
//	PackageRepository repo;
	
	
	
	
	@RequestMapping(value = "/packages", method = RequestMethod.GET)
	public String showPackagePage(ModelMap model) {
//		String location = (String) model.get("location");
		model.put("packagesList", service.retrievePackages("Hyderabad"));
		
		return "packages";
	}
	@RequestMapping(value = "/packages", method = RequestMethod.POST)
	public String PackagePage(ModelMap model) {
		String packageLocation = (String) model.get("packageLocation");
//		model.put("packagesList", repo.findByLocation(packageLocation));
		
		model.put("packagesList", service.retrievePackages(packageLocation));
		return "redirect:/packages";
	}
	
	@RequestMapping(value = "/success")
	public String successPage() {
		return "success";
	}
}
