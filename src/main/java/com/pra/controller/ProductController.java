package com.pra.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public String saveProduct(@Valid Product product, BindingResult result, Model model) {
		System.out.println(product);

		if (result.hasErrors()) {
			return "index";
		} else {
			model.addAttribute("msg", "Product Saved Succesfully...");
		}
		return "index";
	}
}
