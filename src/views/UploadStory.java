package views;

import org.h2.mvstore.MVMap;

import model.GenericHtml;
import model.NewsLetter_Model;
import model.Story_Model;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class UploadStory extends DynamicWebPage
{

	public UploadStory(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("UploadStory.html"))
		{
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser += "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
			
			stringToSendToWebBrowser += "<script type=\"text/javascript\">\n";
			stringToSendToWebBrowser += "var count =1\n";
			stringToSendToWebBrowser += "function cleatTextAtea(elem) {\n";
			stringToSendToWebBrowser += "if(count == 1) {\n";
			stringToSendToWebBrowser += "elem.vala='';\n";
			stringToSendToWebBrowser += "count = count+1;\n";
			stringToSendToWebBrowser += "}\n";
			stringToSendToWebBrowser += "</script>";
			
			stringToSendToWebBrowser += "<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js\" type=\"text/javascript\"></script>\n";
			stringToSendToWebBrowser += "<script src=\"http://code.jquery.com/jquery-latest.js\"> </script>\n";

			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n";			
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://v40.pingendo.com/assets/4.0.0/default/theme.css\" type=\"text/css\"> </head>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<body bgcolor=\"bgcolor=\" style=\"background-color:#f3f3f3;\">\n";
			
			
			stringToSendToWebBrowser += GenericHtml.navBar();
			
			
			stringToSendToWebBrowser += "  <div class=\"py-2 bg-primary\">\n";
			stringToSendToWebBrowser += "    <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "      <h1 class=\"\">Create a story</h>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "    <font size=\"3\">\n";
			stringToSendToWebBrowser += "      <div class=\"col-md-12 bg-primary\">\n";
			stringToSendToWebBrowser += "        <font size=\"3\">\n";
			stringToSendToWebBrowser += "          <font color=\"black\"></font>\n";
			stringToSendToWebBrowser += "        </font>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </font>\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			
			stringToSendToWebBrowser += "        <font size=\"4\">\n";
			stringToSendToWebBrowser += "      <form action=\"/UploadStory/Submit.html\" method =\"GET\"\"> Story Title:\n";
			stringToSendToWebBrowser += "        </font>\n";
			stringToSendToWebBrowser += "        <br><input id=\"storyTitle\" type=\"text\" name=\"storyTitle\" pattern=\"[A-Za-z]+\" title=\"Please remove all special characters and numbers\" required><br><br>\n";
			stringToSendToWebBrowser += "        <font size=\"4\">\n";
			stringToSendToWebBrowser += "         <label for=\"storyMain\">Story:</label>";
			stringToSendToWebBrowser += "        </font>\n";
			stringToSendToWebBrowser += "        <p> <textarea id=\"storyMain\" name=\"storyMain\" rows=\"4\" cols=\"150\" onkeydown=\"autogrow()\" required></textarea>\n";
			
			stringToSendToWebBrowser += "      <button type=\"submit\" class=\"pushme\">Submit Story</button>\n";
			stringToSendToWebBrowser += "         <script>\n";
			
			stringToSendToWebBrowser += "           $(\".pushme\").click(function () {\n";
			stringToSendToWebBrowser += "           if ((document.getElementById(\"storyTitle\").value=='') && (document.getElementById(\"storyMain\").value=='')){\n";
			stringToSendToWebBrowser += "                alert(\"NO DATA ENTERED\");\n";
			stringToSendToWebBrowser += "			}else if(document.getElementById(\"storyTitle\").value == ''){\n";
			stringToSendToWebBrowser += "					alert(\"Please Enter A Story Title\");\n";
			stringToSendToWebBrowser += "			}else if (document.getElementById(\"storyMain\").value == ''){\n";
			stringToSendToWebBrowser += "					alert(\"Please Enter Story Text:\");\n";
			stringToSendToWebBrowser += "			}else{\n";
			stringToSendToWebBrowser += "             $(this).text(\"Submitted\");}\n";
			
			stringToSendToWebBrowser += "           });\n";
			
			
			stringToSendToWebBrowser += "         </script>\n";
			stringToSendToWebBrowser += "       </form>\n";
			
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			
			stringToSendToWebBrowser += GenericHtml.endOfHtml(toProcess.path);
			
			

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
		else if (toProcess.path.equalsIgnoreCase("UploadStory/Submit.html")) {
			
			Story_Model newStory = new Story_Model(
					"" + System.currentTimeMillis(),
					toProcess.params.get("storyTitle"),
					toProcess.params.get("storyMain"));
			
			if ((newStory.getStoryTitle().trim() == null) || (newStory.getStoryMain().trim() == null)) {
				
			}
			
			MVMap<String, Story_Model> STORIES = db.s.openMap("STORIES");
			STORIES.put(newStory.getStoryID(), newStory);
			db.commit();
			
			String url = "/StoriesPage.html/" + model.Encryption_Methods.EncryptAndEncode(newStory.getStoryID());
			toProcess.r = new WebResponse(WebResponse.HTTP_REDIRECT, WebResponse.MIME_HTML,
					"<html><body>Redirected: <a href=\"" + url + "\">" + url + "</a></body></html>");
			toProcess.r.addHeader("Location", url);
			return true;
		}
		else if(toProcess.path.contains("Subscribe")){
			NewsLetter_Model newsSignUp = new NewsLetter_Model(toProcess.params.get("email"));
			MVMap<String, NewsLetter_Model> NEWSLETTER = db.s.openMap("NEWSLETTER");
			NEWSLETTER.put(newsSignUp.getEmail(), newsSignUp);
			db.commit();
			
			String url = "/" + GenericHtml.redirectToPage(toProcess.path);
			toProcess.r = new WebResponse(WebResponse.HTTP_REDIRECT, WebResponse.MIME_HTML,
					"<html><body>Redirected: <a href=\"" + url + "\">" + url + "</a></body></html>");
			toProcess.r.addHeader("Location", url);
			return true;
			
		}
		return false;
	}
}