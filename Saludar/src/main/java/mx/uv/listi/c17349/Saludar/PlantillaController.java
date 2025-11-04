package mx.uv.listi.c17349.Saludar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
public class PlantillaController {
    @GetMapping("/plantilla/{parametro}")
    public String plantilla(Model modelo, @PathVariable String parametro) {
        modelo.addAttribute("parametro", parametro);
        return "robert";
    }
}