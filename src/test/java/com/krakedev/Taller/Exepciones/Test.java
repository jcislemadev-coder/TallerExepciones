package com.krakedev.Taller.Exepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	private static final Logger log = LoggerFactory.getLogger(Test.class);
	
	public static void main(String[] args) {
		
		//1 Contacto incorrecto
		String telefono="0981234567";
		try {
			ValidarContacto.validarTelefono(telefono);
			GuardarContacto.guardarContacto();
			LeerContacto.leerContacto();
			log.info("Contacto guardado exitosamente");
		} catch (IllegalArgumentException e) {
            log.error("El teléfono es inválido. No se guardó el contacto.", e);
        }
		
	}

}
