package com.cn.spring_ltest.service;

import com.cn.spring_ltest.annotion.SocketCommand;
import com.cn.spring_ltest.annotion.SocketModule;

@SocketModule(module=1)
public interface PlayerHandler {
	

	@SocketCommand(cmd = 1)
	public void getPlayer();
	
	
	@SocketCommand(cmd = 2)
	public void getPlayer2();

}
