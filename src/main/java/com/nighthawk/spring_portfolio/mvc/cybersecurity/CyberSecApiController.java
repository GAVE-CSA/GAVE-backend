package com.nighthawk.spring_portfolio.mvc.cybersecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/news")
public class CyberSecApiController {
    @Autowired
    private NewsNowAPI newsNowAPI; // Use lowercase for the first letter

    @GetMapping("/fetch") // Use @GetMapping for fetching data
    public String fetchNews() {
        return newsNowAPI.fetchData();
    }
}
