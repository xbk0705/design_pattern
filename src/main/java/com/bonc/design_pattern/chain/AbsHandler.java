package com.bonc.design_pattern.chain;

/**
 * 定义请求处理接口
 * @author xiabaike
 * @date 2016年4月6日
 */
public abstract class AbsHandler {

	/**
	 * 准备工作
	 * @return void
	 */
	protected abstract void setup(String str);
	
	/**
	 * 具体请求处理
	 * @return void
	 */
	protected abstract int handler(int num);
	
}


	