package com.team.bbang.domain;

public class Criteria {

	
	//현재 페이지 번호
	private int pageNum;
	
	
	//페이지 표시 개수
	private int amount;
	
	//검색 타입
	private String type;
	
	//검색 키워드
	private String keyword;
	
	// Criteria 생성자
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	

	
	
	
	
	
	
	
}
