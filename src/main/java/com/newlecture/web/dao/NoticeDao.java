package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

//@Mapper mybatis와 너무 연결이 강하다. 직접 구현하는 걸로 하자.
public interface NoticeDao {

	// @Result(property = "memberName", column = "member_name")
//	@Select("select * from noticeview "
//			+ "where ${field} like '%${query}%' "
//			+ "order by regdate desc "
//			+ "limit #{offset}, #{size}")
	List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub);

	NoticeView getView(int id);

	int getCount(String field, String query, boolean pub);

	Notice getNext(int id);

	Notice getPrev(int id);

	int update(Notice notice);

	int delete(int id);

	int insert(Notice notice);
	
	
	int deleteAll(int[] ids);
	int updataPubAll(int[] pubIds, int[] closeIds);
	int updatePUbAll(int[] ids, boolean pub);
	
	

}
