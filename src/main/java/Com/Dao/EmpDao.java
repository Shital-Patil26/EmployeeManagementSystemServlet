package Com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import Com.bo.Emp;

public class EmpDao 
{
	public static Connection getConnection()
	{
		Connection con = null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/EMS?useSSL=false&allowPublicKeyRetrieval=true", "root", "shital@26");			
			
			
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		if(con == null)
		{
			System.out.println("connection failed");
		}
		return con;
	}
	public static int AddEmp(Emp e1)
	{
		int status = 0;
		try 
		{
			Connection con = EmpDao.getConnection();
			String sql = "insert into emp(name,email,salary,designation,address) values(?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, e1.getName());
			ps.setString(2, e1.getEmail());
			ps.setInt(3, e1.getSalary());
			ps.setString(4,e1.getDesg());
			ps.setString(5, e1.getAddress());
			
			status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
}
