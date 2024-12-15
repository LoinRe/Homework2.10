package calculator.HW.Controller;

import calculator.HW.Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreetings() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String sumNumbers(@RequestParam Integer num1, @RequestParam Integer num2) {
        int result = calculatorService.sum(num1, num2);
        return generateMessage(num1, num2, '+', result);
    }

    @GetMapping(path = "/minus")
    public String minusNumbers(@RequestParam Integer num1, @RequestParam Integer num2) {
        int result = calculatorService.minus(num1, num2);
        return generateMessage(num1, num2, '-', result);
    }

    @GetMapping(path = "/multiply")
    public String multiplyNumbers(@RequestParam Integer num1, @RequestParam Integer num2) {
        int result = calculatorService.multiply(num1, num2);
        return generateMessage(num1, num2, '*', result);
    }

    @GetMapping(path = "/divide")
    public String divideNumbers(@RequestParam Integer num1, @RequestParam Integer num2) {
        int result = calculatorService.divide(num1, num2);
        return generateMessage(num1, num2, '/', result);
    }

    private String generateMessage(Integer num1, Integer num2, char action, int result) {
        return num1 + " " + action + " " + num2 + " = " + result;
    }
}
