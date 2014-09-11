package br.com.rest.api.model.entities;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class Client.
 */
@XmlRootElement
public class Client {

	/** The name. */
	private String name;

	/** The cpf. */
	private String cpf;

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the cpf.
	 * 
	 * @return the cpf
	 */
	public String getCpf() {
		return this.cpf;
	}

	/**
	 * Sets the cpf.
	 * 
	 * @param cpf
	 *            the new cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
