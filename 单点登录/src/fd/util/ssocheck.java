package fd.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class ssocheck {
  public static final String USERNAME="1236";
  public static final String POSSWORD="1236";
  public boolean check(String username,String password){
	  if(username.equals(USERNAME)&&password.equals(POSSWORD)){
		  return true;
	  }
	    
	return false;  
  }
  
  
  public static boolean checkCookie(HttpServletRequest request){//cookie–£—È
	  Cookie[] cookies=request.getCookies();
	  if(cookies!=null){
		  for(Cookie cookie:cookies){
			  if(cookie.getName().equals("ssocookie")&&cookie.getValue().equals("sso")){
				  return true;
			  }
		  }
	
	  }
	return false;
	  
  }
}
