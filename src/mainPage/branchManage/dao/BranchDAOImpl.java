package mainPage.branchManage.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import mainPage.branchManage.dto.BranchDTO;

public class BranchDAOImpl implements BranchDAO{
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	class BranchRowMapper implements RowMapper{
		@Override
		public Object mapRow(ResultSet arg0, int arg1) throws SQLException {
			BranchDTO dto = new BranchDTO();
			dto.setBranch_id(arg0.getInt("branch_id"));
			dto.setBranch_picture1(arg0.getString("branch_picture1"));
			dto.setBranch_picture2(arg0.getString("branch_picture2"));
			dto.setBranch_picture3(arg0.getString("branch_picture3"));
			dto.setBranch_map(arg0.getString("branch_map"));
			dto.setBranch_name(arg0.getString("branch_name"));
			dto.setBranch_address(arg0.getString("branch_address"));
			dto.setBranch_phone(arg0.getString("branch_phone"));
			dto.setBranch_reserve(arg0.getString("branch_reserve"));
			dto.setBranch_opentime(arg0.getString("branch_opentime"));
			dto.setBranch_closetime(arg0.getString("branch_closetime"));
			return dto;
		}
	}
	@Override
	public List<BranchDTO> list() {
		String sql = "select * from branch order by branch_id desc";
		RowMapper mapper = new BranchRowMapper();
		List list = jdbcTemplate.query(sql, mapper);
		return list;
	}
	@Override
	public BranchDTO getBranch(Integer branch_id) {
		String sql = "select * from branch where branch_id="+branch_id;
		RowMapper mapper = new BranchRowMapper();
		return (BranchDTO)jdbcTemplate.query(sql, mapper).get(0);
	}
	@Override
	public void addBranch(BranchDTO dto) {
		// TODO Auto-generated method stub
		String sql = "insert into branch values(branch_seq.nextval,?,?,?,?,?,?,?,?,?,?)";
		Object[] obj = new Object[] {
				null, null, null, null, dto.getBranch_name(), dto.getBranch_address(),
				dto.getBranch_phone(), "false", dto.getBranch_opentime(), dto.getBranch_closetime()
		};
		jdbcTemplate.update(sql, obj);
	}
	
	
}
