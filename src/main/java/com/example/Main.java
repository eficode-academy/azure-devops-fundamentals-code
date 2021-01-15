package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@RestController
@SpringBootApplication
public class Main {

	@GetMapping("/get")
	public String index(@RequestParam String product) {
    Adify adify = new Adify(new HerokuGetRequest("adify"));
    return adify.fetch(product);
	}
	@GetMapping("/")
	public String index() {
    return "Running...";
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
