package mainPage.memberManage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import mainPage.member.dao.MemberDAO;
import mainPage.member.dto.MemberDTO;

public class MemberManageController implements Controller{
	private MemberDAO memberDAO;
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		List list = memberDAO.list();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/mainPage/memberManage/memberManage_main.jsp");
		mav.addObject("list", list);
		return mav;
	}
	
	
}
