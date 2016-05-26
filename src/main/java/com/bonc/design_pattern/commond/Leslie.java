package com.bonc.design_pattern.commond;

/**
 * 具体人--莱斯利
 * 客户端角色
 * */
public class Leslie {

	public static void main(String[] args) {
		
//		// 创建接受者对象，即收音机对象
//		AudioPlayer player = new AudioPlayer();
//		// 创建命令者对象
//		Command play = new PlayCommond(player);
//		Command stop = new StopCommond(player);
//		Command rewind = new RewindCommond(player);
//		// 创建请求者对象，即键盘对象
//		Keypad keypad = new Keypad();
//		keypad.setPlayCommond(play);
//        keypad.setStopCommond(stop);
//        keypad.setRewindCommond(rewind);
//        
//        // 播放
//        keypad.play();
//        // 暂停
//        keypad.stop();
//        // 倒带
//        keypad.rewind();
		
		// 创建接受者对象，即收音机对象
		AudioPlayer player = new AudioPlayer();
		// 创建命令者对象
		Command play = new PlayCommond(player);
		Command stop = new StopCommond(player);
		Command rewind = new RewindCommond(player);
		
		MacroCommand macro = new MacroAudioCommand();
		macro.add(play);
		macro.add(rewind);
		macro.add(stop);
		macro.execute();
	}
}
