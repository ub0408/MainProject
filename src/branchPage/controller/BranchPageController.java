package branchPage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import mainPage.branchManage.dao.BranchDAO;
import mainPage.branchManage.dto.BranchDTO;

public class BranchPageController implements Controller{ 
	private BranchDAO branchDAO;
	public void setBranchDAO(BranchDAO branchDAO) {
		this.branchDAO = branchDAO;
	}
	@Override 
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		Integer branch_id = Integer.parseInt(arg0.getParameter("branch_id"));
		BranchDTO dto = branchDAO.getBranch(branch_id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WEB-INF/branchPage/branchPage_main.jsp");
		mav.addObject("dto", dto);
		return mav;
	}

}