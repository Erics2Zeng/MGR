import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generator")
public class Controller {

    @GetMapping
    public String sayHello(){
        return "hello";
    }
}
