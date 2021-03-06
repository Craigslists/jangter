package trade.assignment.repository;

import java.util.Map;

import trade.assignment.domain.Member;
import trade.assignment.dto.LoginDTO;
import trade.assignment.dto.RelationDTO;

public interface MemberRepository {

    int insert(Member member);

    Member findByEmailAndPassword(Map<String,Object> params);

	Member authenticate(String email);

//	Member chkAuth(Member member);
	
	 int update(Member member);

	void userAuth(Member member);

	void successAuth(Member vo);
	
	void createAuthKey(String Email, String memberAuthKey) ; // 인증키 발
    
	public void naverInsertUser(LoginDTO dto) throws Exception; // 네이버 등

	public Member naverReadUser(LoginDTO dto) throws Exception; // 네이버 유저읽기( 아직 안됨)

	////profile
	public Member userRead(RelationDTO dto) throws Exception;
	
	public Member read(Integer id) throws Exception;
	
	Member checkPassWord(Map<String,Object> params) throws Exception; //비밀번호 체크
	public void updatePassword(Member vo) throws Exception; //패스워드 변경
	
	public void updatePhoto(Member vo) throws Exception; //프로필 사진 변경
	//public void updatePhoto(Member vo) throws Exception;
}
