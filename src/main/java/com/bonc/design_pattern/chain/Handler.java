package com.bonc.design_pattern.chain;

/**
 * 持有下一个处理请求的对象
 */
public abstract class Handler extends AbsHandler{

	protected Handler handler;
		
	public Handler getHandler() {
		return handler;
	}
	
	/**
     * 设置下一个处理请求的对象
     */
	public void setHandler(Handler handler){
		this.handler = handler;
	}
}
