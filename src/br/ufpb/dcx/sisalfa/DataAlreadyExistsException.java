package br.ufpb.dcx.sisalfa;

/**
 * Exception thrown when trying to insert into the system database some data that already exists.
 * @author Ayla Dantas
 *
 */
public class DataAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public DataAlreadyExistsException() {
		super();
	}
	
	/**
	 * Constructor.
	 * 
	 * @param msg The error message.
	 */
	public DataAlreadyExistsException(String msg) {
		super(msg);
	}
}
