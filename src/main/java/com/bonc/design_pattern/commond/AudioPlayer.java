package com.bonc.design_pattern.commond;

/**
 * 录音机--命令接受者
 * */
public class AudioPlayer {
	
	public void play() {
		System.out.println("播放......");
	}

	public void stop() {
		System.out.println("暂停......");
	}
	
	public void rewind() {
		System.out.println("倒带......");
	}
}
