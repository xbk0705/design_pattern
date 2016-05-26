package com.bonc.design_pattern.commond;

/**
 * 键盘类
 * 请求者角色
 * */
public class Keypad {
	
	private Command play;
	private Command stop;
	private Command rewind;
	
	public void setPlayCommond(Command play) {
		this.play = play;
	}

	public void setStopCommond(Command stop) {
		this.stop = stop;
	}
	
	public void setRewindCommond(Command rewind) {
		this.rewind = rewind;
	}
	
	// 执行播放方法
	public void play() {
		play.execute();
	}
	
	// 执行暂停方法
	public void stop() {
		stop.execute();
	}
	
	// 执行倒带方法
	public void rewind() {
		rewind.execute();
	}
}
