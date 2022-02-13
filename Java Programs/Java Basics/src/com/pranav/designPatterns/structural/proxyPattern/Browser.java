package com.pranav.designPatterns.structural.proxyPattern;

public class Browser {
	
	public static void main(String[] args) {
		WebProxy w = new WebProxy();
		try {
			w.renderPage("www.pranav.com");
			w.renderPage("www.pranav.to");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
