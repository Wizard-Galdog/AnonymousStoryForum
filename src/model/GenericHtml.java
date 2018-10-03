package model;

public class GenericHtml extends SmartSerializable
{
	private static final long serialVersionUID = 1L;

	
	public static String navBar() {
		String stringToSendToWebBrowser = "";
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
		stringToSendToWebBrowser += "      <form action=\"/Search.html/RunSearch\" method=\"GET\" class=\"form-inline my-2 my-lg-0\">\n";
		stringToSendToWebBrowser += "        <input class=\"form-control mr-sm-2\" type=\"search\" name=\"searchKeyword\" placeholder=\"Search\" aria-label=\"Search\">\n";
		stringToSendToWebBrowser += "        <button class=\"btn btn-outline-success my-2 my-sm-0\"  type=\"submit\">Search</button>\n";
		stringToSendToWebBrowser += "      </form>\n";
		stringToSendToWebBrowser += "    </div>\n";
		stringToSendToWebBrowser += "  </nav>\n";
		
		return stringToSendToWebBrowser;
	}
	
	public static String endOfHtml(String callingHtmlName) {
		String stringToSendToWebBrowser = "";
		stringToSendToWebBrowser += "  <div class=\"bg-dark text-white\">\n";
		stringToSendToWebBrowser += "    <div class=\"container\">\n";
		stringToSendToWebBrowser += "      <div class=\"row\">\n";
		stringToSendToWebBrowser += "        <div class=\"p-4 col-md-3\">\n";
		stringToSendToWebBrowser += "          <h2 class=\"mb-4 text-secondary\">Rondot Stories</h2>\n";
		stringToSendToWebBrowser += "          <p class=\"text-white\">A company based on people's stories, adventures and life.</p>\n";
		stringToSendToWebBrowser += "        </div>\n";
		stringToSendToWebBrowser += "        <div class=\"p-4 col-md-3\">\n";
		stringToSendToWebBrowser += "          <h2 class=\"mb-4 text-secondary\">Mapsite</h2>\n";
		stringToSendToWebBrowser += "          <ul class=\"list-unstyled\">\n";
		stringToSendToWebBrowser += "            <a href=\"/index.html\" class=\"text-white\">Home</a>\n";
		stringToSendToWebBrowser += "            <br>\n";
		stringToSendToWebBrowser += "            <a href=\"/About_Us.html\" class=\"text-white\">About us</a>\n";
		stringToSendToWebBrowser += "            <br>\n";
		stringToSendToWebBrowser += "            <a href=\"#\" class=\"text-white\">Our services</a>\n";
		stringToSendToWebBrowser += "            <br>\n";
		stringToSendToWebBrowser += "            <a href=\"/Index.html\" class=\"text-white\">Stories</a>\n";
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
		stringToSendToWebBrowser += "          <form action=\"" + callingHtmlName +"/Subscribe\" method=\"GET\">\n";
		stringToSendToWebBrowser += "            <fieldset class=\"form-group text-white\"> <label for=\"exampleInputEmail1\">Get our newsletter</label>\n";
		stringToSendToWebBrowser += "              <input type=\"email\" class=\"form-control\" name=\"email\" id=\"exampleInputEmail1\" placeholder=\"Enter email\"> </fieldset>\n";
		stringToSendToWebBrowser += "            <button type=\"submit\" class=\"btn btn-outline-secondary\">Submit</button>\n";
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
		stringToSendToWebBrowser += "    <div class=\"container\">\n";
		stringToSendToWebBrowser += "      <div class=\"row text-center\">\n";
		stringToSendToWebBrowser += "        <div class=\"col-xs-3 text-center\">\n";
		stringToSendToWebBrowser += "          <a href=\"https://www.instagram.com/?hl=en\" ><i class=\"fa fa-5x fa-fw fa-instagram\"></i></a>\n";
		stringToSendToWebBrowser += "        </div>\n";
		stringToSendToWebBrowser += "        <div class=\"col-xs-3\">\n";
		stringToSendToWebBrowser += "          <a href=\"https://twitter.com/signup\" ><i class=\"fa fa-5x fa-fw fa-twitter\"></i></a>\n";
		stringToSendToWebBrowser += "        </div>\n";
		stringToSendToWebBrowser += "        <div class=\"col-xs-3\">\n";
		stringToSendToWebBrowser += "          <a href=\"https://en-gb.facebook.com\"><i class=\"fa fa-5x fa-fw fa-facebook\"></i></a>\n";
		stringToSendToWebBrowser += "        </div>\n";
		stringToSendToWebBrowser += "        <div class=\"col-xs-3 text-center\">\n";
		stringToSendToWebBrowser += "          <a href=\"https://github.com\" ><i class=\"fa fa-5x fa-fw fa-github\"></i></a>\n";
		stringToSendToWebBrowser += "        </div>\n";
		stringToSendToWebBrowser += "      </div>\n";
		stringToSendToWebBrowser += "    </div>\n";
		stringToSendToWebBrowser += "  </div>\n";
		
		return stringToSendToWebBrowser;
	}
	
	public static String redirectToPage(String toProcessPath) {
		
		
		String tempContainer = toProcessPath;
		while (tempContainer.contains("/")) {
			int location = tempContainer.indexOf("/");
			tempContainer = tempContainer.substring(location+1);
			
		}
		
		int length = tempContainer.length();
		System.out.println(toProcessPath.substring(0, toProcessPath.length()-length-1));
		return toProcessPath.substring(0, toProcessPath.length()-length-1);
	}
	
}