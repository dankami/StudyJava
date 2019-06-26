package com.kami.ejb.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.kami.ejb.HelloWorld;

@Stateless
@Remote(HelloWorld.class)
public class HelloWorldBean implements HelloWorld {

	
	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return name + "说：你好，世界";
	}

}
