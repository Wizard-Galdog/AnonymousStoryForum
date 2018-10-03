package views;

import java.util.ArrayList;
import java.util.Map;

import org.h2.mvstore.MVMap;

import model.Comment_Model;
import model.GenericHtml;
import model.NewsLetter_Model;
import model.Story_Model;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class Index extends DynamicWebPage
{

	public Index(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("Index.html")) 
			
		{
			
			ArrayList<Story_Model> stories = getStoriesList();
			
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
			
			stringToSendToWebBrowser += "  <div class=\"opaque-overlay text-center w-100 px-5\" style=\"background-image: url('indexcover2.jpg');\">\n";
			stringToSendToWebBrowser += "    <div class=\"py-5 container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12 text-white\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"display-3 mb-4\"> Rondot Stories</h1>\n";
			stringToSendToWebBrowser += "          <p class=\"lead mb-5\">&nbsp; &nbsp;Anonymous diary writing and sharing made simple.</p>\n";
			stringToSendToWebBrowser += "          <a href=\"StoriesPage.html\" class=\"btn btn-lg mx-1 btn-secondary\">Read a Story</a>\n";
			stringToSendToWebBrowser += "          <a href=\"UploadStory.html\" class=\"btn btn-lg btn-primary mx-1\">Write a Story</a>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-5 bg-primary\">\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<body class=\"bg-light h-25\">\n";
			stringToSendToWebBrowser += "  <div class=\"py-5 text-center bg-light h-75\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1>Recent Posts</h1>\n";
			stringToSendToWebBrowser += "          <p class=\"lead bg-light\">We grow together with the community</p>\n";
		//	stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			
			if (stories.size()<3) {
				for(int i = 0; i <stories.size(); i++) {
					stringToSendToWebBrowser += "        <div class=\"col-md-4 p-4 bg-light h-75\">\n";
					stringToSendToWebBrowser += "          <img class=\"img-fluid d-block rounded-circle mx-auto\" src=\"indexicon.png\" height=\"60\" width=\"60\">\n";
					stringToSendToWebBrowser += "          <div style=\"width: 300px; text-overflow: ellipsis; white-space: nowrap;\n";
					stringToSendToWebBrowser += "overflow: hidden;\">"+stories.get(i).getStoryTitle()+"</div>\n";
					stringToSendToWebBrowser += "          <p class=\"bg-light\">19:32 &nbsp;11/03/2018</p>\n";
					stringToSendToWebBrowser += "          <a href=\"StoriesPage.html/" + model.Encryption_Methods.EncryptAndEncode(stories.get(i).getStoryID()) + "\" class=\"btn btn-outline-primary text-center\">Read More</a>\n";
					stringToSendToWebBrowser += "        </div>\n";
				}
			}else {
				for(int i = 0; i <3; i++) {
					stringToSendToWebBrowser += "        <div class=\"col-md-4 p-4 bg-light h-75\">\n";
					stringToSendToWebBrowser += "          <img class=\"img-fluid d-block rounded-circle mx-auto\" src=\"indexicon.png\" height=\"60\" width=\"60\">\n";
					stringToSendToWebBrowser += "          <div style=\"width: 300px; text-overflow: ellipsis; white-space: nowrap;\n";
					stringToSendToWebBrowser += "overflow: hidden;\">"+stories.get(i).getStoryTitle()+"</div>\n";
					stringToSendToWebBrowser += "          <p class=\"bg-light\">19:32 &nbsp;11/03/2018</p>\n";
					stringToSendToWebBrowser += "          <a href=\"StoriesPage.html/" + model.Encryption_Methods.EncryptAndEncode(stories.get(i).getStoryID()) + "\" class=\"btn btn-outline-primary text-center\">Read More</a>\n";
					stringToSendToWebBrowser += "        </div>\n";
				}
			}
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-5 bg-primary\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"display-4\">Remain Anonymous &nbsp;</h1>\n";
			stringToSendToWebBrowser += "          <p class=\"lead\">Your privacy is so important to us. We dont share any of your personal information. Post with confidence knowing that your identity will remain anonymous.</p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "          <img class=\"img-fluid d-block float-right\" src=\"indeximage1.jpg\" width=\"500\" height=\"200\"> </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-5 bg-light\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "          <img class=\"img-fluid d-block\" src=\"indeximage2.jpg\" width=\"500\"> </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"display-4\">Join the Community</h1>\n";
			stringToSendToWebBrowser += "          <p class=\"lead\">Interact with other people read about the pivotal moments in their lives. &nbsp;Their biggest regrets and their greatest victories.&nbsp;</p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-5 bg-primary\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"display-4\">No Joining fee</h1>\n";
			stringToSendToWebBrowser += "          <p class=\"lead\">Go ahead and create your own public or private diary today. We will host your diary online at no cost. Join today!</p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "          <img class=\"img-fluid d-block float-right\" src=\"indeximage3.jpg\" width=\"500\" height=\"200\"> </div>\n";
			stringToSendToWebBrowser += "</div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";

			stringToSendToWebBrowser += GenericHtml.endOfHtml("/" + toProcess.path);

			stringToSendToWebBrowser += "  <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <pingendo onclick=\"window.open('https://pingendo.com/', '_blank')\" style=\"cursor:pointer;position: fixed;bottom: 10px;right:10px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:110px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white\">made with&nbsp;&nbsp;\n";
			stringToSendToWebBrowser += "    <img src=\"https://pingendo.com/site-assets/Pingendo_logo_big.png\" class=\"d-block\" alt=\"Pingendo logo\" height=\"16\">\n";
			stringToSendToWebBrowser += "  </pingendo>\n";
			stringToSendToWebBrowser += "</body>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "</html>\n";
			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
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
				
				String url ="/" + GenericHtml.redirectToPage(toProcess.path);
				
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
	
	private ArrayList<Story_Model> getStoriesList(){
		ArrayList<Story_Model> stories = new ArrayList<Story_Model>();

		MVMap<String, Story_Model> databaseMapOfMyObjects = db.s.openMap("STORIES");

		for(Map.Entry<String, Story_Model> story: databaseMapOfMyObjects.entrySet()) {
			stories.add(story.getValue());
			}
		
		//BUBBLE SORT
	     for(int i=1; i<stories.size(); i++) {
	         Story_Model temp=null;
	         if(Double.parseDouble(stories.get(i-1).getStoryID()) > Double.parseDouble(stories.get(i).getStoryID())) {
	            temp = stories.get(i-1);
	            stories.set(i-1, stories.get(i));
	            stories.set(i, temp);
	         }
	      }
	     //END OF BUBBLE SORT

		return stories;

	}
}

