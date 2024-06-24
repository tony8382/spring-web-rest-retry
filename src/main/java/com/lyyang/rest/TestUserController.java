package com.lyyang.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TestUserController {

    @GetMapping("200")
    public ResponseEntity<String> response200() {
        return new ResponseEntity<String>("OOK", HttpStatus.OK);
    }

    @GetMapping("400")
    public ResponseEntity<String> response400() {
        return new ResponseEntity<String>("not ok 400", HttpStatus.PAYMENT_REQUIRED);
    }

    @GetMapping("500")
    public ResponseEntity<String> response500() {
        return new ResponseEntity<String>("not ok 500", HttpStatus.NOT_IMPLEMENTED);
    }

}