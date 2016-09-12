package mainPage.member.dao;

import java.util.List;

import mainPage.member.dto.MemberDTO;

public interface MemberDAO {
	public List list();
	public MemberDTO getMember(String search, String id);
	public void insertMember(MemberDTO dto);
	public void deleteMember(String id);
	public void updateMember(MemberDTO dto);
	
}
