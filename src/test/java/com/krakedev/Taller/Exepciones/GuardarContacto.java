package com.krakedev.Taller.Exepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {
	private static final Logger log = LoggerFactory.getLogger(GuardarContacto.class);
	
	public static void main(String[] args) {
		
		FileWriter escritor = null;

		try {
			escritor = new FileWriter("contactos.txt", true);
			escritor.write("Nombre: Maria\n");
			escritor.write("Apellido: Gomez\n");
			escritor.write("Telefono: 0981234567");
			
			log.info("GUARDADO EXISTOSAMENTE");
		} catch (IOException e) {
			log.error("OCURRIO UN ERROR",e.getMessage());
		}finally {
			if(escritor != null) {
				try {
					escritor.close();
				}catch(IOException e) {
					log.error("ERROR AL CERRAR EL ARCHIVO",e.getMessage());
				}
			}
		}
	}
}
