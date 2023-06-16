package org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("studentName");
	//studentEmail:<input type="text" placeholder="Enter Your Email" name="studentEmail">
	//studentPh:
String mail=req.getParameter("studentEmail");
PrintWriter printWriter=resp.getWriter();

printWriter.print("Data Sucessfully Inserted");
printWriter.print(name);

}
}
