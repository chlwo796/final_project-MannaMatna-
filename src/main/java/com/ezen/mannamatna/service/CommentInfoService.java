package com.ezen.mannamatna.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.mannamatna.mapper.CommentInfoMapper;
import com.ezen.mannamatna.mapper.UserInfoMapper;
import com.ezen.mannamatna.vo.CommentInfoVO;
import com.ezen.mannamatna.vo.UserInfoVO;

@Service
public class CommentInfoService {
	
	@Autowired
	CommentInfoMapper commentInfoMapper;
	
	@Autowired
	UserInfoMapper userInfoMapper;
	
	public List<CommentInfoVO> getCommentInfos(int biNum){
		return commentInfoMapper.selectCommentInfos(biNum);
	}
	
//	public List<CommentInfoVO> getCommentInfos(CommentInfoVO commentInfoVO){
//		// 테스트용 
//		return commentInfoMapper.selectCommentInfos(commentInfoVO);
//	}
	
	public int insertCommentInfo(CommentInfoVO commetInfoVO) {
		return commentInfoMapper.insertCommentInfo(commetInfoVO);
	}
}
