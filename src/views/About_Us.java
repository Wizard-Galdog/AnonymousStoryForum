package views;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class About_Us extends DynamicWebPage
{

	public About_Us(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("About_Us.html"))
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
			stringToSendToWebBrowser += "  <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n";
			stringToSendToWebBrowser += "    <a class=\"navbar-brand\" href=\"#\">Rondot Stories</a>\n";
			stringToSendToWebBrowser += "    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> <span class=\"navbar-toggler-icon\"></span> </button>\n";
			stringToSendToWebBrowser += "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n";
			stringToSendToWebBrowser += "      <ul class=\"navbar-nav mr-auto\">\n";
			stringToSendToWebBrowser += "        <li class=\"nav-item active\">\n";
			stringToSendToWebBrowser += "          <a class=\"nav-link\" href=\"/index.html\">Home <span class=\"sr-only\">(current)</span></a>\n";
			stringToSendToWebBrowser += "        </li>\n";
			stringToSendToWebBrowser += "        <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "          <a class=\"nav-link\" href=\"/UploadStory.html\">Write a story</a>\n";
			stringToSendToWebBrowser += "        </li>\n";
			stringToSendToWebBrowser += "      </ul>\n";
			stringToSendToWebBrowser += "      <form class=\"form-inline my-2 my-lg-0\">\n";
			stringToSendToWebBrowser += "        <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n";
			stringToSendToWebBrowser += "        <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n";
			stringToSendToWebBrowser += "      </form>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </nav>\n";
			stringToSendToWebBrowser += "  <div class=\"h-100\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"display-3 text-primary h-25 text-left\">About Us</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "          <img class=\"img-fluid d-block\" src=\"AboutUs_1.jpg\" height=\"200\" width=\"600\">\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "          <p class=\"text-center\"><b>Rondot is a Free Online diary/Journal for everyone that can be used on multiple devices</b>.\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "            <br>Users can anonymously submit the pivotal moments in their lives. Their biggest regrets and their greatest victories.&nbsp;By getting into the habit of consciously and attentively looking back over your journals, you're able to track your personal\n";
			stringToSendToWebBrowser += "            patterns of behaviour that help you achieve goals and respond effectively to challenges.&nbsp;</p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"section\">\n";
			stringToSendToWebBrowser += "    <div class=\"bg-primary hidden-xs py-5\">\n";
			stringToSendToWebBrowser += "      <font size=\"5\">\n";
			stringToSendToWebBrowser += "        <font size=\"5\">\n";
			stringToSendToWebBrowser += "          <div class=\"row\">\n";
			stringToSendToWebBrowser += "            <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "              <h1 class=\"mx-3\">Restrictions on Use</h1>\n";
			stringToSendToWebBrowser += "              <p class=\"py-0 mx-3\">Rondot&nbsp;users may not:\n";
			stringToSendToWebBrowser += "                <br>* Violate or infringe in any way the rights of others&nbsp;\n";
			stringToSendToWebBrowser += "                <br>* Reverse engineer\n";
			stringToSendToWebBrowser += "                <br>* Violate laws&nbsp;\n";
			stringToSendToWebBrowser += "                <br>* Violate copyright&nbsp;\n";
			stringToSendToWebBrowser += "                <br>* Impersonate another user&nbsp;\n";
			stringToSendToWebBrowser += "                <br>* Send unsolicited e-mail\n";
			stringToSendToWebBrowser += "                <br>* Be abusive, offensive, or in any way hurtful to other members</p>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "            <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "              <img class=\"img-fluid d-block\" src=\"AboutUs_2.jpg\" width=\"500\" height=\"200\">\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "          </div>\n";
			stringToSendToWebBrowser += "          <br> </font>\n";
			stringToSendToWebBrowser += "      </font>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "<body>\n";
			stringToSendToWebBrowser += "  <div class=\"py-5\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"\">Get In Touch</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <form class=\"\">\n";
			stringToSendToWebBrowser += "            <p class=\"\">Something not working as well as you hoped? Got an idea that could make our make better? Let us know below!</p>\n";
			stringToSendToWebBrowser += "            <div class=\"form-group\"> <label>Name</label>\n";
			stringToSendToWebBrowser += "              <input type=\"text\" class=\"form-control\" placeholder=\"Enter Your Name\"> <small class=\"form-text text-muted\">We'll never share your info with anyone else.</small> </div>\n";
			stringToSendToWebBrowser += "            <div class=\"form-group\"> <label>Comments</label>\n";
			stringToSendToWebBrowser += "              <input type=\"text\" class=\"form-control\" placeholder=\"Leave your comment here!\"> </div>\n";
			stringToSendToWebBrowser += "            <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n";
			stringToSendToWebBrowser += "          </form>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <p class=\"text-left\">\n";
			stringToSendToWebBrowser += "            <font size=\"6\"><b>Want to contribute to Rondot.com?\n";
			stringToSendToWebBrowser += "            <a href=\"url\">Click Here</a></b> </font>\n";
			stringToSendToWebBrowser += "          </p>\n";
			stringToSendToWebBrowser += "          <font size=\"6\"> </font>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <font size=\"6\"> </font>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "      <font size=\"6\"> </font>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "    <font size=\"6\">\n";
			stringToSendToWebBrowser += "      <font size=\"5\">\n";
			stringToSendToWebBrowser += "        <font size=\"5\"></font>\n";
			stringToSendToWebBrowser += "      </font>\n";
			stringToSendToWebBrowser += "    </font>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "          <img srcS=\"indeximage3.jpg\" width=\"500\n";
			stringToSendToWebBrowser += "500\"> </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"bg-dark text-\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"p-4 col-md-3\">\n";
			stringToSendToWebBrowser += "          <h2 class=\"mb-4 text-secondary\">Rondot Stories</h2>\n";
			stringToSendToWebBrowser += "          <p class=\"text-white\">A company based on people's stories, adventures and life.</p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"p-4 col-md-3\">\n";
			stringToSendToWebBrowser += "          <h2 class=\"mb-4 text-secondary\">Mapsite</h2>\n";
			stringToSendToWebBrowser += "          <ul class=\"list-unstyled\">\n";
			stringToSendToWebBrowser += "            <a href=\"#\" class=\"text-white\">Home</a>\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "            <a href=\"About_Us.html\" class=\"text-white\">About us</a>\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "            <a href=\"About_Us.html\" class=\"text-white\">Our services</a>\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "            <a href=\"StoriesPage.html\" class=\"text-white\">Stories</a>\n";
			stringToSendToWebBrowser += "          </ul>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"p-4 col-md-3\">\n";
			stringToSendToWebBrowser += "          <h2 class=\"mb-4\">Contact</h2>\n";
			stringToSendToWebBrowser += "          <p>\n";
			stringToSendToWebBrowser += "            <a href=\"tel:+246 - 542 550 5462\" class=\"text-white\"><i class=\"fa d-inline mr-3 text-secondary fa-phone\"></i>+246 - 542 550 5462</a>\n";
			stringToSendToWebBrowser += "          </p>\n";
			stringToSendToWebBrowser += "          <p>contact@rondotstories.co.uk</p>\n";
			stringToSendToWebBrowser += "          <p>\n";
			stringToSendToWebBrowser += "            <a href=\"https://goo.gl/maps/AUq7b9W7yYJ2\" class=\"text-white\" target=\"_blank\"><i class=\"fa d-inline mr-3 fa-map-marker text-secondary\"></i>18 Malone Rd, Belfast&nbsp;</a>\n";
			stringToSendToWebBrowser += "          </p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"p-4 col-md-3\">\n";
			stringToSendToWebBrowser += "          <h2 class=\"mb-4 text-light\">Subscribe</h2>\n";
			stringToSendToWebBrowser += "          <form>\n";
			stringToSendToWebBrowser += "            <fieldset class=\"form-group text-white\"> <label for=\"exampleInputEmail1\">Get our newsletter</label>\n";
			stringToSendToWebBrowser += "              <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Enter email\"> </fieldset>\n";
			stringToSendToWebBrowser += "            <button type=\"submit\" class=\"btn btn-outline-secondary\">Submit</button>\n";
			stringToSendToWebBrowser += "          </form>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12 mt-3\">\n";
			stringToSendToWebBrowser += "          <p class=\"text-center text-white\">\u00C3\u0082\u00C2\u00A9 Copyright 2018 Rondot - All rights reserved.</p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"section\">\n";
			stringToSendToWebBrowser += "  <div class=\"py-5 bg-light\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row text-center\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-xs-3 text-center\">\n";
			stringToSendToWebBrowser += "          <a><i class=\"fa fa-5x fa-fw fa-instagram\"></i></a>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-xs-3\">\n";
			stringToSendToWebBrowser += "          <a><i class=\"fa fa-5x fa-fw fa-twitter\"></i></a>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-xs-3\">\n";
			stringToSendToWebBrowser += "          <a><i class=\"fa fa-5x fa-fw fa-facebook\"></i></a>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-xs-3 text-center\">\n";
			stringToSendToWebBrowser += "          <a><i class=\"fa fa-5x fa-fw fa-github\"></i></a>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
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
		return false;
	}

}