package br.ufpb.dcx.sisalfa;

/**
 * Represents a User that created a Challenge or Context.
 * 
 * @author Ayla Dantas
 *
 */
public class User {

	public static final String DEFAULT_USER_NAME = "Anonymous";
	public static final String DEFAULT_USER_ID = "-1";

	private String name;
	private String userId;

	/**
	 * Constructor
	 * 
	 * @param name
	 *            The user name.
	 * @param userId
	 *            The user id.
	 */
	public User(String name, String userId) {
		this.name = name;
		this.userId = userId;
	}

	/**
	 * Constructor
	 * 
	 * @param name
	 *            The user name.
	 * @param userId
	 *            The user id.
	 */
	public User() {
		this.name = DEFAULT_USER_NAME;
		this.userId = DEFAULT_USER_ID;
	}

	/**
	 * The name of the User.
	 * 
	 * @return the name of the user.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Changes the name of the User.
	 * 
	 * @param name
	 *            The new name for the User.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the id of this User.
	 * 
	 * @return
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Changes the if of this User.
	 * 
	 * @param userId
	 *            The new id for this User.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", userId=" + userId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

}
