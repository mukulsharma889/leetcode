import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.*;
import javax.servlet.*;
public class MukulServlet extends HttpServlet
 {
    public void service (HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter pout = res.getWriter();
        String rollno = req.getParameter("roll");
	RequestDispatcher rd = req.getRequestDispatcher("startaman");
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Mukul"); 
            PreparedStatement stmt=con.prepareStatement("select * from student where rollno = ?"); 
            stmt.setInt(1, Integer.parseInt(rollno));
            ResultSet rs=stmt.executeQuery();  
	    req.setAttribute("name","mangal pandey");
            while(rs.next())  
	    pout.println("<html><head><title>Database connectivity</title><style>table {width=100%;border:1px solid black;}</style></head></body><table ><tr><th>Rollno</th><th>Name</th><th>status</th></tr><tr><td>"+ rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr></table></body></html>");
	    rd.forward(req,res);
            //pout.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            // else
            // pout.println("result doesn't exist");
            con.close();  
  
            }catch(Exception e){ pout.println(e);}  
  
    }  
}  
