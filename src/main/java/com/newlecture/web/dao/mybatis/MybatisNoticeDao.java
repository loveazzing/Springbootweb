package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Repository
public class MybatisNoticeDao implements NoticeDao{

	private NoticeDao mapper;
	
	@Autowired
	public MybatisNoticeDao(SqlSession sqlSession) {
		//반복되는 sqlSession을 생성자에 Injection한다.
		mapper = sqlSession.getMapper(NoticeDao.class);
	}
	
	@Override
	public List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub) {
		// sqlsession을 통해, Mapper 객체를 얻고, noticeDao의 클래스 정보를 주면서, 이것의 구현체를 꺼내달라.
		
		return mapper.getViewList(offset, size, field, query, pub);
	}

	@Override
	public NoticeView getView(int id) {
		// TODO Auto-generated method stub
		return mapper.getView(id);
	}

	@Override
	public int getCount(String field, String query, boolean pub) {
		// TODO Auto-generated method stub
		return mapper.getCount(field, query, pub);
	}

	@Override
	public Notice getNext(int id) {
		// TODO Auto-generated method stub
		return mapper.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		// TODO Auto-generated method stub
		return mapper.getPrev(id);
	}

	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return mapper.update(notice);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return mapper.delete(id);
	}

	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		return mapper.insert(notice);
	}

	@Override
	public int deleteAll(int[] ids) {
		// TODO Auto-generated method stub
		return mapper.deleteAll(ids);
	}

	@Override
	public int updataPubAll(int[] pubIds, int[] closeIds) {
		int result = 0;
		result += mapper.updatePUbAll(pubIds, false);
		result += mapper.updatePUbAll(closeIds, true);
		return result;
	}

	@Override
	public int updatePUbAll(int[] ids, boolean pub) {
		// TODO Auto-generated method stub
		return mapper.updatePUbAll(ids, pub);
	}

}
