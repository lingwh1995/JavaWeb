package org.lanqiao.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 把商品放到购物车中
 * @author ronin
 *
 */
public class AddGoodsToCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.设置编码
		response.setContentType("text/html;charset=UTF-8");
		//2.获取商品
		String name = request.getParameter("name");
		//3.将商品添加到购物车
			//从session中获取购物车
		Map<String,Integer> map = (Map<String,Integer>)request.getSession().getAttribute("cart");
		Integer count = null;
			//判断购物车是否为空
		if(map==null){
			//为空，说明是第一次购物，此时需要创建一个购物车
			map = new HashMap<>();
			//将购物车放入session中
			request.getSession().setAttribute("cart", map);
			count= 1;
		}else{
			//购物车不为空，继续判断购物车中是否有商品
			count = map.get(name);
			if(count==null){
				//购物车中没有此商品
				count= 1;
			}else{
				//购物车中有该商品
				count++;
			}
		}
		//将商品放入到购物车中
		map.put(name, count);
		//提示信息
		PrintWriter out = response.getWriter();
		out.println(("已经将"+name+"添加到购物车中")+"<br />");
		out.println("<hr />");
		out.println("<a href='"+request.getContextPath()+"/product_list.jsp'>继续购物</a>"+"<br />");
		out.println("<a href='"+request.getContextPath()+"/cart.jsp'>查看购物车</a>"+"<br />");
		//4.从sessio中
	}

}