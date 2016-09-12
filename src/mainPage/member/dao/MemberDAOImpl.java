package mainPage.member.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import mainPage.branchManage.dto.BranchDTO;
import mainPage.member.dto.MemberDTO;

public class MemberDAOImpl implements MemberDAO{
	
	private JdbcTemplate jdbcTemplate; 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
    	 this.jdbcTemplate=jdbcTemplate;  
	}
	class MemberRowMapper implements RowMapper{
		@Override
		public Object mapRow(ResultSet rs, int arg1) throws SQLException {
			MemberDTO dto = new MemberDTO();
			dto.setId(rs.getString("id"));
			dto.setName(rs.getString("name"));
			dto.setNickname(rs.getString("nickname"));
			dto.setBirth(rs.getString("birth"));
			dto.setBranch_id(rs.getInt("branch_id"));
			dto.setEmail(rs.getString("email"));
			dto.setFva(rs.getString("fva"));
			dto.setLose(rs.getInt("lose"));
			dto.setMember_grade(rs.getString("member_grade"));
			dto.setPasswd(rs.getString("passwd"));
			dto.setPhon(rs.getString("phon"));
			dto.setWin(rs.getInt("win"));
			return dto;
		}
	}

	@Override
	public List<MemberDTO> list() {
		String sql = "select * from member";
		RowMapper mapper = new MemberRowMapper();
		List list = jdbcTemplate.query(sql, mapper);
		return list;
	}

	@Override
	public MemberDTO getMember(String search, String searchSTR) {
		String sql = "select * from member where "+search+"=?";
		RowMapper mapper = new MemberRowMapper();
		Object[] obj = new Object[] {
			searchSTR	
		};
		
		MemberDTO dto = (MemberDTO)jdbcTemplate.queryForObject(sql, obj, mapper);
		
		return dto;
	}

	@Override
	public void insertMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		String sql="insert into member values(?,?,?,?,?,?,?,?,?,?,?,?)";
		Object obj[] = new Object[]{
		dto.getId(),dto.getName(),dto.getBirth(),dto.getPasswd(),dto.getPhon(),dto.getEmail(),dto.getNickname(),
		dto.getFva(),null,0,0,0				
		};
		jdbcTemplate.update(sql,obj);
	}

	@Override
	public void deleteMember(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
