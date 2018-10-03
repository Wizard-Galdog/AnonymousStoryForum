package model;

import java.util.ArrayList;

public class Comment_Model extends SmartSerializable
{
	private static final long serialVersionUID = 1L;
	
	private String commentID;
	private String commentMain;
	private ArrayList<Comment_Model> commentReplies;
	
	public Comment_Model(String commentID, String commentMain) {
		this.commentID = commentID;
		this.commentMain = commentMain;
		commentReplies = new ArrayList<Comment_Model>();
	}

	public String getCommentID() {
		return commentID;
	}

	public void setCommentID(String commentID) {
		this.commentID = commentID;
	}

	public String getCommentMain() {
		return commentMain;
	}

	public void setCommentMain(String commentMain) {
		this.commentMain = commentMain;
	}

	public ArrayList<Comment_Model> getCommentReplies() {
		return commentReplies;
	}

	public void setCommentReplies(ArrayList<Comment_Model> commentReplies) {
		this.commentReplies = commentReplies;
	}
	
	public void addCommentReply(Comment_Model commentReply) {
		this.commentReplies.add(commentReply);
	}
	
}
