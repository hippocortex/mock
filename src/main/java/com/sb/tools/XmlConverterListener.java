package com.sb.tools;

public interface XmlConverterListener {
	void beforeMarshal(Object source);
	
	void afterMarshal(Object source);
	
	void beforeUnmarshal(Object target, Object parent);
	
	void afterUnmarshal(Object target, Object parent);
}
