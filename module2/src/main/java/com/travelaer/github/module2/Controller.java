package com.travelaer.github.module2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    /**
     * Description of the API endpoint
     *
     * @param request Test description
     */
    @PostMapping(value = "/module2", produces = "application/json")
    public ResponseEntity<SampleResponse> secondEndpoint(@RequestBody SampleRequest request) {
        SampleResponse response = new SampleResponse();
        response.setText("hop");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

