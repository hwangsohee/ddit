package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.member.vo.MemberVO;

/*
 	Service 인터페이스
 */
public interface IMemberService {
	
	/*
		회원등록을 위한 메서드
	 	mv 등록할 데이터를 담고있는 MemberVO객체
	 	회원등록 작업이 성공하면 1 이상의 값이 반환되고 실패하면 0이 반환된다.
	 */
	public int registMember(MemberVO mv);
	
	/*
 	회원정보 수정을 위한 메서드
 	mv 수정할 데이터를 담고있는 MemberVO객체
 	회원 수정작업이 성공하면 1 이상의 값이 반환되고 실패하면 0이 반환된다.
 */
	public int modifyMember(MemberVO mv);

	/*
	 	주어진 회원정보가 존재하는지 확인하기위한 메서드
	 	memId 회원정보 존재여부 확인하기 위한 회원ID
	 	해당 회원정보가 존재하면 1, 존재하지 않으면 0 리턴함
	 */
	public boolean checkMember(String memId);
	
	/*
	 	회원Id를 매개변수로 받아서 해당 회원을 삭제하기 위한 메서드
	 	memId 삭제할 회원ID
	 	삭제작업 성공하면 1, 실패하면 0리턴함
	 */
	public int removeMember(String memId);
	/*
	  DB에 존재하는 모든 회원정보를 조회하기 위한 메서드
	  모든 회원정보를 담고 있는 리스트 객체
	 */
	public List<MemberVO> displayAllMember();
	
	/*
 	검색정보를 이용하여 회원정보를 검색하기 위한 메서드
 	검색하고자 하는 회원 정보를 담은 VO객체
 	검색된 회원정보를 담은 리스트 객체
 */
	public List<MemberVO> searchMember(MemberVO mv);

}

