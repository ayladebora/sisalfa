package br.ufpb.dcx.sisalfa;

import java.rmi.RemoteException;
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
	 * @return The id of the Context inserted.
	 * 
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 * @throws DataAlreadyExistsException
	 *             when the Context being added already exists.
	 * 
	 */
	public String addContext(Context context) throws RemoteException, DataAlreadyExistsException;

	/**
	 * Returns a list with all contexts.
	 * 
	 * @return a list with all contexts.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 */
	public List<Context> getAllContexts() throws RemoteException;

	/**
	 * Returns a list with all contexts created by a given user.
	 * 
	 * @param idUser
	 *            The id of the user.
	 * @return a list with all contexts created by a user.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 */
	public List<Context> getAllContextsOfUser(String idUser) throws RemoteException;

	/**
	 * Gets a given context.
	 * 
	 * @param idContext
	 *            The id of a Context.
	 * @return The Context identified by a given id.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 * @throws DataNotFoundException when the Context being searched is not found.
	 */
	public Context getContext(String idContext) throws RemoteException, DataNotFoundException;

	/**
	 * Updates a given Context.
	 * 
	 * @param context
	 *            The Context with updated information.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 * @throws DataNotFoundException when the Context being updated is not found.
	 * 
	 */
	public void updateContext(Context context) throws RemoteException, DataNotFoundException;

	/**
	 * Deletes a certain Context.
	 * 
	 * @param idContext
	 *            The id of the Context to be deleted.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 * @throws DataNotFoundException when the Context being deleted is not found.
	 */
	public void deleteContext(String idContext) throws RemoteException, DataNotFoundException;

	/**
	 * Inserts a new Challenge.
	 * 
	 * @param challenge
	 *            The new Challenge to be inserted.
	 * @return the id of the Challenge that was added.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 * @throws DataAlreadyExistsException
	 *             when the Context being added already exists.
	 * 
	 */
	public String addChallenge(Challenge challenge) throws RemoteException, DataAlreadyExistsException;

	/**
	 * Updates a Challenge.
	 * 
	 * @param newChallenge
	 *            The Challenge with updated information.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 * @throws DataNotFoundException when the Challenge being updated is not found.
	 */
	public void updateChallenge(Challenge newChallenge) throws RemoteException, DataNotFoundException;

	/**
	 * Returns a list with all the challenges.
	 * 
	 * @return a list with all the challenges.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 */
	public List<Challenge> getAllChallenges() throws RemoteException;

	/**
	 * Returns a list with all the challenges of a given user.
	 * 
	 * @return a list with all the challenges created by a given user.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 */
	public List<Challenge> getAllChallengesOfUser(String idUser) throws RemoteException;

	/**
	 * Gets a given Challenge.
	 * 
	 * @param idChallenge
	 *            The id of the Challenge to be obtained.
	 * @return the Challenge found.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 * @throws DataNotFoundException when the Challenge being searched is not found.
	 */
	public Challenge getChallenge(String idChallenge) throws RemoteException, DataNotFoundException;

	/**
	 * Gets the list of Challenges associated with a given context.
	 * 
	 * @param idContext
	 *            The Context id.
	 * @return the list of Challenges associated with a given context.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 */
	public List<Challenge> getChallengesByContext(String idContext) throws RemoteException;

	/**
	 * Deletes a certain Challenge.
	 * 
	 * @param idChallenge
	 *            The id of the Challenge to be deleted.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 * @throws DataNotFoundException when the Challenge being deleted is not found.
	 */
	public void deleteChallenge(String idChallenge) throws RemoteException, DataNotFoundException;

	
	/**
	 * Inserts a new User.
	 * 
	 * @param user
	 *            The new user.
	 * @return the id of the user that was added.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 * @throws DataAlreadyExistsException
	 *             when the User being added already exists.
	 * 
	 */
	public String addUser(User user) throws RemoteException, DataAlreadyExistsException;

	/**
	 * Gets the list of all users.
	 * 
	 * @return the list with all users.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 */
	public List<User> getAllUsers() throws RemoteException;

	/**
	 * Gets a given user.
	 * 
	 * @param idUser
	 *            The id of a user.
	 * @return The user found.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 * @throws DataNotFoundException when the user being searched is not found.
	 */
	public User getUser(String idUser) throws RemoteException, DataNotFoundException;

	/**
	 * Deletes a user with a given id.
	 * 
	 * @param idUser
	 *            The id of a user.
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 * @throws DataNotFoundException when the user being deleted is not found.
	 */
	public void deleteUser(String idUser) throws RemoteException, DataNotFoundException;

	/**
	 * Updates a user with a given id.
	 * 
	 * @param newUser
	 *            The new user to replace the previews one with this id.
	 * 
	 * @throws RemoteException if there is any communication problem with the
	 *             service.
	 * @throws DataNotFoundException when the user being updated is not found.
	 */
	public void updateUser(User newUser) throws RemoteException, DataNotFoundException;

}
