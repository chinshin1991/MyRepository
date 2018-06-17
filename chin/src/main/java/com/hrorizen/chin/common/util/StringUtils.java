package com.hrorizen.chin.common.util;

/**
 * @author chenxin
 * 字符通过用处理类
 */
public class StringUtils {

	/**
	 * 判断字符串是否为空
	 * @param str 待判定字符串
	 * @return true 字符串为空  false 字符串不为空
	 */
	public static boolean isNull(String str) throws Exception{
		if( str == null || "".equals(str )) return true;
		return false;
	}
}
