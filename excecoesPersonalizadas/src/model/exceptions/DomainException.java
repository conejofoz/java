package model.exceptions;

public class DomainException extends Exception{

	private static final long serialVersionUID = 1L;

	/*
	 * Criar um contrutor que recebe uma string mensagem como par�metro e depois
	 * repassar esse par�metro para o contrutor da superclasse 
	 * Permite criar uma exce��o personalizada passando uma mensagem para ela
	 */
	public DomainException(String msg) {
		super(msg);
	}

}
