package com.brandine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class Calculadora {
 
	@GetMapping("soma/{a}/{b}")
	public int somar(@PathVariable  int a, @PathVariable int b) {
		return a + b; 
	}
	@GetMapping("subtracao/{a}/{b}")
	public int subtrair(@PathVariable  int a, @PathVariable int b) {
		return a - b; 
	}
 
	@GetMapping("divisao/{a}/{b}")
	public int dividir(@PathVariable  int a, @PathVariable int b) {
		return a / b; 
	}
 
	@GetMapping("multiplicar/{a}/{b}")
	public int multiplicar(@PathVariable  int a, @PathVariable int b) {
		return a * b; 
	}
}
