package com.board.dtos;

public class HosDto {
	int seq;
	String name;
	String type;
	String address;
	String content;
	String phone;
	public HosDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HosDto(int seq, String name, String type, String address, String content, String phone) {
		super();
		this.seq = seq;
		this.name = name;
		this.type = type;
		this.address = address;
		this.content = content;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "HosDto [seq=" + seq + ", name=" + name + ", type=" + type + ", address=" + address + ", content="
				+ content + ", phone=" + phone + "]";
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
