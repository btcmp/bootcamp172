package com.training.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.dao.EmployeeDao;
import com.training.dao.EmployeeDaoImpl;
import com.training.model.Employee;

@WebServlet("/employee")
public class EmployeeController extends HttpServlet{

	EmployeeDao employeeDao = new EmployeeDaoImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(req.getParameter("submit") != null) {
			String name = req.getParameter("name").toString();
			String address = req.getParameter("address").toString();
			String contact = req.getParameter("contact").toString();
			
			Employee emp = new Employee(name, address, contact);
			employeeDao.save(emp);
		} else if(req.getParameter("idupd") != null) {
			//ambil data employee by id
			Employee emp = employeeDao.getEmployeeById(Integer.parseInt(req.getParameter("idupd")));		
			req.setAttribute("employee", emp);
		} else if(req.getParameter("submit-update") != null) {
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name").toString();
			String address = req.getParameter("address").toString();
			String contact = req.getParameter("contact").toString();
			Employee emp = new Employee();
			emp.setId(id);
			emp.setAddress(address);
			emp.setContact(contact);
			emp.setName(name);
			employeeDao.update(id, emp);
		} else if(req.getParameter("id") != null) {
			Employee employee = new Employee();
			employee.setId(Integer.parseInt(req.getParameter("id")));
			employeeDao.delete(employee);
		} 
		
		List<Employee> employees = employeeDao.getAll();
		req.setAttribute("employees", employees);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/daftar-emp.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
