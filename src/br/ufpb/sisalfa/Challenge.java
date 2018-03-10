package br.ufpb.sisalfa;

/**
 * Represents a Challenge for exercises or games based on words.
 * 
 * @author Ayla Dantas
 *
 */
public class Challenge {
	private String word;
	private String challengeId;
	private String userId;
	private String contextId;
	private String sound;
	private String videoUrl;
	private String image;
	public static final String DEFAULT_CHALLENGE_WORD = "Empty Challenge";
	public static final String DEFAULT_CHALLENGE_ID = "-1";
	
	/**
	 * Default Constructor.
	 */
	public Challenge() {
		this(DEFAULT_CHALLENGE_WORD, DEFAULT_CHALLENGE_ID, User.DEFAULT_USER_ID, Context.DEFAULT_CONTEXT_ID, null,null,null);
	}
	/**
	 * Constructor
	 * @param word The word.
	 * @param challengeId The id of this Challenge.
	 * @param userId The id of the User that created this Challenge.
	 * @param contextId The id of the Context related with this Challenge.
	 * @param sound The sound representing this Challenge.
	 * @param videoUrl The URL of a video representing this Challenge.
	 * @param image The image representing this Challenge.
	 */
	public Challenge(String word, String challengeId, String userId, String contextId, String image, String sound, String videoUrl) {
		super();
		this.word = word;
		this.challengeId = challengeId;
		this.userId = userId;
		this.contextId = contextId;
		this.sound = sound;
		this.videoUrl = videoUrl;
		this.image = image;
	}
	
	/**
	 * Gets the word of this Challenge.
	 * 
	 * @return the word of this Challenge.
	 */
	public String getWord() {
		return word;
	}

	/**
	 * Changes the word of this Challenge.
	 * 
	 * @param word
	 *            The new word for this Challenge.
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * Gets the id of this Challenge.
	 * 
	 * @return the id of this Challenge.
	 */
	public String getChallengeId() {
		return challengeId;
	}

	/**
	 * Changes the id of this Challenge.
	 * 
	 * @param challengeId
	 *            The new id for this Challenge.
	 */
	public void setChallengeId(String challengeId) {
		this.challengeId = challengeId;
	}

	/**
	 * The id of the User that owns this Challenge.
	 * 
	 * @return the id of the User that owns this Challenge.
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Changes the id of the user that owns this Challenge.
	 * 
	 * @param userId
	 *            the new id of the user that owns this Challenge.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Returns the id of the Context related to this Challenge.
	 * 
	 * @return the id of the Context related to this Challenge.
	 */
	public String getContextId() {
		return contextId;
	}

	/**
	 * Changes the id of this Challenge.
	 * 
	 * @param contextId
	 *            the new if of this Challenge.
	 */
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	/**
	 * Returns the sound for this Challenge.
	 * 
	 * @return the sound for this Challenge.
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * Changes the sound for this Challenge.
	 * 
	 * @param sound
	 *            the new sound for this Challenge.
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	/**
	 * Gets the URL of a video for this Challenge.
	 * 
	 * @return the URL of a video for this Challenge.
	 */
	public String getVideoUrl() {
		return videoUrl;
	}

	/**
	 * Sets the URL of a video for this Challenge.
	 * 
	 * @param videoUrl
	 *            The new video URL.
	 */
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	/**
	 * Returns the image for this Challenge.
	 * 
	 * @return the image for this Challenge.
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Changes the image of this Challenge.
	 * 
	 * @param image
	 *            The new image for this Challenge.
	 */
	public void setImage(String image) {
		this.image = image;
	}



	@Override
	public String toString() {
		return "Challenge [word=" + word + ", challengeId=" + challengeId + ", userId=" + userId + ", contextId="
				+ contextId + ", sound=" + sound + ", videoUrl=" + videoUrl + ", image=" + image + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((challengeId == null) ? 0 : challengeId.hashCode());
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
		Challenge other = (Challenge) obj;
		if (challengeId == null) {
			if (other.challengeId != null)
				return false;
		} else if (!challengeId.equals(other.challengeId))
			return false;
		return true;
	}

}
