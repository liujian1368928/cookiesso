package fd.demo2;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import fd.util.ssocheck;

public class demo2Action extends ActionSupport {
private String gotoUrl;

	 
	public String main(){
		
		HttpServletRequest request=ServletActionContext.getRequest();
		if(ssocheck.checkCookie(request)){
			return SUCCESS;
		}
		gotoUrl="/demo2/main.action";
			return LOGIN;
	}

	public String getGotoUrl() {
		return gotoUrl;
	}

	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}


	
}
