package com.dinesh.in28minspring;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public String greet() {
        return "Hello from GreetingService! This shows @Component and @Autowired in action.";
    }
}