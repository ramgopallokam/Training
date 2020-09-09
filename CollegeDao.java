package com.myschool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.myschool.dbutil.DBCConnection;
import com.myschool.model.College;

public class CollegeDao {
	public String createCollege(College college){
		try //22 Some CLG 0
		{
		Connection connection=DBCConnection.getConnect();

		String sql="insert into clg values(?,?,?)";
		PreparedStatement stat=connection.prepareStatement(sql);

		stat.setInt(1, college.getcId());
		stat.setString(2, college.getcName());
		stat.setInt(3, college.getNoOfStud());

		int res= stat.executeUpdate();
		if(res>0)
		return "College Created";
		else
		return "College connot be Created";
		}
		catch (Exception e) {
		e.printStackTrace();
		return "Exception "+e;
		}


		}

		}
