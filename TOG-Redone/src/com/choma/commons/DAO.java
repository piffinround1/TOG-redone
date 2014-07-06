package com.choma.commons;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.choma.commons.db.DBConnectionFactory;
import com.choma.commons.db.DBConnectionFactoryImpl;


public abstract class DAO {

	
	
	protected Connection getConnection(){
		
		DBConnectionFactory dbCon = DBConnectionFactoryImpl.getInstance();
		return dbCon.getConnection();
	}
	
	
	
	protected void closeUtils(Connection conn, PreparedStatement pstmt, ResultSet rs){
		
		try{
			if(rs != null){
				rs.close();
			}
			
			if(pstmt != null){
				pstmt.close();
			}
			
			
			if(conn != null){
				conn.close();
			}
			
		}catch(Exception p){
			//IGNORE
		}
		
		
	}
}
