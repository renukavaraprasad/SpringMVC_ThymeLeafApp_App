package com.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.pra.binding.Product;

@Controller
public class ProductController {

	@GetMapping("/display")
	public String displayForm(Model model) {
		model.addAttribute("product", new Product());
		return "index";
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(Product product, Model model) {
		System.out.println(product);
		model.addAttribute("msg", "Product Saved Succesfully...");
		return "index";
	}
}
