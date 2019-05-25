package club.lylgjiang.manager.service;

import club.lylgjiang.bean.pojo.TUser;

/**
 * 用户服务类
 * @author 姜立成
 * @date:   2019年5月25日 下午2:19:19
 *
 */
public interface UserService {

	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	TUser login(TUser user);

}
