/**
 * 
 */
package com.ayk.ereservation.vista.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayk.ereservation.modelo.Cliente;
import com.ayk.ereservation.negocio.service.ClienteService;
import com.ayk.ereservation.vista.resources.vo.ClienteVO;

/**
 * clase que representa el servicio web del cliente
 * @author alejandroflores
 *
 */

@RestController
@RequestMapping("/api/cliente")
public class ClienteResource {

	private final ClienteService clienteService;
	
	public ClienteResource(ClienteService clienteService) { 
		this.clienteService = clienteService;	
	}	
	
	public ResponseEntity<Cliente> createCliente(@RequestBody ClienteVO clienteVo) {
		Cliente cliente = new Cliente();
		cliente.setNombreCli(clienteVo.getNombreCli());
		
	}

	
	
}
