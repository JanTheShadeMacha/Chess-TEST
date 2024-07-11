package awesome.macha.jan.chess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ChessApplication {

    @RequestMapping("/chess")
    @ResponseBody
    String home(@RequestParam(name = "a") double a, @RequestParam(name = "b") double b) {
        System.out.println(a);
        System.out.println(b);
        double c = a + b;
        double d = a * b;
        return c + " " + d;
    }

    public static void main(String[] args) {
        SpringApplication.run(ChessApplication.class, args);
    }

}
