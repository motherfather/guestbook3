package com.bit2016.guestbook.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2016.guestbook.dao.GuestBookDao;
import com.bit2016.guestbook.vo.GuestBookVo;
import com.bit2016.web.Action;
import com.bit2016.web.util.WebUtil;

public class ListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GuestBookDao dao = new GuestBookDao();
		List<GuestBookVo> list = dao.getList();
		
		request.setAttribute("list", list);
		
		WebUtil.forward(request, response, "/WEB-INF/views/index.jsp");
	}

}
