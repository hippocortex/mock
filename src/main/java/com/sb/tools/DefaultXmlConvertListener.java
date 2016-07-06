package com.sb.tools;

import java.io.Serializable;
import java.lang.reflect.Method;

public class DefaultXmlConvertListener implements XmlConverterListener,Serializable {

	private static final long serialVersionUID = -8505546717098274292L;

	public void afterMarshal(Object source) {
	}

	public void afterUnmarshal(Object target, Object parent) {
		try {
			try {
				Method afterUnmarshal = target.getClass().getMethod( "afterUnmarshal", Object.class, Object.class );
				afterUnmarshal.invoke( target, target, parent );
			} catch (NoSuchMethodException e) {
			}
		} catch (Exception e) {
			throw new RuntimeException( e );
		}
	}

	public void beforeMarshal(Object source) {
	}

	public void beforeUnmarshal(Object target, Object parent) {
	}

}
