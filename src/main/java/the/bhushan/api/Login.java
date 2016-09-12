package the.bhushan.api;

import the.bhushan.service.user.ServiceResult;
import the.bhushan.service.user.UserWebService;

public class Login {

	public String doLogin(String user, String pass) {
		UserWebService ws = new UserWebService();
		// Do the login
		ServiceResult result = ws.getUserService().login("bhushan", "bhushan");
		// Getting sid, this session id will required for all other soap
		// transactions.
		String sid = result.getMessage();
		return sid;
	}
}