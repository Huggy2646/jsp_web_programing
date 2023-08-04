package beans;

import java.io.Serializable;

public class CommoncodeBean implements Serializable {
	private String kindcode;	//공통문자대분류
	private String code;		//공통코드중분류
	private String codename;	//코드명
	private String usefrom;		//사용시작일
	private String useto;		//사용종료일
	private String usecode;		//실제사용코드
	private String outputseq;	//출력seq
	private String comments;	//코드설명
	private String updateddate;	//수정일자
	private String createddate;	//작성일자
	private String updatedby;	//수정자
	private String createdby;	//작성자
	public String getKindcode() {
		return kindcode;
	}
	public void setKindcode(String kindcode) {
		this.kindcode = kindcode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodename() {
		return codename;
	}
	public void setCodename(String codename) {
		this.codename = codename;
	}
	public String getUsefrom() {
		return usefrom;
	}
	public void setUsefrom(String usefrom) {
		this.usefrom = usefrom;
	}
	public String getUseto() {
		return useto;
	}
	public void setUseto(String useto) {
		this.useto = useto;
	}
	public String getUsecode() {
		return usecode;
	}
	public void setUsecode(String usecode) {
		this.usecode = usecode;
	}
	public String getOutputseq() {
		return outputseq;
	}
	public void setOutputseq(String outputseq) {
		this.outputseq = outputseq;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(String updateddate) {
		this.updateddate = updateddate;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	
}
