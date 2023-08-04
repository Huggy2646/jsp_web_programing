package beans;

import java.io.Serializable;

public class CategoryBean implements Serializable {
	private String cate_cd;	// 카테고리 code
	private String cate_nm;	// 카테고리 이름
	private String sub_nm;	// 서브카테고리 이름
	private String sub_url;	// 서브카테고리 주소
	public String getCate_cd() {
		return cate_cd;
	}
	public void setCate_cd(String cate_cd) {
		this.cate_cd = cate_cd;
	}
	public String getCate_nm() {
		return cate_nm;
	}
	public void setCate_nm(String cate_nm) {
		this.cate_nm = cate_nm;
	}
	public String getSub_nm() {
		return sub_nm;
	}
	public void setSub_nm(String sub_nm) {
		this.sub_nm = sub_nm;
	}
	public String getSub_url() {
		return sub_url;
	}
	public void setSub_url(String sub_url) {
		this.sub_url = sub_url;
	}
	
}
