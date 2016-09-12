package mainPage.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import mainPage.member.dao.MemberDAO;
import mainPage.member.dto.MemberDTO;

public class MemberInsertController extends AbstractCommandController {
	private MemberDAO memberDAO;
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	protected ModelAndView handle(HttpServletRequest req, HttpServletResponse arg1, Object arg2, BindException arg3)
			throws Exception {
		// TODO Auto-generated method stub
		String month=req.getParameter("month");
		String year = req.getParameter("year");
		String date= req.getParameter("date");
		String email1 = req.getParameter("email1");
		String email2 = req.getParameter("email2");
		String pho1 =req.getParameter("pho1");
		String pho2= req.getParameter("pho2");
		String pho3 = req.getParameter("pho3");
		MemberDTO dto =(MemberDTO)arg2;
		dto.setBirth(year+"-"+month+"-"+date);
		dto.setEmail(email1+"@"+email2);
		dto.setPhon(pho1+"-"+pho2+"-"+pho3);
		memberDAO.insertMember(dto);
		return new ModelAndView("escapeMasterHomePage.jsp");
	}

}
