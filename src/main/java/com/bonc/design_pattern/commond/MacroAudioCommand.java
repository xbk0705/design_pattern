package com.bonc.design_pattern.commond;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的宏命令，对存储的若干命令进行操作
 * */
public class MacroAudioCommand implements MacroCommand{
	
	// 宏命令集合
	private List<Command> cmdList = new ArrayList<Command>();
	
	// 一次性执行宏命令集合中的各命令
	public void execute() {
		System.out.println("-------自动回放保存的命令-------");
		for(Command cmd : cmdList)  {
			cmd.execute();
		}
		System.out.println("------------回放完毕------------");
	}

	public void add(Command cmd) {
		cmdList.add(cmd);
	}

	public void remove(Command cmd) {
		cmdList.remove(cmd);
	}

}
