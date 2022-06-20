package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

	@GetMapping("/")
	public Map<String, String> index() {
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "Endpoint hit!");
		return map;
	}

}
