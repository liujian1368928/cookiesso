package fd.sso;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import fd.util.ssocheck;

public class ssologinAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String userpwd;
	private String gotoUrl;

	public String sso(){
		
		ssocheck ck=new ssocheck();
		boolean ok=ck.check(username, userpwd);
		if(ok){
			Cookie cookie=new Cookie("ssocookie","sso");
			cookie.setPath("/");//??
			HttpServletResponse response=ServletActionContext.getResponse();
			response.addCookie(cookie);
			return SUCCESS;
		
		}	
		return username;		
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getGotoUrl() {
		return gotoUrl;
	}

	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}


	
	
}
