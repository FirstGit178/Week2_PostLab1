package ie.atu.postlab1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping

public class RequestController {
@GetMapping("/hello")
    public String hello() {
    return "Hello";
    }

    //Using a get request
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
    return "Hello " + name + "!";
    }
}
