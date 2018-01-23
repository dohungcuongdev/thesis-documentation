
DateTimeCalculator {
	
	public static Date getToday()
	
	public static String getTimeToday()
	
    	public static Date getDateFormated(String strDate)
    
    	public static Date formatDateTime(String dateTime, String format)

    	public static Date formatDateTime(String dateTime)
    
    	public static Date getICTDateTime(String dateTime) 
}


EmailSender {

    public static String sendEmail(String message, String sendto, String subject)

    private static class SMTPAuthenticator extends Authenticator {

        private final PasswordAuthentication authentication;

        public SMTPAuthenticator(String login, String password)

        @Override
        protected PasswordAuthentication getPasswordAuthentication()
    }
}


FileUploader {

	// upload image
    public static String uploadImage(CommonsMultipartFile commonsMultipartFiles, HttpServletRequest request, ModelMap model, String itemType)
    
	// upload PDF
    public static void uploadPDF(CommonsMultipartFile commonsMultipartFiles, HttpServletRequest request, ModelMap model)
}

GeoLookup {

    private static LookupService lookUp;

	//get location based on external IP
    public static GeoLocation getLocation(String externalIP)
}

public class MathCalculator {
	
	//rounding decimal number
	public static double round(double value)

	//rounding decimal number
    public static double round(double value, int places)
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statics.provider;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author Do Hung Cuong
 */
public class StringUtils {

    // Array vietnamese character
    private static final char[] SOURCE_CHARACTERS

    // Array latin character
    private static final char[] DESTINATION_CHARACTERS
	
	//removeAccent of character
    public static char removeAccent(char ch)

	//removeAccent of String
    public static String removeAccent(String s)
    
    //remove accent except some special character
    public static String encode(String s)
    
    //lowercase first character of string
    public static String lowerFirstChar(String varname)

    //uppercase first character of string
    public static String upperFirstChar(String varname)
}

