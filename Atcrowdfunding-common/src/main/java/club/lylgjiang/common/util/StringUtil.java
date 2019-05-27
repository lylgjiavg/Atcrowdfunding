package club.lylgjiang.common.util;

/**
 * 字符串工具类(用于MD5工具类加密)
 * @author 姜立成
 * @date:   2019年5月28日 上午12:23:58
 *
 */
public class StringUtil {

	public static boolean isEmpty(String s) {
		return s == null || "".equals(s);  //     s == null | s.equals("");  //位与,逻辑与区别,非空字符串放置在前面,避免空指针
	}

	public static boolean isNotEmpty(String s) {
		return !isEmpty(s);
	}
}
