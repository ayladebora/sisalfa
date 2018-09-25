package br.ufpb.dcx.sisalfa;

/**
 * This class represents a set of related challenges.
 * 
 * @author Ayla Dantas
 *
 */
public class Context {

	private String name;
	private String contextId;
	private String userId;
	private String imageUrl;
	private String soundUrl;
	private String videoUrl;
	
	public static final String DEFAULT_CONTEXT_NAME = "Empty Challenge";
	public static final String DEFAULT_CONTEXT_ID = "-1";

	
	public Context() {
		this(DEFAULT_CONTEXT_NAME, DEFAULT_CONTEXT_ID, User.DEFAULT_USER_ID, null,null,null);
	}
	/**
	 * Constructor
	 * @param name The Context name.
	 * @param contextId The id of the Context.
	 * @param userId The id of the User.
	 * @param image The image for this Context.
	 * @param sound The sound for this Context.
	 * @param videoUrl The URL of a video for this Context.
	 */
	public Context(String name, String contextId, String userId, String imageUrl, String soundUrl, String videoUrl) {
		this.name = name;
		this.contextId = contextId;
		this.userId = userId;
		this.imageUrl = imageUrl;
		this.soundUrl = soundUrl;
		this.videoUrl = videoUrl;
	}

	/**
	 * Gets the name of this Context.
	 * 
	 * @return the name of this Context.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Changes the name of this Context.
	 * 
	 * @param name
	 *            The new name of this Context.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the id of this Context.
	 * 
	 * @return the if of this Context.
	 */
	public String getContextId() {
		return contextId;
	}

	/**
	 * Changes the if of this Context.
	 * 
	 * @param contextId
	 *            The new value of the id for this Context.
	 */
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	/**
	 * Gets the id of the user that created this Context.
	 * 
	 * @return The id of the user that created this Context.
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Changes the id of the user that owns this Context.
	 * 
	 * @param userId
	 *            The user id.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Gets a String representing the byte[] of a sound for this Context.
	 * 
	 * @return a String representing the byte[] of a sound for this Context.
	 */
	public String getSoundUrl() {
		return soundUrl;
	}

	/**
	 * Changes the sound of this Context.
	 * 
	 * @param sound
	 *            The sound of this Context, represented by a byte[].
	 */
	public void setSoundUrl(String soundUrl) {
		this.soundUrl = soundUrl;
	}

	/**
	 * Gets the URL of a video representing this Context.
	 * 
	 * @return the URL of a video representing this Context.
	 */
	public String getVideoUrl() {
		return videoUrl;
	}

	/**
	 * Changes the URL of a video representing this Context.
	 * 
	 * @param videoUrl
	 *            the new URL of a video representing this Context.
	 */
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}


	/**
	 * Gets a String representing the byte[] of an image for this Context.
	 * 
	 * @return a String representing the byte[] of an image for this Context.
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * Sets the String representing the byte[] of an image for this Context.
	 * 
	 * @param a
	 *            String representing the byte[] of an image for this Context.
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contextId == null) ? 0 : contextId.hashCode());
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
		Context other = (Context) obj;
		if (contextId == null) {
			if (other.contextId != null)
				return false;
		} else if (!contextId.equals(other.contextId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Context [name=" + name + ", contextId=" + contextId + ", userId=" + userId + ", imageUrl=" + imageUrl
				+ ", soundUrl=" + soundUrl + ", videoUrl=" + videoUrl + "]";
	}
}
