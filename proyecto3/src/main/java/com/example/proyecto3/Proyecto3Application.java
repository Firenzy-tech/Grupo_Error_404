package com.example.proyecto3;

import java.sql.Date;

import com.example.proyecto3.Modelo.Transaccion;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Proyecto3Application {

	public static void main(String[] args) {
		//SpringApplication.run(Proyecto3Application.class, args);
		
		
		Transaccion mTransaccion = new Transaccion((long) 152356, "Ejemplo de concepto", 322565986);

		System.out.println(mTransaccion.getConcept());
	
	
	}

}
