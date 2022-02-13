package com.pranav.designPatterns.structural.proxyPattern;

public class WebProxy implements WebPage {
	private WebPage w;
	
	WebProxy() {
		w=new WebPageImpl();
	}
	
	public void renderPage(String url) throws Exception {
		if(url.contains(".to")) {
			throw new Exception("Not Permissible by ISP");
		}else {
			w.renderPage(url);
		}
	}
}
