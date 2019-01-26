package controller;




import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;


public class EmpCurdController extends MultiActionController {

	public ModelAndView empsave(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	
		String name= req.getParameter("name");
		String email= req.getParameter("email");
		String address= req.getParameter("address");
		
			
		Class.forName("com.mysql.jdbc.Driver");
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/ashok", "root", "ashok");

	
	
	PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into springEmp values(?,?,?,?)");
  ps.setInt(1, 0);
    ps.setString(2, name);
    ps.setString(3, email);
    ps.setString(4, address);
   int i= ps.executeUpdate();
    con.close();
   ModelAndView mav = null;
   if(i!=0)
   
       mav = new ModelAndView("success");
   
   else
       mav = new ModelAndView("fail");

    
    return mav;
	}
	
public ModelAndView empupdate(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	
	int id =Integer.parseInt(req.getParameter("id"));
	String name= req.getParameter("name");
	String email= req.getParameter("email");
	String address= req.getParameter("address");
	 Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashok","root","ashok");
	
     PreparedStatement ps = (PreparedStatement) con.prepareStatement("update springEmp set name=?,email=?,address=? where id=?");
     
     ps.setString(1, name);
     ps.setString(2, email);
     ps.setString(3, address);
     ps.setInt(4, id );
    int i= ps.executeUpdate();
    con.close();
    ModelAndView mav = null;
    if(i!=0)
    
        mav = new ModelAndView("success");
    
    else
        mav = new ModelAndView("fail");
	
     
     return mav;
	}

public ModelAndView emplogin(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	
	 String name = req.getParameter("name");
     String email = req.getParameter("email");
    
     
     
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashok","root","ashok");
	
     
     PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from springemp where name=? && email=?");
     
     ps.setString(1, name);
     ps.setString(2, email);
    ResultSet rs = (ResultSet) ps.executeQuery();
    
     ModelAndView mav = null;

    if(rs.next())

 	rs.getString(1);
	rs.getString(2);
	mav = new ModelAndView("empsum");	
     return mav;
}

public ModelAndView empsum(HttpServletRequest req, HttpServletResponse res) throws Exception {
    
    
    int num1 = Integer.parseInt(req.getParameter("num1")) ;
int num2 = Integer.parseInt(req.getParameter("num2")) ;
  
 
	int z=num1+num2;
	ModelAndView mav=new ModelAndView();
	mav.setViewName("sum");
	mav.addObject("result",z);
	return mav;
}
	
}
