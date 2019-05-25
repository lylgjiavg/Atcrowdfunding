package club.lylgjiang.common.exception;

/**
 * 用户名或密码错误异常
 * @author 姜立成
 * @date:   2019年5月25日 下午2:51:25
 *
 */
public class UserOrPwdException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserOrPwdException(String message) {
		super(message);
	}
	
}
