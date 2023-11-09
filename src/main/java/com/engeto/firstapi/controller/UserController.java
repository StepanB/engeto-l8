package com.engeto.firstapi.controller;

import com.engeto.firstapi.response.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {

	// localhost:8081/hello-user?name=John&surname=Doe&age=21
	@GetMapping()
	public User helloUser(
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "surname", required = false) String surname,
			@RequestParam(value = "age", required = false, defaultValue = "21") int age) {
		return new User(name, surname, age);
	}

	@PostMapping()
	public User createUser(@RequestBody User user) {
		return user;
	}

	@DeleteMapping()
	public void deleteUser() {

	}

	@PutMapping
	public void updateUser() {

	}

	@PatchMapping
	public void patchUser() {

	}
}
