package beans;

import java.io.Serializable;

public class RegisterBean implements Serializable {
	private int mem_id;		//회원 아이디
	private String mem_passwd; 	// 회원 비밀번호
	private String mem_name ;	// 회원 이름
	private String mem_emal ;	// 회원 이메일
	private String mem_phone ;	// 회원 전화번호
	private String mem_zipcode; // 회원 우편번호
	private String mem_address ;// 회원 주소
	private String mem_job ;	// 회원 직업
	private String mem_kind ;	// 회원 등급
	public int getMem_id() {
		return mem_id;
	}
	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_passwd() {
		return mem_passwd;
	}
	public void setMem_passwd(String mem_passwd) {
		this.mem_passwd = mem_passwd;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_emal() {
		return mem_emal;
	}
	public void setMem_emal(String mem_emal) {
		this.mem_emal = mem_emal;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	public String getMem_zipcode() {
		return mem_zipcode;
	}
	public void setMem_zipcode(String mem_zipcode) {
		this.mem_zipcode = mem_zipcode;
	}
	public String getMem_address() {
		return mem_address;
	}
	public void setMem_address(String mem_address) {
		this.mem_address = mem_address;
	}
	public String getMem_job() {
		return mem_job;
	}
	public void setMem_job(String mem_job) {
		this.mem_job = mem_job;
	}
	public String getMem_kind() {
		return mem_kind;
	}
	public void setMem_kind(String mem_kind) {
		this.mem_kind = mem_kind;
	}

}
