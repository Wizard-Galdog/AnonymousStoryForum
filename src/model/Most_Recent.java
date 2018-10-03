package model;

import java.time.LocalDate;

public class Most_Recent extends SmartSerializable
{
	private static final long serialVersionUID = 1L;
	
	private String storyID;
	private String storyTitle;
	private String storyMain;
	private LocalDate TimePublished;
	
	public Most_Recent(String storyID, String storyTitle, String storyMain, LocalDate timePublished) {
		super();
		this.storyID = storyID;
		this.storyTitle = storyTitle;
		this.storyMain = storyMain;
		TimePublished = timePublished;
	}

	public String getStoryID() {
		return storyID;
	}

	public void setStoryID(String storyID) {
		this.storyID = storyID;
	}

	public String getStoryTitle() {
		return storyTitle;
	}

	public void setStoryTitle(String storyTitle) {
		this.storyTitle = storyTitle;
	}

	public String getStoryMain() {
		return storyMain;
	}

	public void setStoryMain(String storyMain) {
		this.storyMain = storyMain;
	}

	public LocalDate getTimePublished() {
		return TimePublished;
	}

	public void setTimePublished(LocalDate timePublished) {
		TimePublished = timePublished;
	}
	
	
	
	
	
	
	
	

}
