package com.softtek.frontController;

import java.io.IOException;
import java.net.http.HttpRequest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softtek.controller.LinkHandler;

@WebServlet("/")
public class SofttekFrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private LinkHandler handler = null;

	@Override
	public void init() throws ServletException {
		handler=new LinkHandler();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("NitFrontControllerServlet.doGet()::" + req.getServletPath());
		System.out.println("NitFrontControllerServlet.doGet()::" + req.getServletPath());
		System.out.println("NitFrontControllerServlet.doGet()::" + req.getServletPath());
		String lnv = null;
		if (req.getServletPath().equalsIgnoreCase("/wish")) {
			lnv = handler.showWishMessage(req);
		} else if (req.getServletPath().equalsIgnoreCase("/lang")) {
			lnv = handler.showALlMessage(req);
		} else
			lnv = "home";
		
		// view  management 
		String destpage=null;
		if(lnv.equalsIgnoreCase("wish_result"))destpage="/show_wish.jsp";
		else if(lnv.equalsIgnoreCase("all_lang"))destpage="/show_languages.jsp";
		else destpage="index.jsp";
		
		// forward the request to dest page
		RequestDispatcher rd = req.getRequestDispatcher(destpage);
		rd.forward(req, resp);
		
	}

}
