package com.course;

import org.springframework.web.bind.annotation.*;

@RestController
public class FeedbackController {

    @PostMapping("/feedback")
    public String feedback(@RequestParam String message) {

        return "Feedback Received: " + message;
    }
}
