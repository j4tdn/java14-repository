package funtional;

import bean.Apple;

@FunctionalInterface
public interface ApplePredicate {
	boolean test(Apple apple);
}
