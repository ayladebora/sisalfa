package br.ufpb.dcx.sisalfa;

import java.util.ArrayList;
import java.util.List;

/**
 * A mock implementation of the SisalfaService interface, which only uses 
 * data in memory.
 * 
 * @author Ayla Dantas 
 *
 */
public class SisalfaMockService implements SisalfaService{
	
	private List<User> users;
	private List<Challenge> challenges;
	private List<Context> contexts;
	private static int nextUserId = 0;
	private static int nextChallengeId = 0;
	private static int nextContextId = 0;
	
	//We are assuming no user defined ids start with CtxID, ChID or UsrID;
	private synchronized static String getNextContextId() {
		String id = "CtxID:"+nextContextId++;
		return id;
	}
	
	private synchronized static String getNextChallengeId() {
		String id = "ChID:"+nextChallengeId++;
		return id;
	}
	
	private synchronized static String getNextUserId() {
		String id = "UsrID:"+nextUserId++;
		return id;
	}
	
	
	/**
	 * Default constructor.
	 */
	public SisalfaMockService() {
		this.users = new ArrayList<User>();
		this.challenges = new ArrayList<Challenge>();
		this.contexts = new ArrayList<Context>();
	}
	@Override
	public String addContext(Context context) throws DataAlreadyExistsException {
		if (this.contexts.contains(context)) {
			throw new DataAlreadyExistsException();
		} else {
			if (context.getContextId().equals(Context.DEFAULT_CONTEXT_ID)) {
				context.setContextId(getNextContextId());
			}
			this.contexts.add(context);
			return context.getContextId();
		}
	}
	@Override
	public List<Context> getAllContexts() {
		return this.contexts;
	}
	@Override
	public List<Context> getAllContextsOfUser(String idUser) {
		List<Context> contextsOfUser = new ArrayList<Context>();
		for (Context c: this.contexts) {
			if (c.getUserId().equals(idUser)) {
				contextsOfUser.add(c);
			}
		}
		return contextsOfUser;
	}
	@Override
	public Context getContext(String idContext) {
		for (Context c: this.contexts) {
			if (c.getContextId().equals(idContext)) {
				return c;
			}
		}
		return null;
	}
	@Override
	public void updateContext(Context context) throws DataNotFoundException{
		for (Context c: this.contexts) {
			if (c.getContextId().equals(context.getContextId())) {
				this.contexts.remove(c);
				this.contexts.add(context);
				return;
			}
		}
		throw new DataNotFoundException("Context not found. Id:"+context.getContextId());
	}
	@Override
	public void deleteContext(String idContext) throws DataNotFoundException{
		for (Context c: this.contexts) {
			if (c.getContextId().equals(idContext) ) {
				this.contexts.remove(c);
				return;
			}
		}
		throw new DataNotFoundException("Context not found. Id:"+idContext);
	}
	
	@Override
	public String addChallenge(Challenge challenge) throws DataAlreadyExistsException{
		if (this.challenges.contains(challenge)) {
			throw new DataAlreadyExistsException("This challenge already exists. Id:"+challenge.getChallengeId());
		} else {
			if (challenge.getChallengeId().equals(Challenge.DEFAULT_CHALLENGE_ID)) {
				challenge.setChallengeId(getNextChallengeId());
			}
			this.challenges.add(challenge);
			return challenge.getChallengeId();
		}
	}
	@Override
	public void updateChallenge(Challenge newChallenge) throws DataNotFoundException{
		for (Challenge c: this.challenges) {
			if (c.getChallengeId().equals(newChallenge.getChallengeId())) {
				this.challenges.remove(c);
				this.challenges.add(newChallenge);
				return;
			}
		}
		throw new DataNotFoundException("Challenge not found. Id:"+newChallenge.getChallengeId());
	}
	@Override
	public List<Challenge> getAllChallenges() {
		return this.challenges;
	}
	@Override
	public List<Challenge> getAllChallengesOfUser(String idUser) {
		List<Challenge> challengesOfUser = new ArrayList<Challenge>();
		for (Challenge c: this.challenges) {
			if (c.getUserId().equals(idUser)) {
				challengesOfUser.add(c);
			}
		}
		return challengesOfUser;
	}
	@Override
	public Challenge getChallenge(String idChallenge) throws DataNotFoundException{
		for (Challenge c: this.challenges) {
			if (c.getChallengeId().equals(idChallenge)) {
				return c;
			}
		}
		throw new DataNotFoundException("Challenge not found. Id:"+idChallenge);
	}
	@Override
	public List<Challenge> getChallengesByContext(String idContext) {
		List<Challenge> challengesByContext = new ArrayList<Challenge>();
		for (Challenge c: this.challenges) {
			if (c.getContextId().equals(idContext)) {
				challengesByContext.add(c);
			}
		}
		return challengesByContext;
	}
	@Override
	public String addUser(User user) throws DataAlreadyExistsException {
		if (this.users.contains(user)) {
			throw new DataAlreadyExistsException("User already exists. Id:"+user.getUserId());
		} else {
			if (user.getUserId().equals(User.DEFAULT_USER_ID)) {
				user.setUserId(getNextUserId());
			}
			this.users.add(user);
			return user.getUserId();
		}
		
	}
	@Override
	public List<User> getAllUsers() {
		return this.users;
	}
	@Override
	public User getUser(String idUser) throws DataNotFoundException{
		for (User u: this.users) {
			if (u.getUserId().equals(idUser)) {
				return u;
			}
		}
		throw new DataNotFoundException("User not found. Id:"+idUser);
	}
	
	@Override
	public void deleteChallenge(String idChallenge) throws DataNotFoundException{
		for (Challenge c: this.challenges) {
			if (c.getChallengeId().equals(idChallenge)) {
				this.challenges.remove(c);
				return;
			}
		}
		throw new DataNotFoundException("Challenge not found. Id:"+idChallenge);
	}
	@Override
	public void deleteUser(String idUser) throws DataNotFoundException{
		for (User u: this.users) {
			if (u.getUserId().equals(idUser)) {
				this.users.remove(u);
				return;
			}
		}
		throw new DataNotFoundException("User not found. Id:"+idUser);
	}
	
	@Override
	public void updateUser(User user) throws DataNotFoundException{
		for (User u: this.users) {
			if (u.getUserId().equals(user.getUserId())) {
				this.users.remove(u);
				this.users.add(user);
				return;
			}
		}
		throw new DataNotFoundException("User not found. Id:"+user.getUserId());
}
	


}
