package br.ufpb.sisalfa;

import java.util.List;

/**
 * API for a service that provides a multimedia database to support the
 * construction of applications with a focus on literacy.
 * 
 * @author Ayla Dantas
 *
 */
public interface SisalfaService {

	/**
	 * Inserts a new Context into the database.
	 * 
	 * @param context
	 *            An object that represents a set of related challenges.
	 * @return true if the Context was added and false, otherwise.
	 * 
	 */
	public boolean addContext(Context context);

	/**
	 * Returns a list with all contexts.
	 * 
	 * @return a list with all contexts.
	 */
	public List<Context> getAllContexts();

	/**
	 * Returns a list with all contexts created by a given user.
	 * 
	 * @param idUser
	 *            The id of the user.
	 * @return a list with all contexts created by a user.
	 */
	public List<Context> getAllContextsOfUser(String idUser);

	/**
	 * Gets a given context.
	 * 
	 * @param idContext
	 *            The id of a Context.
	 * @return The Context identified by a given id.
	 */
	public Context getContext(String idContext);

	/**
	 * Updates a given Context.
	 * 
	 * @param idContext
	 *            The id of the Context to be updated.
	 * @param context
	 *            The Context with updated information.
	 * @return true if there was a challenge with the given id and false, otherwise.
	 */
	public boolean updateContext(String idContext, Context context);

	/**
	 * Deletes a certain Context.
	 * 
	 * @param idContext
	 *            The id of the Context to be deleted.
	 * @return true, if the Context was deleted and false, otherwise.
	 */
	public boolean deleteContext(String idContext);

	/**
	 * Inserts a new Challenge.
	 * 
	 * @param challenge
	 *            The new Challenge to be inserted.
	 * @return true if the Challenge was added and false, otherwise.
	 * 
	 */
	public boolean addChallenge(Challenge challenge);

	/**
	 * Updates a Challenge.
	 * 
	 * @param idChallenge
	 *            The id of the Challenge to be updated.
	 * @param newChallenge
	 *            The Challenge with updated information.
	 * @return true if there was a challenge with the given id and false, otherwise.
	 * 
	 */
	public boolean updateChallenge(String challengeId, Challenge newChallenge);

	/**
	 * Returns a list with all the challenges.
	 * 
	 * @return a list with all the challenges.
	 */
	public List<Challenge> getAllChallenges();

	/**
	 * Returns a list with all the challenges of a given user.
	 * 
	 * @return a list with all the challenges created by a given user.
	 */
	public List<Challenge> getAllChallengesOfUser(String idUser);

	/**
	 * Gets a given Challenge.
	 * 
	 * @param idChallenge
	 *            The id of the Challenge to be obtained.
	 * @return the Challenge found or null, if no challenge is found with that id.
	 */
	public Challenge getChallenge(String idChallenge);

	/**
	 * Gets the list of Challenges associated with a given context.
	 * 
	 * @param idContext
	 *            The Context id.
	 * @return the list of Challenges associated with a given context.
	 */
	public List<Challenge> getChallengesByContext(String idContext);

	/**
	 * Deletes a certain Challenge.
	 * 
	 * @param idChallenge
	 *            The id of the Challenge to be deleted.
	 * @return true, if the Challenge was deleted and false, otherwise.
	 */
	public boolean deleteChallenge(String idChallenge);

	/**
	 * Inserts a new User.
	 * 
	 * @param user
	 *            The new user.
	 * @return true if the new user was added, and false, otherwise.
	 * 
	 */
	public boolean addUser(User user);

	/**
	 * Gets the list of all users.
	 * 
	 * @return the list with all users.
	 */
	public List<User> getAllUsers();

	/**
	 * Gets a given user.
	 * 
	 * @param idUser
	 *            The id of a user.
	 * @return The user found.
	 */
	public User getUser(String idUser);

	/**
	 * Deletes a user with a given id.
	 * 
	 * @param idUser
	 *            The id of a user.
	 * @return true if the user was deleted, and false, otherwise.
	 */
	public boolean deleteUser(String idUser);

	/**
	 * Updates a user with a given id.
	 * 
	 * @param idUser
	 *            The id of a user.
	 * @param newUser
	 *            The new user to replace the previews one with this id.
	 * 
	 * @return true if the user was updated, and false, otherwise.
	 */
	public boolean updateUser(String idUser, User newUser);

}
