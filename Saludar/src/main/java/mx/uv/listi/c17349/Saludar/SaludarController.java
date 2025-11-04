package mx.uv.listi.c17349.Saludar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@RestController
public class SaludarController {

    Saludador persona;

    @RequestMapping("/")
    public String home() {
        return "Hola bebes";
    }

    //otra forma de hacerlo, se usa para 
    @GetMapping(value = {"saludar","/saludar/{nombre}"}) 
    public String Saludar(@PathVariable(required = false) String nombre) {//si no esta required pone null
        if (nombre != null) {
            return "Hola " + nombre;
            
        }
        return "Hola default name";

    }

    @RequestMapping(value = "/saludar2", method = RequestMethod.GET)
    public Saludador mostrar(){
        Saludador s= new Saludador("xxx");
        return s;
    }

    //////////////////////////////////////////////////

    @GetMapping("/saludarget")
    public Saludador saludarGet(){
        return this.persona; 
    }

    //otra forma de procesar, se usa para json
    @PostMapping("/saludarpost")
    public void saludarPost(@RequestBody Saludador s){
        System.out.println(s);
        this.persona= s;
        

    }

    //una forma de procesar diferente, se usa para filtrar
    @GetMapping("/query")
        public void metodo(@RequestParam String nombre){
            System.out.println(nombre);

        }

    @GetMapping("/backend") //se encargara de recibir un request param de tipo string
    public String backend(@RequestParam String nombre, @RequestParam String password){
        System.out.println("Nombre: " + nombre);
        System.out.println("Password: " + password);

        return "exito";

    }
    

    }

