package mainPage.notice.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class ManagerNoticeDAOImpl implements ManagerNoticeDAO {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
