package com.engeto.firstapi.controller;

import com.engeto.firstapi.response.User;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/main")
public class MainController {

	// localhost:8080/api/hello/ ...
	// localhost:8080/hello
	@GetMapping()
	public String hello() {
		return "Hello world!";
	}

	// localhost:8080/hello/John
	@GetMapping("/{name}")
	public String hello(@PathVariable String name) {
		return "Hello " + name + "!";
	}

	// localhost:8081/hello-with-name?name=John&surname=Doe
	@GetMapping("/hello-with-name")
	public String hello(
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "surname", required = false) String surname) {
		return "Hello " + name + " " + surname +"!";
	}

	@GetMapping("/hello-int")
	public int helloInt() {
		return 13;
	}

}
