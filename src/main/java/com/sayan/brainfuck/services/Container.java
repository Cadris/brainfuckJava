package com.sayan.brainfuck.services;

public class Container{
	private String line;
	private String code;
	public Container(String line, String code) {
		super();
		this.line = line;
		this.code = code;
	}
	public Container() {}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
