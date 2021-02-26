package com.myemp.mymvc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository implements IMemberRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private class EmpMapper implements RowMapper<EmpVO> {
		 @Override
		 public EmpVO mapRow(ResultSet rs, int count) throws SQLException {
		 EmpVO emp = new EmpVO();
		 
		 emp.setEmpNum(rs.getInt("empnum"));
		 emp.setName(rs.getString("empname"));
		 emp.setSalary(rs.getInt("salary"));
		 return emp;
		 }
	}
	@Override
	public List<EmpVO> getAllEmp() {
		
		String sql="select * from employees";
		
		 return jdbcTemplate.query(sql,new EmpMapper());
	}

	@Override
	public EmpVO getEmp(int empNum) {
		
		String sql="select * from employees where empNum=?";
		
		
		
		
		return jdbcTemplate.queryForObject(sql, new EmpMapper(),empNum);
		
	}

	@Override
	public void insertEmp(EmpVO emp) {
		String sql="insert into employees (empName,empNum,salary)"
				+"values(?,?,?)";
		jdbcTemplate.update(sql,emp.getName(),emp.getEmpNum(),emp.getSalary());
		
	}

	@Override
	public void deleteEmp(int empNum) {
		
		String sql="delete from employees"
				+" where empNum=?";
		jdbcTemplate.update(sql,empNum);
		
	}
	
}
