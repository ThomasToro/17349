package mx.uv.listi.SaludarDatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController //la clase será mapeable con ciertos métodos
public class App {
    @Autowired //inserta en tiempo de ejecution esa interfaz 
    Isaludadores isaludadores;


    @RequestMapping(value = "/saludos",method = RequestMethod.GET)
    public Iterable<Saludadores> obtenerSaludos(){
        return isaludadores.findAll();

    }

    @PostMapping("/saludos")
    public void crearSaludos(@RequestBody Saludadores saludadores){
        isaludadores.save(saludadores);
        
    }
    
}
