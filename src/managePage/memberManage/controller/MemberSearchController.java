package managePage.memberManage.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import mainPage.member.dao.MemberDAO;
import mainPage.member.dto.MemberDTO;

public class MemberSearchController implements Controller{
	private MemberDAO memberDAO;
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		String id = arg0.getParameter("id");
		String name = arg0.getParameter("name");
		List<MemberDTO> list = new ArrayList();
		if(id!="") {
			MemberDTO dto = memberDAO.getMember("id", id);
			list.add(dto);
		} else if(id==""){
			MemberDTO dto = memberDAO.getMember("name", name);
			list.add(dto);
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/mainPage/memberManage/memberManage_main.jsp");
		mav.addObject("list", list);
		return mav;
	}
	
	
	
}
