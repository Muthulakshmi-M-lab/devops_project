package com.course;

import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public String courses() {

        return """
        Available Courses:
        1. DevOps Basics
        2. Cloud Computing
        3. Java Programming
        """;
    }

}
