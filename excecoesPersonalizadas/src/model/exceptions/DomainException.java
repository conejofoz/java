package model.exceptions;

public class DomainException extends Exception{

	private static final long serialVersionUID = 1L;

	/*
	 * Criar um contrutor que recebe uma string mensagem como parâmetro e depois
	 * repassar esse parâmetro para o contrutor da superclasse 
	 * Permite criar uma exceção personalizada passando uma mensagem para ela
	 */
	public DomainException(String msg) {
		super(msg);
	}

}
