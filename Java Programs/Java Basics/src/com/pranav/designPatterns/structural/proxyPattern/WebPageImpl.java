package com.pranav.designPatterns.structural.proxyPattern;

public class WebPageImpl implements WebPage{
	public void renderPage(String url) throws Exception {
		System.out.println(url + " rendered successfully");
	}
}
