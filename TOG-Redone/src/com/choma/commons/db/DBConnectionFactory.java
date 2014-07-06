package com.choma.commons.db;

import java.sql.Connection;



public abstract class DBConnectionFactory {

	

	public static enum DbUsage{
		MSSQL,MYSQL
	}
	private static final DbUsage dbUsed = DbUsage.MYSQL;
	
	public static DBConnectionFactoryImpl getInstance(){
	        String driver,url,username,password;
	       
	    
	    
	        driver= "com.mysql.jdbc.Driver";
	        url = "jdbc:mysql://localhost:3306/tog";
	        username = "root";
	        password = "pass";
	    
	    /*
	        driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	        url = "jdbc:odbc:honda_pr;";
	        username = "";
	        password = "";
	    */
	        return new DBConnectionFactoryImpl(driver,url,username,password);
	    
	    }

	    public abstract Connection getConnection();

	    public DbUsage getDbUsed(){
	    	return dbUsed;
	    }
	
	
}
