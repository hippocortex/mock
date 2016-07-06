package com.sb.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.commons.lang3.StringUtils;

/**
 * Classe utilitaire permettant le passage WLS6.1 a WLS8.1. Contient des m�thodes statiques retournant une chaine ""
 * pour tout objet null passe. Cela permet d'eviter les fields initialises a null.
 */
public class StringUtilities {

	public static final String EMPTY = "";

    public static String valueOf(boolean b) {
        return String.valueOf(b);
    }
    public static String valueOf(Boolean b) {
        return String.valueOf(b==null?Boolean.FALSE:b);
    }


    public static String valueOf(char c) {
        return String.valueOf(c);
    }


    public static String valueOf(double d) {
        return String.valueOf(d);
    }
    public static String valueOf(Double d) {
        return String.valueOf(d==null?"":d);
    }

    public static String valueOf(float f) {
        return String.valueOf(f);
    }
    public static String valueOf(Float f) {
        return String.valueOf(f==null?"":f);
    }
    

    public static String valueOf(int i) {
        return String.valueOf(i);
    }
    public static String valueOf(Integer i) {
        return String.valueOf(i==null?"":i);
    }

    public static String valueOf(long l) {
        return String.valueOf(l);
    }
    public static String valueOf(Long l) {
        return String.valueOf(l==null?"":l);
    }


    public static String valueOf(Object o) {
        return (o == null) ? "" : o.toString();
    }

    public static String valueOf(Object o, String defaultValue) {
        return (o == null) ? defaultValue : o.toString();
    }

    public static String valueOf(char[] c) {
        return (c == null) ? "" : c.toString();
    }
    
    public static boolean isTimeValide( String s ) {
    	if( StringUtils.isBlank( s ) ) 
    		return true;
    	
    	if( ( s.length() > 5 ) || ( s.indexOf( ":" ) == -1 ) ) 
    		return false;
    	
    	try {
        	int hour = Integer.parseInt( s.substring( 0, s.indexOf( ":" ) ) );
        	int min = Integer.parseInt( s.substring( s.indexOf( ":" ) +1 ) );
        	
        	if( ( hour < 0 ) || ( hour > 23 ) || ( min < 0 ) || ( min > 59 ) )
        		return false;

    	} catch( NumberFormatException e ) {
    		return false;
    	}
    	return true;
    }

	public static String getStringFromResourceFile( String fileName ) {
		return getStringFromResourceFile( fileName, null );
	}

	public static String getStringFromResourceFile( String fileName, String charsetName ) {
		InputStream is = StringUtilities.class.getResourceAsStream( fileName );
		return getStringFromResourceFile( is, charsetName );
	}

	public static String getStringFromResourceFile( InputStream is ) {
		return getStringFromResourceFile( is, null );
	}

	public static String getStringFromResourceFile( InputStream is, String charsetName ) {
		try {
			if (charsetName != null)
				return read( new InputStreamReader( is,charsetName ) );
			else
				return read( new InputStreamReader( is,"ISO-8859-1" ) );
		} catch (IOException e) {
			throw new RuntimeException( e );
		}
	}

	private static String read( InputStreamReader isr ) throws IOException {
		StringBuilder buffer = new StringBuilder();
		Reader in = new BufferedReader( isr );
		int ch;
		while ((ch = in.read()) > -1) {
			buffer.append( (char) ch );
		}
		in.close();
		return buffer.toString();
	}
}
