package amitIt.in.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {

    @GetMapping("/welcome")
    public String greet(@RequestParam String name) {
        String msg = "Welcome " + name;
        return msg;
    }

}