package com.bonc.design_pattern.commond;

/**
 * 录音机播放命令
 * 具体命令角色类
 * */
public class PlayCommond implements Command{

	AudioPlayer player;
	
	public PlayCommond(AudioPlayer player) {
		this.player = player;
	}
	
	// 调用接收对象（录音机）的 play() 方法
	public void execute() {
		player.play();
	}

}
