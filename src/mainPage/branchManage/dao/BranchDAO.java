package mainPage.branchManage.dao;

import java.util.List;

import mainPage.branchManage.dto.BranchDTO;

public interface BranchDAO {
	public List<BranchDTO> list();
	public BranchDTO getBranch(Integer branch_id);
	public void addBranch(BranchDTO dto);
}
