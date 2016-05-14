
/**
 * ActivitiesServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.example.www.activitiesservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *  ActivitiesServiceSkeleton java skeleton for the axisService
 */
public class ActivitiesServiceSkeleton{     
    /**
     * Auto generated method signature 
     * @param bookActivity 
     * @return bookActivityResponse 
     */
	public org.example.www.activitiesservice.BookActivityResponse bookActivity(org.example.www.activitiesservice.BookActivity bookActivity){
		BookActivityResponse response = new BookActivityResponse();
		response.localOut = true;
		try{
			Connection connection = null;
     		Statement statement = null;
     		Class.forName("com.mysql.jdbc.Driver");
     		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtis", "root", "");
     		statement = connection.createStatement();
     		String query = "insert into 'mtis','activitybooking'('id','activity') values(NULL, '" + bookActivity.localIn +"') ) ";
     		statement.executeQuery(query);
		}catch(Exception e){
			System.err.println(e.getMessage());
			response.localOut = false;
		}
		return response;
	}
     
    /**
     * Auto generated method signature
     * @param getActivities 
     * @return getActivitiesResponse 
     */
	public org.example.www.activitiesservice.GetActivitiesResponse getActivities(org.example.www.activitiesservice.GetActivities getActivities){
		ArrayList<Activity> readActs = new ArrayList<>();
	   	 try{
	    		Connection connection = null;
	    		Statement statement = null;
	    		Class.forName("com.mysql.jdbc.Driver");
	    		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtis", "root", "");
	    		statement = connection.createStatement();
	    		String query = "SELECT a1.* FROM activities a1 INNER JOIN  cities c1 on (c1.name like '%" + getActivities.localIn +"%')";
	    		ResultSet resultSet = statement.executeQuery(query);
	    		while(resultSet.next()){
	    			Activity tmpAct = new Activity();
	    			tmpAct.setId(resultSet.getInt("id"));
	    			//tmpAct.setDate(resultSet.getDate("date"));
	    			tmpAct.setDescription(resultSet.getString("description"));
	    			tmpAct.setName(resultSet.getString("name"));
	    			tmpAct.setPrice(resultSet.getFloat("price"));
	    			tmpAct.setType(resultSet.getString("type"));
	    			readActs.add(tmpAct);
	    		}
	    	}catch(Exception e){
	    		System.out.println(e.getMessage());
	    	}
		
	   	Activities acts = new Activities();
	   	acts.localItem = new Activity[readActs.size()];
	   	for(int i = 0 ; i < readActs.size(); i++)
	       	acts.localItem[i] = readActs.get(i+1);
		
	   	GetActivitiesResponse response = new GetActivitiesResponse();
		response.setOut(acts);
		return response;
    }
 
}
    