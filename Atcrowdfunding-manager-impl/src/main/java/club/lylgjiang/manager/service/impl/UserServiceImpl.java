package club.lylgjiang.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import club.lylgjiang.bean.pojo.TUser;
import club.lylgjiang.bean.pojo.TUserExample;
import club.lylgjiang.common.util.MD5Util;
import club.lylgjiang.manager.mapper.TUserMapper;
import club.lylgjiang.manager.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TUserMapper tUserMapper;
	
	@Override
	public TUser login(TUser user) {

		// 设置查询条件:根据用户账号和密码匹配查询(密码进行加密处理)
		TUserExample example = new TUserExample();
		example.createCriteria().andLoginacctEqualTo(user.getLoginacct())
			.andUserpswdEqualTo(MD5Util.digest(user.getUserpswd()));
		
//		System.out.println(user.getUserpswd());
//		System.out.println(MD5Util.digest("123"));
//		System.out.println(MD5Util.digest(user.getUserpswd()));
		
		// 查询
		List<TUser> result = tUserMapper.selectByExample(example);
		
		// 非空验证
		if(result != null && result.size() > 0) {
			// 返回
			return result.get(0);
		}else {
			return null;
		}
	}

}
