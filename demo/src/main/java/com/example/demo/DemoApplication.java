package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		
	}

	@RequestMapping("/") 
	public String home () {
		System.out.println("Hola Mundo");
		return "Hola Mundo";
	}

		//ejemplo de métodos REST no adecuados al estilo RESTFULL

	@RequestMapping("/altas")
	public String altas(){
		return "Altas";

	}

	@RequestMapping("/bajas")
	public String bajas(){
		return "Bajas";

	}

	@RequestMapping("/cambios")
	public String cambios(){
		return "Cambios";

	}

	@RequestMapping("/consultas")
	public String consultas(){
		return "Consultas";
	}
////////
	@RequestMapping(value = "/sistema", method= RequestMethod.POST)
	public String altasREST(){
		return "Altas";

	}

	@RequestMapping(value = "/sistema", method= RequestMethod.DELETE)
	public String bajasREST(){
		return "Bajas";

	}

	@RequestMapping(value = "/sistema", method= RequestMethod.PUT)
	public String cambiosREST(){
		return "Cambios";

	}

	@RequestMapping(value = "/sistema", method= RequestMethod.GET)
	public String consultasREST(){
		return "Consultas";
	}
}