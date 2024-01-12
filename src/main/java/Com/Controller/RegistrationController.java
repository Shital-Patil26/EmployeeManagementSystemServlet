 package Com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Dao.EmpDao;
import Com.bo.Emp;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int salary = (Integer.parseInt(request.getParameter("salary")));
		
		String desg = request.getParameter("desg");
		String addr = request.getParameter("address");
		
		Emp e1 = new Emp(name,email,salary,desg,addr); 
		int status = EmpDao.AddEmp(e1);
		if(status > 0)
		{
			pw.write("Data successfully inserted");
		}
		else
		{
			pw.write("Something went wrong");
		}
		
		
		
	}

}
