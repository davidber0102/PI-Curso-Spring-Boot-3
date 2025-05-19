package mx.davdev.com.Proyecto1.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiRestController {

    @Value("${ceo.davdev.nombre}")
    private String nombreCeo;

    @Value("${url.davdev}")
    private String urlPagina;

    @GetMapping("/datoscorporativos")
    public String getDatosCorporativos(){
        return "Nombre del CEO: " + nombreCeo + "<br>" + "URL de la Web " + urlPagina;
    }

    @GetMapping("/")
   public String Saludo(){
        return "index";
    }

    @GetMapping("/info")
    public String informacion() {
        return "esta es la web de los mejores programadores de mexico parael mundo";
    }
}

