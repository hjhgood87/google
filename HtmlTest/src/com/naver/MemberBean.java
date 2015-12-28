package com.naver;

public class MemberBean {
	private String name;

	private String id;
	private String pw;
	private String hobby;
	private String area;
	
	
	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", id=" + id + ", pw=" + pw + ", hobby=" + hobby + ", area=" + area + "]";
	}


	public MemberBean() {
		// TODO Auto-generated constructor stub
	}


	public MemberBean(String name, String id, String pw, String hobby, String area) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.hobby = hobby;
		this.area = area;
	}


	public String getName() {
		return name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberBean other = (MemberBean) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}
}
