package mainPage.branchManage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.AbstractController;

import mainPage.branchManage.dao.BranchDAO;
import mainPage.branchManage.dto.BranchDTO;

public class BranchInsertController extends AbstractCommandController {
	private BranchDAO branchDAO;
	public void setBranchDAO(BranchDAO branchDAO) {
		this.branchDAO = branchDAO;
	}

	@Override
	protected ModelAndView handle(HttpServletRequest arg0, HttpServletResponse arg1, 
									Object arg2, BindException arg3)
			throws Exception {
		BranchDTO dto = (BranchDTO)arg2;
		String phone = arg0.getParameter("phone1")+"-"+arg0.getParameter("phone2")+"-"+arg0.getParameter("phone3");
		String opentime = arg0.getParameter("open1")+":"+arg0.getParameter("open2");
		String closetime = arg0.getParameter("close1")+":"+arg0.getParameter("close2");
		dto.setBranch_phone(phone);
		dto.setBranch_opentime(opentime);
		dto.setBranch_closetime(closetime);
		branchDAO.addBranch(dto);
		
		return new ModelAndView("redirect:branchManage.mainPage");
	}


}
