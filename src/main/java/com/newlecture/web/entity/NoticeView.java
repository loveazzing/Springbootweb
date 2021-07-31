package com.newlecture.web.entity;

import java.util.Date;

public class NoticeView extends Notice {
	private String memberName;
	
	public NoticeView() {
		// TODO Auto-generated constructor stub
	}

	public NoticeView(int id, String title, String content, Date regdate, int hit, boolean pub, int memberId, String memberName) {
		
		//부모를 가지고 먼저 초기화한 다음
		super(id, title, content, regdate, hit, pub, memberId);

		//추가된 부분만 넣어줌
		this.memberName = memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "NoticeView [memberName=" + memberName + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ ", getContent()=" + getContent() + ", getRegdate()=" + getRegdate() + ", getHit()=" + getHit()
				+ ", isPub()=" + isPub() + ", getMemberId()=" + getMemberId() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
}
