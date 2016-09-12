package mainPage.branchManage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import mainPage.branchManage.dao.BranchDAO;

public class BranchManageController implements Controller{
	private BranchDAO branchDAO;
	public void setBranchDAO(BranchDAO branchDAO) {
		this.branchDAO = branchDAO;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		List list = branchDAO.list();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WEB-INF/mainPage/branchManage/branchManage_main.jsp");
		mav.addObject("list", list);
		return mav;
	}

}
