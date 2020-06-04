package com.sdos.springboot.backend.apirest.models.services;

import java.util.List;

import com.sdos.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

}
