package com.training.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.training.dbutils.DbConnection;
import com.training.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	DbConnection conn = new DbConnection();
	
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "insert into employee(name, address, contact) values (?,?,?)";
		try {
			PreparedStatement ps = conn.getConnection().prepareStatement(sql);
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getAddress());
			ps.setString(3, employee.getContact());
			
			//execute
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int oldId, Employee employee) {
		// TODO Auto-generated method stub
		String sql = "update employee set name = ?, address = ?, contact = ? where id = ?";
		
		try {
			PreparedStatement ps = conn.getConnection().prepareStatement(sql);
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getAddress());
			ps.setString(3, employee.getContact());
			ps.setInt(4, employee.getId());
			//execute
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "delete from employee where id = ?";
		try {
			PreparedStatement ps = conn.getConnection().prepareStatement(sql);
			ps.setInt(1, employee.getId());
			//execute
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		String sql = "select * from employee";
		ResultSet rs = null;
		PreparedStatement ps = null;
		List<Employee> employees = new ArrayList<>();
		try {
			ps = conn.getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
		String name = rs.getString("name").toString();
		String address = rs.getString("address").toString();
		String contact = rs.getString("contact").toString();		
		Employee emp = new Employee(name, address, contact);
		emp.setId(Integer.parseInt(rs.getString("id")));
		
		employees.add(emp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from employee where id = ?";
		ResultSet rs = null;
		Employee emp = null;
		try {
			PreparedStatement ps = conn.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			//execute
			rs = ps.executeQuery();
			while(rs.next()) {
				emp = new Employee(rs.getString("name"), 
											rs.getString("address"), rs.getString("contact"));
				emp.setId(rs.getInt("id"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

}
