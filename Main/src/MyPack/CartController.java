package MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


public class CartController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String na=request.getParameter("name");
		String pr=request.getParameter("price");
		System.out.println(na);
		System.out.println(pr);
		HttpSession session=request.getSession();
//		session.setAttribute("product", na);
//        session.setAttribute("price", pr);
        addItemToCart(request,na,Integer.parseInt(pr));
        response.sendRedirect("welcome.jsp");
        
        
	
}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("nside get");
		HashMap<String, Integer> allItems = getAllItemsInList(request);
		request.setAttribute("cart",allItems);
		request.getRequestDispatcher("checkout.jsp").forward(request, response);
		
		
	
}
	
private HashMap<String, Integer> getAllItemsInList(HttpServletRequest request) {
	HttpSession session=request.getSession();
	return (HashMap<String, Integer>) session.getAttribute("ItemList");
}
	
private void addItemToCart(HttpServletRequest request,String itemName, int itemCost) {
	HttpSession session=request.getSession();
	//HashMap<String,Integer> itemList = new HashMap<String,Integer>();
	HashMap<String,Integer> itemList;
	itemList = (HashMap<String, Integer>) session.getAttribute("ItemList");
	
	//int value=(Integer)session.getAttribute("total");
	//String del=request.getParameter("del");
	
	
			
	 if (itemList == null) {
		itemList = new HashMap<String,Integer>();
		itemList.put(itemName, itemCost);
	}
	else {
		itemList.put(itemName, itemCost);
	}
	
	
	
	session.setAttribute("ItemList", itemList);
	 
	//float total=0.0f;
    //total+=itemCost; 
  
    //request.setAttribute("total", "value");
    //request.getRequestDispatcher("checkout.jsp");
	 
	}
}