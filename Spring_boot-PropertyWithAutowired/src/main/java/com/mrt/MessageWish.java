package com.mrt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.val;
@Component
@Data
public class MessageWish implements CommandLineRunner {

	@Autowired
	private Message msg;
	@Value("${msg}")
	private String msge;
	@Override
	public void run(String... args) throws Exception {
		msg.setMsg("Hello Dear");
		msg.setMsgId(123);
		
	System.out.println(this);	
	}

}
