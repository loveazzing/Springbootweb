package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;

	@Override
	public List<NoticeView> getViewList(boolean pub) {
		// TODO Auto-generated method stub
		return getViewList(1, "title", "", pub);
	}

	@Override
	public List<NoticeView> getViewList(String field, String query, boolean pub) {
		// TODO Auto-generated method stub
		return getViewList(1, field, query, pub);
	}

	@Override
	public List<NoticeView> getViewList(int page, String field, String query, boolean pub) {

		int pageSize = 10;
		int offset = pageSize * (page - 1);

		List<NoticeView> list = noticeDao.getViewList(offset, pageSize, field, query, pub);
		return list;
	}

	@Override
	public int getCount() {
//		System.out.println(noticeDao.getCount("title", "", false));
		return noticeDao.getCount("title", "", true);
	}

	@Override
	public int getCount(String field, String query, boolean pub) {
		// TODO Auto-generated method stub
		return noticeDao.getCount(field, query, pub);
	}

	@Override
	public NoticeView getView(int id) {
		return noticeDao.getView(id);
	}

	@Override
	public Notice getNext(int id) {
		return noticeDao.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		return noticeDao.getPrev(id);
	}

	
	@Override
	public int upatePubAll(int[] pubIds, int[] closeIds) {
		
		int result = 0;
		result += noticeDao.updatePUbAll(pubIds, true);
		result += noticeDao.updatePUbAll(closeIds, false);
		
		return result;
	}

	@Override
	public int deleteAll(int[] ids) {
		return noticeDao.deleteAll(ids);
	}

	@Override
	public int update(Notice notice) {
		return noticeDao.update(notice);
	}

	@Override
	public int delete(int id) {
		return noticeDao.delete(id);
	}

	@Override
	public int insert(Notice notice) {
		return noticeDao.insert(notice);
	}



}
