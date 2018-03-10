package br.ufpb.sisalfa;

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
	
	/**
	 * Default constructor.
	 */
	public SisalfaMockService() {
		this.users = new ArrayList<User>();
		this.challenges = new ArrayList<Challenge>();
		this.contexts = new ArrayList<Context>();
	}
	@Override
	public boolean addContext(Context context) {
		if (this.contexts.contains(context)) {
			return false;
		} else {
			this.contexts.add(context);
			return true;
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
	public boolean updateContext(String idContext, Context context) {
		for (Context c: this.contexts) {
			if (c.getContextId().equals(idContext) && context.getContextId().equals(idContext)) {
				this.contexts.remove(c);
				this.contexts.add(context);
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean deleteContext(String idContext) {
		for (Context c: this.contexts) {
			if (c.getContextId().equals(idContext) ) {
				this.contexts.remove(c);
			}
		}
		return false;
	}
	
	@Override
	public boolean addChallenge(Challenge challenge) {
		if (this.challenges.contains(challenge)) {
			return false;
		} else {
			this.challenges.add(challenge);
			return true;
		}
	}
	@Override
	public boolean updateChallenge(String challengeId, Challenge newChallenge) {
		for (Challenge c: this.challenges) {
			if (c.getChallengeId().equals(challengeId) && newChallenge.getChallengeId().equals(challengeId)) {
				this.challenges.remove(c);
				this.challenges.add(newChallenge);
				return true;
			}
		}
		return false;
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
	public Challenge getChallenge(String idChallenge) {
		for (Challenge c: this.challenges) {
			if (c.getChallengeId().equals(idChallenge)) {
				return c;
			}
		}
		return null;
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
	public boolean addUser(User user) {
		if (this.users.contains(user)) {
			return false;
		} else {
			this.users.add(user);
			return true;
		}
		
	}
	@Override
	public List<User> getAllUsers() {
		return this.users;
	}
	@Override
	public User getUser(String idUser) {
		for (User u: this.users) {
			if (u.getUserId().equals(idUser)) {
				return u;
			}
		}
		return null;
	}
	
	@Override
	public boolean deleteChallenge(String idChallenge) {
		for (Challenge c: this.challenges) {
			if (c.getChallengeId().equals(idChallenge)) {
				this.challenges.remove(c);
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean deleteUser(String idUser) {
		for (User u: this.users) {
			if (u.getUserId().equals(idUser)) {
				this.users.remove(u);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean updateUser(String idUser, User user) {
		for (User u: this.users) {
			if (u.getUserId().equals(idUser) && user.getUserId().equals(idUser)) {
				this.users.remove(u);
				this.users.add(user);
				return true;
			}
		}
		return false;
	}
	


}
