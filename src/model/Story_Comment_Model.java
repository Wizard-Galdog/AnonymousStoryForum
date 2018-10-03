package model;

public class Story_Comment_Model extends SmartSerializable
{
	private static final long serialVersionUID = 1L;
	
	private String storyID;
	private String commentID;
	
	public Story_Comment_Model(String storyID, String commentID) {
		this.storyID = storyID;
		this.commentID = commentID;
	}

	public String getStoryID() {
		return storyID;
	}

	public void setStoryID(String storyID) {
		this.storyID = storyID;
	}

	public String getCommentID() {
		return commentID;
	}

	public void setCommentID(String commentID) {
		this.commentID = commentID;
	}
	
	

}