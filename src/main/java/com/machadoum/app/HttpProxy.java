package com.machadoum.app;
import java.net.URI;
import java.security.InvalidParameterException;
import javax.servlet.http.HttpServletRequest;

import org.eclipse.jetty.proxy.ProxyServlet;

public class HttpProxy extends ProxyServlet {
	private static final String ERROR_MESSAGE = "The url parameter is mandatory. Ex: http://localhost:8080/?url=http://www.google.com";
	private static final long serialVersionUID = -6457038372411504005L;

	@Override
	protected URI rewriteURI(HttpServletRequest request) {
		String url = request.getParameter("url");
		
		if (url == null)
			throw new InvalidParameterException(ERROR_MESSAGE);
		
		return URI.create(url);
	}
}
