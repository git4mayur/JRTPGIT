package com.mrt;

import org.springframework.stereotype.Component;

@Component
public class Message {

	private String msg;
	private int msgId;
	
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getMsgId() {
		return msgId;
	}
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}
	@Override
	public String toString() {
		return "Message [msg=" + msg + ", msgId=" + msgId + "]";
	}
	
	
}
