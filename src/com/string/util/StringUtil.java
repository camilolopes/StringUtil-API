package com.string.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author camilolopes
 *
 */
public  final class StringUtil {
	private StringUtil(){		
	}
	/**
	 * 
	 * @param value
	 * @return a String without character duplicated
	 */
	public static String removeDuplicateCharacter(String value) {
		if(value==null){
		throw new IllegalArgumentException("parameter cannot be null");	
		}
		String result = removeDuplicate(value);
		
		return result;
	}	
	
	public static String removeDuplicateCharIgnoreCase(String value) {
		if (value==null) {
			throw new IllegalArgumentException("parameter cannot be null");
		}		
		String result = removeDuplicate(value.toLowerCase());
		return result;
	}
	public static List<Character> getListChar(CharSequence charValue,String value){
		List<Character> listValue = new ArrayList<Character>();
		int positionIndex = 1;
		for (int i = positionIndex; i < value.length(); i++) {		
			 if(i>=positionIndex && charValue.charAt(i)!= charValue.charAt(i-positionIndex)){
				listValue.add(charValue.charAt(i));
			}
		}
		return listValue;
	}
	private static String removeDuplicate(String value){
		CharSequence charValue = value;		
		List<Character> valueRoute = getListChar(charValue,value);		
		String result = value.substring(0, 1);
		for (Character character : valueRoute) {
			result +=character.toString();
		}
		return result;
	}
}