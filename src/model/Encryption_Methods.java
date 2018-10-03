package model;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Encryption_Methods {
	
	public static String EncryptAndEncode(String input)  
    {  
	  String returnValue = "";
        try {  
        for (int i=0;i<input.length();i++)  
        {  
            char ch=Character.toLowerCase(input.charAt(i));  

            switch (ch)  
            {  
                case 'a':  
                	returnValue=returnValue+"_";  
                    break;  
                case 'b':  
                    returnValue=returnValue+"-";  
                    break;  
                case 'c':  
                    returnValue=returnValue+"~";  
                    break;  
                case 'd':  
                    returnValue=returnValue+"t";  
                    break;  
                case 'e':  
                    returnValue=returnValue+"a";  
                    break;  
                case 'f':  
                    returnValue=returnValue+"f";  
                    break;  
                case 'g':  
                    returnValue=returnValue+"s";  
                    break;  
                case 'h':  
                    returnValue=returnValue+"d";  
                    break;  
                case 'i':  
                    returnValue=returnValue+"g";  
                    break;  
                case 'j':  
                    returnValue=returnValue+"c";  
                    break;  
                case 'k':  
                    returnValue=returnValue+"x";  
                    break;  
                case 'l':  
                    returnValue=returnValue+"j";  
                    break;  
                case 'm':  
                    returnValue=returnValue+"n";  
                    break;  
                case 'n':  
                    returnValue=returnValue+"v";  
                    break;  
                case 'o':  
                    returnValue=returnValue+"p";  
                    break;  
                case 'p':  
                    returnValue=returnValue+"o";  
                    break;  
                case 'q':  
                    returnValue=returnValue+"m";  
                    break;  
                case 'r':  
                    returnValue=returnValue+"9";  
                    break;  
                case 's' :  
                    returnValue=returnValue+"i";  
                    break;  
                case 't':  
                    returnValue=returnValue+"2";  
                    break;  
                case 'u':  
                    returnValue=returnValue+"1";  
                    break;  
                case 'v' :  
                    returnValue=returnValue+"5";  
                    break;  
                case 'w':  
                    returnValue=returnValue+"4";  
                    break;  
                case 'x' :  
                    returnValue=returnValue+"3";  
                    break;  
                case 'y':  
                    returnValue=returnValue+"8";  
                    break;  
                case 'z' :  
                    returnValue=returnValue+"6";  
                    break;    
                case '1':  
                    returnValue=returnValue+"7";  
                    break;  
                case '2':  
                    returnValue=returnValue+"k";  
                    break;  
                case '3':  
                    returnValue=returnValue+"b";  
                    break;  
                case '4':  
                    returnValue = returnValue+"e";  
                    break;  
                case '5':  
                    returnValue = returnValue+"q";  
                    break;  
                case '6':  
                    returnValue = returnValue+"h";  
                    break;  
                case '7':  
                    returnValue = returnValue+"u";  
                    break;  
                case '8' :  
                    returnValue= returnValue+"y";  
                    break;  
                case '9':  
                    returnValue = returnValue+"w";  
                    break;  
                case '0':  
                    returnValue = returnValue+"z";  
                    break;
                case '@':
                	returnValue = returnValue+",";
                	break;
                case '.':
                	returnValue = returnValue+"%";
                	break;
                 default:  
                    returnValue=returnValue+"0";  
                    break;  
            }  
        }  
        }  
        catch(Exception ioe)  
        {  
            ioe.printStackTrace();  
        }  
        
        
        try {
			returnValue = URLEncoder.encode(returnValue, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return returnValue;
    }  
	
	public static String DecryptAndDecode(String token) {
		String returnValue="";  
        try {    
        for (int i=0;i<token.length();i++)  
        {  
            char ch=Character.toLowerCase(token.charAt(i));
            switch (ch)  
            {  
                case '_':  
               	 returnValue=returnValue+"a";  
                    break;  
                case '-':  
                    returnValue=returnValue+"b";  
                    break;  
                case '~':  
                    returnValue=returnValue+"c";  
                    break;  
                case 't':  
                    returnValue=returnValue+"d";  
                    break;  
                case 'a':  
                    returnValue=returnValue+"e";  
                    break;  
                case 'f':  
                    returnValue=returnValue+"f";  
                    break;  
                case 's':  
                    returnValue=returnValue+"g";  
                    break;  
                case 'd':  
                    returnValue=returnValue+"h";  
                    break;  
                case 'g':  
                    returnValue=returnValue+"i";  
                    break;  
                case 'c':  
                    returnValue=returnValue+"j";  
                    break;  
                case 'x':  
                    returnValue=returnValue+"k";  
                    break;  
                case 'j':  
                    returnValue=returnValue+"l";  
                    break;  
                case 'n':  
                    returnValue=returnValue+"m";  
                    break;  
                case 'v':  
                    returnValue=returnValue+"n";  
                    break;  
                case 'p':  
                    returnValue=returnValue+"o";  
                    break;  
                case 'o':  
                    returnValue=returnValue+"p";  
                    break;  
                case 'm':  
                    returnValue=returnValue+"q";  
                    break;  
                case '9':  
                    returnValue=returnValue+"r";  
                    break;  
                case 'i' :  
                    returnValue=returnValue+"s";  
                    break;  
                case '2':  
                    returnValue=returnValue+"t";  
                    break;  
                case '1':  
                    returnValue=returnValue+"u";  
                    break;  
                case '5' :  
                    returnValue=returnValue+"v";  
                    break;  
                case '4':  
                    returnValue=returnValue+"w";  
                    break;  
                case '3' :  
                    returnValue=returnValue+"x";  
                    break;  
                case '8':  
                    returnValue=returnValue+"y";  
                    break;  
                case '6' :  
                    returnValue=returnValue+"z";  
                    break;
                
                    
                case '7':  
                    returnValue=returnValue+"1";  
                    break;  
                case 'k':  
                    returnValue=returnValue+"2";  
                    break;  
                case 'b':  
                    returnValue=returnValue+"3";  
                    break;  
                case 'e':  
                    returnValue = returnValue+"4";  
                    break;  
                case 'q':  
                    returnValue = returnValue+"5";  
                    break;  
                case 'h':  
                    returnValue = returnValue+"6";  
                    break;  
                case 'u':  
                    returnValue = returnValue+"7";  
                    break;  
                case 'y' :  
                    returnValue= returnValue+"8";  
                    break;  
                case 'w':  
                    returnValue = returnValue+"9";  
                    break;
                    
                case '0':  
                    returnValue = returnValue+"z";  
                    break;
                case ',':
               	 returnValue = returnValue+"@";
                case '%':
                	returnValue = returnValue+".";
                	break;
                 default:  
                    returnValue=returnValue+"0";  
                    break;  
            }  
        }  
        }  
        catch(Exception ioe)  
        {  
            ioe.printStackTrace();  
        }  
        
        try {
			returnValue = URLDecoder.decode(returnValue, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return returnValue;
	}
}