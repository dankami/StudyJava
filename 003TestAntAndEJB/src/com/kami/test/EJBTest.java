package com.kami.test;

import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.kami.ejb.HelloWorld;

public class EJBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		props.setProperty("java.naming.provider.url", "localhost:1099");
		InitialContext ctx;
		try {
			ctx = new InitialContext(props);
			HelloWorld helloworld = (HelloWorld) ctx.lookup("HelloWorldBean/remote");
			System.out.println(helloworld.sayHello("广州"));
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
