package com.example.swaggerdemo.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloRestController {
	@GetMapping("hello")
	fun hello() = "Hello"
}
