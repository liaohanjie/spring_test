package com.cn.spring_ltest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 启动函数
 * @author admin
 *
 */
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println(InvokerHoler.getInvoker((short)1, (short)1));
	}

}
