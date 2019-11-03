package ${currentPackage}.common.entity;

import java.util.HashMap;

public class ResponseBo extends HashMap<String, Object> {

	private static final long serialVersionUID = -8713837118340960775L;

	// 成功
	private static final Integer SUCCESS = 1;
	// 警告
	private static final Integer WARN = 0;
	// 异常 失败
	private static final Integer FAIL = 500;

	private Integer code;
	private boolean flag;
	private String message;
	private Object data;

	public ResponseBo() {
		put("code", SUCCESS);
		put("flag", true);
		put("message", "操作成功");
		put("data", "");
	}

	public static ResponseBo error(Object msg) {
		ResponseBo responseBo = new ResponseBo();
		responseBo.put("code", FAIL);
		responseBo.put("flag", false);
		responseBo.put("message", msg);
		return responseBo;
	}

	public static ResponseBo warn(Object msg) {
		ResponseBo responseBo = new ResponseBo();
		responseBo.put("code", WARN);
		responseBo.put("flag", false);
		responseBo.put("message", msg);
		return responseBo;
	}

	public static ResponseBo ok(Object msg) {
		ResponseBo responseBo = new ResponseBo();
		responseBo.put("code", SUCCESS);
		responseBo.put("flag", true);
		responseBo.put("message", "");
		responseBo.put("data", msg);
		return responseBo;
	}

	public static ResponseBo ok() {
		return new ResponseBo();
	}

	public static ResponseBo error() {
		return ResponseBo.error("");
	}

	@Override
	public ResponseBo put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
