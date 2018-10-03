package views;

import java.util.ArrayList;
import java.util.Map;

import org.h2.mvstore.MVMap;

import model.GenericHtml;
import model.NewsLetter_Model;
import model.Story_Model;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class Search extends DynamicWebPage
{
	
	public Search(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("Search.html"))
		{
			
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser += "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://v40.pingendo.com/assets/4.0.0/default/theme.css\" type=\"text/css\"> </head>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<body>\n";
			stringToSendToWebBrowser += GenericHtml.navBar();
			stringToSendToWebBrowser += "  <div class=\"py-5 bg-primary\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"\" align=\"center\" style=\"font-size:72\">Search Stories</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "    <div class=\"py-5 bg-primary\">\n";
			stringToSendToWebBrowser += "      <div class=\"container\">\n";
			stringToSendToWebBrowser += "        <div class=\"row\">\n";
			stringToSendToWebBrowser += "          <form class=\"form-inline\" action=\"/Search.html/RunSearch\">\n";
			stringToSendToWebBrowser += "            <div class=\"col-md-7 text-center\">\n";
			stringToSendToWebBrowser += "              <div class=\"input-group\">\n";
			stringToSendToWebBrowser += "                <input type=\"text\" class=\"form-control form-control-lg\" placeholder=\"Keyword\" size=\"100\" name=\"searchKeyword\">\n";
			stringToSendToWebBrowser += "                <button class=\"btn-lg text-center btn-outline-light border align-items-center align-self-center\" type=\"submit\">Search</button>\n";
			stringToSendToWebBrowser += "             </div>\n";
			stringToSendToWebBrowser += "            </form>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <div class=\"list-group\">\n";
			stringToSendToWebBrowser += "            <a href=\"#\" class=\"list-group-item list-group-item-action flex-column align-items-start active\" name=\"searchOutput\"></a>\n";
			stringToSendToWebBrowser += "          </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "    <div class=\"py-5 bg-primary\"></div>\n";
			
			stringToSendToWebBrowser += "<div class=\"bg-white\">\n";
			stringToSendToWebBrowser += GenericHtml.endOfHtml("/" + toProcess.path);
			
			stringToSendToWebBrowser += "    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "    <pingendo onclick=\"window.open('https://pingendo.com/', '_blank')\" style=\"cursor:pointer;position: fixed;bottom: 10px;right:10px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:180px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white\">Made with Pingendo&nbsp;&nbsp;\n";
			stringToSendToWebBrowser += "      <img src=\"https://pingendo.com/site-assets/Pingendo_logo_big.png\" class=\"d-block\" alt=\"Pingendo logo\" height=\"16\">\n";
			stringToSendToWebBrowser += "    </pingendo>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "</body>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "</html>\n";
			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
			return true;
		}else if (toProcess.path.equalsIgnoreCase("Search.html/RunSearch")) {
			String search_term = toProcess.params.get("searchKeyword");

			ArrayList<Story_Model> stories = searchStories(search_term);


			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser += "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://v40.pingendo.com/assets/4.0.0/default/theme.css\" type=\"text/css\"> </head>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<body>\n";
			stringToSendToWebBrowser += GenericHtml.navBar();
			stringToSendToWebBrowser += "  <div class=\"py-5 bg-primary\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"\" align=\"center\"  style=\"font-size:72\">Search Stories</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "    <div class=\"py-5 bg-primary\">\n";
			stringToSendToWebBrowser += "      <div class=\"container\">\n";
			stringToSendToWebBrowser += "        <div class=\"row\">\n";
			stringToSendToWebBrowser += "          <form class=\"form-inline\" action=\"/Search.html/RunSearch\">\n";
			stringToSendToWebBrowser += "            <div class=\"col-md-7 text-center\">\n";
			stringToSendToWebBrowser += "              <div class=\"input-group\">\n";
			stringToSendToWebBrowser += "                <input type=\"text\" class=\"form-control form-control-lg\" placeholder=\"Keyword\" size=\"100\" name=\"searchInput\" value=\"" + search_term + "\">\n";
			stringToSendToWebBrowser += "                <button class=\"btn-lg text-center btn-outline-light border align-items-center align-self-center\" type=\"submit\">Search</button>\n";
			stringToSendToWebBrowser += "             </div>\n";
			stringToSendToWebBrowser += "            </form>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";

			if (stories.size() == 0)
			{
				stringToSendToWebBrowser += "          <p>No results found</p>\n";
			}else{
				stringToSendToWebBrowser += "          <div class=\"list-group\">\n";
				for(Story_Model story: stories)
				{
					stringToSendToWebBrowser += "            <a href=\"/StoriesPage.html/" + model.Encryption_Methods.EncryptAndEncode(story.getStoryID()) + "\" class=\"list-group-item list-group-item-action flex-column align-items-start active\" name=\"searchOutput\">"+ story.getStoryTitle() +"</a>\n";

				}
				stringToSendToWebBrowser += "          </div>\n";
			}

			stringToSendToWebBrowser += "          </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    <div class=\"py-5 bg-primary\"></div>\n";
			
			stringToSendToWebBrowser += "<div class=\"bg-white\">\n";
			stringToSendToWebBrowser += GenericHtml.endOfHtml("/" + toProcess.path);
			stringToSendToWebBrowser += "    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "    <pingendo onclick=\"window.open('https://pingendo.com/', '_blank')\" style=\"cursor:pointer;position: fixed;bottom: 10px;right:10px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:180px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white\">Made with Pingendo&nbsp;&nbsp;\n";
			stringToSendToWebBrowser += "      <img src=\"https://pingendo.com/site-assets/Pingendo_logo_big.png\" class=\"d-block\" alt=\"Pingendo logo\" height=\"16\">\n";
			stringToSendToWebBrowser += "    </pingendo>\n";
			stringToSendToWebBrowser += "</body>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "</html>\n";
			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
			return true;

		}else if(toProcess.path.contains("Subscribe")){
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


	private ArrayList<Story_Model> searchStories(String search_term){
		ArrayList<Story_Model> stories = new ArrayList<Story_Model>();

		MVMap<String, Story_Model> databaseMapOfMyObjects = db.s.openMap("STORIES");
		for(Map.Entry<String, Story_Model> story: databaseMapOfMyObjects.entrySet()) {
			if (story.getValue().getStoryTitle().toLowerCase().contains(search_term) ||
					story.getValue().getStoryMain().toLowerCase().contains(search_term)) {

				stories.add(story.getValue());
			}
		}

		return stories;

	}
	
}

