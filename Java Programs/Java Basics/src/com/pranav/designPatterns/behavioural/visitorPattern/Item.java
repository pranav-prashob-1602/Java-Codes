package com.pranav.designPatterns.behavioural.visitorPattern;

public interface Item {
	int accept(ShoppingCartVisitor v);
}
