package mainPage.notice.userNotice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import mainPage.notice.dao.UserNoticeDAO;

public class UserNoticeController implements Controller {
	private UserNoticeDAO userNoticeDAO;
	public void setUserNoticeDAO(UserNoticeDAO userNoticeDAO) {
		this.userNoticeDAO = userNoticeDAO;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		List list = userNoticeDAO.list();

		ModelAndView mav = new ModelAndView();
		mav.setViewName("WEB-INF/mainPage/notice/userNotice/userNotice_list.jsp");
		mav.addObject("list", list);
		return mav;
	}

}
