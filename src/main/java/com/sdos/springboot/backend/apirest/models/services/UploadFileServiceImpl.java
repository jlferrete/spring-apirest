package com.sdos.springboot.backend.apirest.models.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileServiceImpl implements IUploadFileService{

	private final Logger log = LoggerFactory.getLogger(UploadFileServiceImpl.class);
	
	private final static String DIRECTORIO_UPLOAD = "uploads";
	
	@Override
	public Resource cargar(String nombreFoto) throws MalformedURLException {
				
		Path rutaArchivo = getPath(nombreFoto);
		
		log.info(rutaArchivo.toString());
		
		Resource recurso = new UrlResource(rutaArchivo.toUri() );
				
		if(!recurso.exists() && !recurso.isReadable()) {
			
			rutaArchivo = Paths.get("src/main/resources/static/images").resolve("no-usuario.png").toAbsolutePath();
			recurso = new UrlResource( rutaArchivo.toUri() );
			log.error("Error no se pudo cargar la imagen: " + nombreFoto);
			
		}
		
		return recurso;
	}

	@Override
	public String copiar(MultipartFile archivo) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(String nombreFoto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Path getPath(String nombreFoto) {
		return Paths.get(DIRECTORIO_UPLOAD).resolve(nombreFoto).toAbsolutePath();
	}

}
