package com.clean.demo.infraestructure.web;

import com.clean.demo.aplication.TextProcess;
import com.clean.demo.exceptions.NotReplicated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextReplicatorController {
    private final TextProcess textProcess;

    @Autowired
    public TextReplicatorController(TextProcess textProcess) {
        this.textProcess = textProcess;
    }

    @PostMapping("/replicate")
    public ResponseEntity<TextProcessResponse> textProcess(@RequestBody TextProcessRequest body) {
        try {
            textProcess.process(body.getText());
            return ResponseEntity.ok(new TextProcessResponse(HttpStatus.OK, "success"));
        } catch (NotReplicated e) {
            return ResponseEntity.ok(new TextProcessResponse(HttpStatus.BAD_REQUEST, "not processed"));
        }
    }
}
