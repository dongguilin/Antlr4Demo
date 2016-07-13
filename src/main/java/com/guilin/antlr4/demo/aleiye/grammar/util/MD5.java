package com.guilin.antlr4.demo.aleiye.grammar.util;

import java.security.MessageDigest;

public class MD5 {
	/**
	 * MD5加密
	 * @param source
	 * @return
	 */
	public static String md5(String source) {
		StringBuffer sb = new StringBuffer(32);
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] array = md.digest(source.getBytes());

			for (int i = 0; i < array.length; i++) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).toUpperCase().substring(1, 3));
			}
		} catch (Exception e) {
			return null;
		}
		return sb.toString();
	}
}
