package com.rohith.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.rohith.product.bo.ProductBO;
import com.rohith.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailServlet
 */
public class DisplayProductDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());
		ProductBO bo = (ProductBO) context.getBean("productbo");
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		PrintWriter out = response.getWriter();
		out.print("product details");
		out.print("Product id:" + product.getId());
		out.print("Product name:" + product.getName());
		out.print("Product descritpion:" + product.getDescription());
		out.print("Product price:" + product.getPrice());

	}

}
