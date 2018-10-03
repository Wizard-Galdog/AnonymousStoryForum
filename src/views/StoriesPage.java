package views;

import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.h2.mvstore.MVMap;

import model.Comment_Model;
import model.Encryption_Methods;
import model.GenericHtml;
import model.NewsLetter_Model;
import model.Story_Comment_Model;
import model.Story_Model;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class StoriesPage extends DynamicWebPage
{
	
	public StoriesPage(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if((toProcess.path.contains("StoriesPage.html") == true) && (toProcess.path.contains("StoriesPage/SubmitComment.html") == false) && (toProcess.path.contains("Subscribe") == false))
		{
			String storyID = model.Encryption_Methods.DecryptAndDecode(toProcess.path.substring(toProcess.path.indexOf('/')+1));
			Story_Model storyStoredInDatabase = returnStoryDetails(storyID);
			ArrayList<Comment_Model> storysComments = returnCommentDetails(storyID);
			
			
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser += "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
			
			/*stringToSendToWebBrowser += "<script type=\"text/javascript\">\n";
			stringToSendToWebBrowser += "var count =1\n";
			stringToSendToWebBrowser += "function cleatTextAtea(elem) {\n";
			stringToSendToWebBrowser += "if(count == 1) {\n";
			stringToSendToWebBrowser += "elem.vala='';\n";
			stringToSendToWebBrowser += "count = count+1;\n";
			stringToSendToWebBrowser += "}\n";
			stringToSendToWebBrowser += "</script>\n";*/
			
			
			/*stringToSendToWebBrowser += "         <script>\n";
			stringToSendToWebBrowser += "           $(\".pushme\").click(function () {\n";
			stringToSendToWebBrowser += "             $(this).text(\"Submitted\");\n";
			stringToSendToWebBrowser += "           });\n";
			stringToSendToWebBrowser += "function editLink(elem){\n";
			stringToSendToWebBrowser += "document.getElementById(\"#elem\").style.display = \"block\";\n";
			stringToSendToWebBrowser += "document.getElementById(\"message\").style.display = \"none\";\n";
			stringToSendToWebBrowser += "var message = document.getElementById(\"message\").innerHTML;\n";
			stringToSendToWebBrowser += "document.getElementById(\"editMessage\").value = message;\n";
			stringToSendToWebBrowser += "</script>\n";*/
			
			
			stringToSendToWebBrowser += "<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js\" type=\"text/javascript\"></script>\n";
			stringToSendToWebBrowser += "<script src=\"http://code.jquery.com/jquery-latest.js\"> </script>\n";
			
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://v40.pingendo.com/assets/4.0.0/default/theme.css\" type=\"text/css\"> </head>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<body bgcolor=\"bgcolor=\" style=\"background-color:#f3f3f3;\">\n";
			
			stringToSendToWebBrowser += GenericHtml.navBar();
			
			
			//START OF CSS
			stringToSendToWebBrowser +="<style>\n";
			stringToSendToWebBrowser +="ig {";
			stringToSendToWebBrowser += "font-size: 15px;\n";
			stringToSendToWebBrowser +=        "color: #0D0D0D;\n";
			stringToSendToWebBrowser +="}\n";
			stringToSendToWebBrowser +="</style>\n";
			//END OF CSS
			
			stringToSendToWebBrowser += "  <div class=\"py-2 bg-primary\">\n";
			stringToSendToWebBrowser += "    <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "      <h1 class=\"\">"+storyStoredInDatabase.getStoryTitle()+"</h1>\n";
			stringToSendToWebBrowser += "    </div>\n";
			
			
			stringToSendToWebBrowser += "    <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "      <p qclass=\"lead\">\n";
			stringToSendToWebBrowser += "        <font size=\"3\">\n";
			stringToSendToWebBrowser += "              <textarea readonly rows=\"4\" cols=\"150\">" + storyStoredInDatabase.getStoryMain() + "</textarea>\n";
			stringToSendToWebBrowser += "        </font>\n";
			stringToSendToWebBrowser += "      </p>\n";
			stringToSendToWebBrowser += "    </div>\n";
			
			
			
			stringToSendToWebBrowser += "  <form action=\"/StoriesPage/SubmitComment.html/" + toProcess.path.substring(toProcess.path.indexOf('/')+1) +"\" method=\"GET\"\n";
			
			stringToSendToWebBrowser += "      <div class=\"col-md-12 bg-light\">\n";
			stringToSendToWebBrowser += "        <h1 class=\"\">\n";
			stringToSendToWebBrowser += "          <font size=\"5\">\n";
			stringToSendToWebBrowser += "            <font color=\"black\">Comment on the Story</font>\n";
			stringToSendToWebBrowser += "          </font>\n";
			stringToSendToWebBrowser += "        </h1>\n";
			
	
			
			stringToSendToWebBrowser += "        <label for=\"commentMain\">Comment:</label><br>\n";
			stringToSendToWebBrowser += "        <p><textarea name=\"commentMain\" rows=\"2\" cols=\"150\" placeholder=\"Type your comment here\" required></textarea><br>\n";
			stringToSendToWebBrowser += "      <button class=\"pushme\">Submit Comment</button><br><br>\n";
			stringToSendToWebBrowser += "         <script>\n";
			stringToSendToWebBrowser += "           $(\".pushme\").click(function () {\n";
			stringToSendToWebBrowser += "             $(this).text(\"Submitted\");\n";
			stringToSendToWebBrowser += "           });\n";
			stringToSendToWebBrowser += "         </script>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "</form>\n";
			
			
			stringToSendToWebBrowser += "    <font size=\"3\">\n";
			stringToSendToWebBrowser += "      <div class=\"col-md-12 bg-light\">\n";
			stringToSendToWebBrowser += "        <h1 class=\"\">\n";
			stringToSendToWebBrowser += "  </div>\n";
			
			if (storysComments.isEmpty()) {
				stringToSendToWebBrowser += "          <font size=\"5\">\n";
				stringToSendToWebBrowser += "            <font color=\"black\">This Story has no comments</font><p>\n";
			} else {
				stringToSendToWebBrowser += "          <font size=\"6\">\n";
				stringToSendToWebBrowser += "            <font color=\"black\">Comments</font>\n";
			}
			
			
			
			for (int i = 0; i < storysComments.size(); i++) {
				
				stringToSendToWebBrowser += "      <div class=\"col-md-12 bg-light\">\n";
				stringToSendToWebBrowser += "      <div class=\"col-md-12 bg-primary\">\n";
				stringToSendToWebBrowser += "        <font size=\"3\">\n";
				stringToSendToWebBrowser += "          <font color=\"black\">\n";
				stringToSendToWebBrowser += "            <br><p class=\"lead bg-info border p-1\" bg-info=\"\">\n";
				stringToSendToWebBrowser += "              <font size=\"3\">\n";
				stringToSendToWebBrowser += "                <font color=\"black\">"+storysComments.get(i).getCommentMain()+"</font>\n";
				stringToSendToWebBrowser += "              </font>\n";
				stringToSendToWebBrowser += "            </p>\n";
				
				
				
				stringToSendToWebBrowser += "          </font>\n";
				
				stringToSendToWebBrowser += "  <form action=\"/StoriesPage/SubmitCommentReply.html/" + toProcess.path.substring(toProcess.path.indexOf('/')+1) + "/" + Encryption_Methods.EncryptAndEncode(storysComments.get(i).getCommentID()) +"\" method=\"GET\"\n";
				stringToSendToWebBrowser += "        <label for=\"commentMain\">Reply:</label><br>\n";
				stringToSendToWebBrowser += "        <p class=\"tab\" ><textarea name=\"replyMain\" rows=\"2\" cols=\"150\" placeholder=\"Reply to comment\" required></textarea><br>\n";
				stringToSendToWebBrowser += "      <button class=\"pushme\">Submit Reply</button><br><br>\n";
				stringToSendToWebBrowser += "         <script>\n";
				stringToSendToWebBrowser += "           $(\".pushme\").click(function () {\n";
				stringToSendToWebBrowser += "             $(this).text(\"Submitted\");\n";
				stringToSendToWebBrowser += "           });\n";
				stringToSendToWebBrowser += "         </script>\n";
				stringToSendToWebBrowser += "</form>\n";
				
						for (Comment_Model cm: storysComments.get(i).getCommentReplies()) {
							stringToSendToWebBrowser += "        <font size=\"3\">\n";
							stringToSendToWebBrowser += "          <font color=\"black\">\n";
							stringToSendToWebBrowser += "            <p><p class=\"lead bg-info border p-1\" bg-info=\"\">\n";
							stringToSendToWebBrowser += "              <font size=\"3\">\n";
							stringToSendToWebBrowser += "                <font color=\"black\">"+cm.getCommentMain()+"</font>\n";
							stringToSendToWebBrowser += "              </font>\n";
							stringToSendToWebBrowser += "            </p>\n";
						
							
							/*stringToSendToWebBrowser += "<a href=\"javascript:void(0)\" onclick=\"editLink(\"replytextarea"+i+"\">reply</a>\n";
							stringToSendToWebBrowser += "<textarea  id=\"replytextarea"+i+"\" onclick=\"namechange()\" style=\"display:none;\"></textarea>\n";
							//stringToSendToWebBrowser += "<button>reply</button>\n";
							//stringToSendToWebBrowser += "<button class=\"show_button\">reply</button>\n";
							
							stringToSendToWebBrowser += "         <script type=\"text/javascript\">\n";
							stringToSendToWebBrowser += "function editLink(elem){\n";
							stringToSendToWebBrowser += "                alert(\"NO DATA ENTERED\");\n";
							stringToSendToWebBrowser += "document.getElementById(\"#elem\").style.display = \"block\";\n";
							stringToSendToWebBrowser += "document.getElementById(\"message\").style.display = \"none\";\n";
							stringToSendToWebBrowser += "var message = document.getElementById(\"message\").innerHTML;\n";
							stringToSendToWebBrowser += "document.getElementById(\"editMessage\").value = message;\n";
							stringToSendToWebBrowser += "         </script>\n";*/
							
							
							stringToSendToWebBrowser += "          </font>\n";
							stringToSendToWebBrowser += "        </font>\n";
							stringToSendToWebBrowser += "    </font>\n";
							
							stringToSendToWebBrowser += "          </font>\n";
							stringToSendToWebBrowser += "        </font>\n";
						}
		
				stringToSendToWebBrowser += "      <br></div>\n";
				stringToSendToWebBrowser += "    </font>\n";
				stringToSendToWebBrowser += "  </div>\n";
				stringToSendToWebBrowser += "  <br>\n";
				
	
			}
			
			stringToSendToWebBrowser += "  </h1>\n";
			stringToSendToWebBrowser += "  </div\">\n";
			stringToSendToWebBrowser += "    </font>\n";
			
			

			stringToSendToWebBrowser += GenericHtml.endOfHtml("/" + toProcess.path);

			stringToSendToWebBrowser += "  <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <pingendo onclick=\"window.open('https://pingendo.com/', '_blank')\" style=\"cursor:pointer;position: fixed;bottom: 10px;right:10px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:180px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white\">Made with Pingendo&nbsp;&nbsp;\n";
			stringToSendToWebBrowser += "    <img src=\"https://pingendo.com/site-assets/Pingendo_logo_big.png\" class=\"d-block\" alt=\"Pingendo logo\" height=\"16\">\n";
			stringToSendToWebBrowser += "  </pingendo>\n";
			stringToSendToWebBrowser += "</body>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "</html>\n";
			
			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
			return true;
		}
		else if (toProcess.path.contains("StoriesPage/SubmitComment.html")) {
			Comment_Model newComment = new Comment_Model(
					"" + System.currentTimeMillis(),
					toProcess.params.get("commentMain"));
			
			MVMap<String, Comment_Model> COMMENTS = db.s.openMap("COMMENTS");
			COMMENTS.put(newComment.getCommentID(), newComment);
			db.commit();
			
			String trimmedEndOfUrl = toProcess.path;
			for (int i = 0; i<StringUtils.countMatches(toProcess.path, "/");i++) {
				trimmedEndOfUrl = trimmedEndOfUrl.substring(trimmedEndOfUrl.indexOf('/')+1);
			}
			
			Story_Comment_Model newLink = new Story_Comment_Model(
					 model.Encryption_Methods.DecryptAndDecode(trimmedEndOfUrl),
					 newComment.getCommentID());
			MVMap<String, Story_Comment_Model> STORY_COMMENTS = db.s.openMap("STORIES_COMMENTS");
			STORY_COMMENTS.put(newLink.getCommentID(), newLink);
			db.commit();
			
		
			String url = "/StoriesPage.html/" + model.Encryption_Methods.EncryptAndEncode(newLink.getStoryID());
			toProcess.r = new WebResponse(WebResponse.HTTP_REDIRECT, WebResponse.MIME_HTML,
					"<html><body>Redirected: <a href=\"/" + url + "\">" + url + "</a></body></html>");
			toProcess.r.addHeader("Location", url);
			return true;
		}
		else if (toProcess.path.contains("StoriesPage/SubmitCommentReply.html")) {
			
			Comment_Model newComment = new Comment_Model(
					"" + System.currentTimeMillis(),
					toProcess.params.get("replyMain"));
			
			String commentID = toProcess.path;
			for (int i = 0; i<StringUtils.countMatches(toProcess.path, "/");i++) {
				commentID = commentID.substring(commentID.indexOf('/')+1);
			}
			commentID = Encryption_Methods.DecryptAndDecode(commentID);
			
			String storyID = toProcess.path;

			for (int i =0; i<2; i++) {
				storyID = storyID.substring(storyID.indexOf('/')+1);
			}
			
			int i = storyID.indexOf('/');
			storyID = storyID.substring(0, i);

			
			MVMap<String, Comment_Model> COMMENTS = db.s.openMap("COMMENTS");
			Comment_Model cmd = COMMENTS.get(commentID);
			cmd.addCommentReply(newComment);
			COMMENTS.replace(cmd.getCommentID(), cmd);
			
	
			String url = "/StoriesPage.html/" + storyID;
			toProcess.r = new WebResponse(WebResponse.HTTP_REDIRECT, WebResponse.MIME_HTML,
					"<html><body>Redirected: <a href=\"/" + url + "\">" + url + "</a></body></html>");
			toProcess.r.addHeader("Location", url);
			return true;
		}
		else if(toProcess.path.contains("Subscribe")){
			NewsLetter_Model newsSignUp = new NewsLetter_Model(toProcess.params.get("email"));
			MVMap<String, NewsLetter_Model> NEWSLETTER = db.s.openMap("NEWSLETTER");
			
			if (NEWSLETTER.containsKey(newsSignUp.getEmail()) == false) {
				try {
				NEWSLETTER.put(newsSignUp.getEmail(), newsSignUp);
				db.commit();
				} catch (Exception e) {
					System.out.println("An error occured adding the email to the newsletter");
				}
				
				String url = "/" + GenericHtml.redirectToPage(toProcess.path);
				
				toProcess.r = new WebResponse(WebResponse.HTTP_REDIRECT, WebResponse.MIME_HTML,
						"<html><body>Redirected: <a href=\"" + url + "\">" + url + "</a></body></html>");
				toProcess.r.addHeader("Location", url);
				
			} else {
				System.out.println("An email already subscribed to the newsletter has tried to subscribe");
			}
			return true;
		}
		return false;
	}
	
	private Story_Model returnStoryDetails(String storyID) {

		
		MVMap<String, Story_Model> databaseMapOfMyObjects = db.s.openMap("STORIES");
		Story_Model storyStoredInDatabase = databaseMapOfMyObjects.get(storyID);
		
		return storyStoredInDatabase;
	}
	
	private ArrayList<Comment_Model> returnCommentDetails(String storyID){
		MVMap<String, Story_Comment_Model> databaseMapOfStoryCommentLinkTable = db.s.openMap("STORIES_COMMENTS");
		ArrayList<Comment_Model> allTheStoriesComments = new ArrayList<Comment_Model>();
		
		ArrayList<String> commentIDs = new ArrayList<String>();
		
		for (Map.Entry<String, Story_Comment_Model> entry: databaseMapOfStoryCommentLinkTable.entrySet()) {
			if (entry.getKey().trim().equals(entry.getValue().getCommentID())) {
				Story_Comment_Model cmd = entry.getValue();
				if(cmd.getStoryID().equals(storyID)) {
					Story_Comment_Model temp = entry.getValue();
					commentIDs.add(temp.getCommentID());
				}
			}
		}
		
		MVMap<String, Comment_Model> databaseMapOfCommentTable = db.s.openMap("COMMENTS");
		for (int i = 0; i < commentIDs.size(); i++) {
			allTheStoriesComments.add(databaseMapOfCommentTable.get(commentIDs.get(i)));
		}
		
		return allTheStoriesComments;
	}

}