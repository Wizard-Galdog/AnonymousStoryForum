package model;

public class Story_Model extends SmartSerializable
{
	private static final long serialVersionUID = 1L;

		//MODEL VARIABLES
		//START
		private String storyID;
		private String storyTitle;
		private String storyMain;
		//END
		
		public Story_Model(String storyID, String storyTitle, String storyMain) {
			super();
			this.storyID = storyID;
			this.storyTitle = storyTitle;
			this.storyMain = storyMain;
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
		
		
}
