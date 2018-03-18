package br.ufpb.dcx.sisalfa;

/**
 * Exception that represents the problem of do not finding
 * an specific data on the service.
 * @author Ayla Dantas
 *
 */
public class DataNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Default constructor.
	 */
	public DataNotFoundException() {
		super();
	}
	/**
	 * Constructor
	 * @param msg The error message.
	 */
	public DataNotFoundException(String msg) {
		super(msg);
	}

}
