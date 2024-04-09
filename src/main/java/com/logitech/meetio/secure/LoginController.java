package com.logitech.meetio.secure;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	// It should be POST request in real applications. I dealt with it for simplicity purposes.
	@GetMapping(value = "/login")
	public String login(@RequestParam String username, @RequestParam String password) throws IOException {
		if (username.equals("test") && password.equals("test")) {
			return JwtHelper.generateToken(username);
		} else {
			throw new IOException("Bad username or password");
		}
	}

}
