package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.comm.dao.MemberDaoImpl;
import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImplWithJDBC;
import kr.or.ddit.member.vo.MemberVO;

public class MemberServiceImpl implements IMemberService {

	private IMemberDao memDao;

	private static IMemberService memService;
	
	
	private MemberServiceImpl() {
		memDao = MemberDaoImpl.getInstance();
	}

	public static IMemberService getInstance() {
		if(memService == null) {
			memService = new MemberServiceImpl();
		}
		return memService;
	}
	
	
	@Override
	public int registMember(MemberVO mv) {
		
		int cnt = memDao.insertMember(mv);
		
		return cnt;
	}

	@Override
	public int modifyMember(MemberVO mv) {
		return memDao.updateMember(mv);
	}

	@Override
	public boolean checkMember(String memId) {
		return memDao.checkMember(memId);
	}

	@Override
	public int removeMember(String memId) {
		return memDao.deleteMember(memId);
	}

	@Override
	public List<MemberVO> displayAllMember() {
		return memDao.getAllMember();
	}
	/*
 	검색정보를 이용하여 DB에 존재하는 회원정보를 조회하기 위한 메서드
 	검색하고자 하는 회원 정보를 담은 VO객체
 	검색된 회원정보를 담은 리스트 객체
 */
	public List<MemberVO> searchMember(MemberVO mv) {
		return memDao.searchMember(mv);
	}

}
