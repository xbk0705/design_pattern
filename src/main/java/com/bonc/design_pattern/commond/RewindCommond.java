package com.bonc.design_pattern.commond;

/**
 * 录音机倒带命令
 * 具体命令角色类
 * */
public class RewindCommond implements Command{

	AudioPlayer player;
	
	public RewindCommond(AudioPlayer player) {
		this.player = player;
	}

	// 调用接收对象（录音机）的 rewind() 方法
	public void execute() {
		player.rewind();
	}
	
}
