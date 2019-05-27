package club.lylgjiang.common.pojo;

/**
 * 异步请求返回信息类
 * @author 姜立成
 * @date:   2019年5月27日 下午5:52:24
 *
 */
public class AjaxResult {
	
	// 请求返回信息
	private String msg;
	// 请求返回状态值
	private String status;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "AjaxResult [msg=" + msg + ", status=" + status + "]";
	}
	
}
