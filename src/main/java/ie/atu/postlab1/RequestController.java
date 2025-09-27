package ie.atu.postlab1;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping

public class RequestController {
@GetMapping("/hello")
    public String hello() {
    return "Hello";
    }

    //Using a get request
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
    return "Hello " + name + "!";
    }

    //Using a get request
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age)
    {
    return "Name: " + name + ", Age: " + age;
    }

    @GetMapping("/person")
    public Person getPerson(){
            return new Person("Matt" , 25);
    }

    @GetMapping("/calculator")
    public Calculator calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operation ){
    Calculator calculator = new Calculator(num1, num2, operation);
    calculator.calculateTotal();
    return calculator;
    }
}
