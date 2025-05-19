package mx.davdev.com.Proyecto1.Rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiRestController {

    @GetMapping("/")
    public String Saludo(){
        return "index";
    }

    @GetMapping("/info")
    public String informacion() {
        return "esta es la web de los mejores programadores de mexico parael mundo";
    }
}

