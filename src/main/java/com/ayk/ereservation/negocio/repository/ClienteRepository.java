/**
 * 
 */
package com.ayk.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayk.ereservation.modelo.Cliente;

/**
 * @author alejandroflores
 *Interface para definir las operaciones de DB relacionadas con cliente
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {
	/**
	 * Definicion de metodo para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	public Cliente findByIdentificacion(String identificacionCli);
	
	
	
}
