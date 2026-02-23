package com.shop.pras.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    @PostMapping("/auth/verify-local-user")
    public ResponseEntity<?> verifyUser(@RequestBody Map<String, String> request) {
        String email = request.get("baseEmail");
        String password = request.get("userPassword");

        // Тимчасова заглушка для тесту:
        if ("123".equals(password)) {
            return ResponseEntity.ok(Map.of(
                    "userName", "Yehor"
            ));
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Wrong password");
    }
}