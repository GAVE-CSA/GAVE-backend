package com.nighthawk.spring_portfolio.mvc.cybersecurity;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/news")
public class CyberSecApiController {
    @Autowired
    private NewsNowAPI newsNowAPI; 

    // return JSON object 
    @GetMapping("/fetch")
    public Map<String, String> fetchNews() {
        Map<String, String> response = new HashMap<>();
        response.put("data", newsNowAPI.fetchData());
        return response;
}

}

