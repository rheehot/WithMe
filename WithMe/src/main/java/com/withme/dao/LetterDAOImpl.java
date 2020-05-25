package com.withme.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.withme.vo.LetterVO;
import com.withme.vo.LetterlistVO;

@Repository
public class LetterDAOImpl implements LetterDAO{
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<LetterlistVO> letterlist(String u_id) throws Exception {
		return sqlSession.selectList("letterMapper.letterlist", u_id);
	}

	@Override
	public void write(LetterVO letterVO) throws Exception {
		sqlSession.insert("letterMapper.insertletter", letterVO);
		
	}

}