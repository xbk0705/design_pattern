package com.bonc.design_pattern.commond;

/**
 * 录音机暂停命令
 * 具体命令角色类
 * */
public class StopCommond implements Command{

	AudioPlayer player;
	
	public StopCommond(AudioPlayer player) {
		this.player = player;
	}
	
	// 调用接收对象（录音机）的 stop() 方法
	public void execute() {
		player.stop();
	}

}
