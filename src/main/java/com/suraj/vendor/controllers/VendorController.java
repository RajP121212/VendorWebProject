package com.suraj.vendor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.suraj.vendor.entities.Vendor;
import com.suraj.vendor.service.VendorServiceImpl;

@Controller
public class VendorController {

	@Autowired
	private VendorServiceImpl vendorService;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createVendor";
	}

	@RequestMapping("/saveVendor")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {

		Vendor savedVendor = vendorService.saveVendor(vendor);
		String message = "Vendor saved with Id: " + savedVendor.getId();
		modelMap.addAttribute("message", message);

		return "createVendor";
	}

	@RequestMapping("/displayVendors")
	public String displayVendors(ModelMap modelMap) {

		List<Vendor> vendors = vendorService.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}

	@RequestMapping("/deleteVendor")
	public String deleteVendorById(@RequestParam("id") int id, ModelMap modelMap) {

		Vendor deletedVendor = vendorService.getVendorById(id);
		vendorService.deleteVendor(deletedVendor);

		List<Vendor> vendors = vendorService.getAllVendors();
		modelMap.addAttribute("vendors", vendors);

		return "displayVendors";
	}

	@RequestMapping("/showUpdate")
	public String updateVendor(@RequestParam("id") int id, ModelMap modelMap) {

		Vendor vendor = vendorService.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);

		return "updateVendor";
	}

	@RequestMapping("/updateVendorDetails")
	public String updateVendorDetails(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {

		vendorService.updateVendor(vendor);
		List<Vendor> vendors = vendorService.getAllVendors();
		modelMap.addAttribute("vendors", vendors);

		return "displayVendors";
	}

}
