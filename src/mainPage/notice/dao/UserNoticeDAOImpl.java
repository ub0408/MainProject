package mainPage.notice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import mainPage.notice.dto.UserNoticeDTO;

public class UserNoticeDAOImpl implements UserNoticeDAO {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<UserNoticeDTO> list() {
		String sql = "select * from user_notice order by num desc";
		RowMapper mapper = new RowMapper(){
			@Override
			public Object mapRow(ResultSet arg0, int arg1) throws SQLException {
				UserNoticeDTO dto = new UserNoticeDTO();
				dto.setNum(arg0.getInt("num"));
				dto.setSubject(arg0.getString("subject"));
				dto.setWriter(arg0.getString("writer"));
				dto.setReg_date(arg0.getString("reg_date"));
				dto.setContent(arg0.getString("content"));
				return dto;
			}
		};
		List list = jdbcTemplate.query(sql, mapper);
		return list;
	}
}



