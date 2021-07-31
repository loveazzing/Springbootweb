package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

public interface NoticeService {

	// 페이지 요청할 떄
	List<NoticeView> getViewList(boolean pub);
	
	// 검색을 요청할 때
	List<NoticeView> getViewList(String field, String query, boolean pub);

	List<NoticeView> getViewList(int page, String field, String query, boolean pub);

	int getCount();

	int getCount(String field, String query, boolean pub);



	// 상세보기
	NoticeView getView(int id);

	// 일괄 공개를 요청할 때
	int upatePubAll(int[] pubIds, int[] closeIds);
	//int updatePubAll(int[] ids, boolean pub);
	
	// 일괄 삭제를 요청할 때
	int deleteAll(int[] ids);

	Notice getNext(int id);

	Notice getPrev(int id);

	// 페이지 수정을 요청할 때
	int update(Notice notice);

	int delete(int id);

	// 새글 등록
	int insert(Notice notice);



}
