
DateTimeCalculator {
	
 + Date getToday() <<static>>
	
 + String getTimeToday() <<static>>
	
 + Date getDateFormated(String strDate) <<static>>
    
 + Date formatDateTime(String dateTime, String format) <<static>>

 + Date formatDateTime(String dateTime) <<static>>
    
 + Date getICTDateTime(String dateTime) <<static>> 
}


EmailSender {

 + String sendEmail(String message, String sendto, String subject) <<static>>

 - <<static>> class SMTPAuthenticator extends Authenticator { 

        - final PasswordAuthentication authentication;

		+ SMTPAuthenticator(String login, String password): 

        @Override
		# PasswordAuthentication getPasswordAuthentication()
    }
}


FileUploader {

	// upload image
 + uploadImage(CommonsMultipartFile commonsMultipartFiles, HttpServletRequest request, ModelMap model, String itemType): String <<static>>
    
	// upload PDF
 + uploadPDF(CommonsMultipartFile commonsMultipartFiles, HttpServletRequest request, ModelMap model): void <<static>>
}

GeoLookup {

 - lookUp: LookupService <<static>>

	//get location based on external IP
 + getLocation(String externalIP): GeoLocation <<static>>
}

public class MathCalculator {
	
	//rounding decimal number
 + round(double value): double <<static>>

	//rounding decimal number
 + round(double value, int places): double <<static>>
}

public class StringUtils {

    // Array vietnamese character
 - SOURCE_CHARACTERS: char[] <<static>> <<final>>

    // Array latin character
 - DESTINATION_CHARACTERS: char[] <<static>> <<final>>
	
	//removeAccent of character
 + removeAccent(char ch): char <<static>>

	//removeAccent of String
 + removeAccent(String s): String <<static>>
    
    //remove accent except some special character
 + encode(String s): String <<static>>
    
    //lowercase first character of string
 + lowerFirstChar(String varname): String <<static>>

    //uppercase first character of string
 + upperFirstChar(String varname): String <<static>>
}

