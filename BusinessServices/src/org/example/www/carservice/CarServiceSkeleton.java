
/**
 * CarServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.example.www.carservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

/**
 *  CarServiceSkeleton java skeleton for the axisService
 */

public class CarServiceSkeleton{
    
    /**
     * Auto generated method signature 
     * @param rentCars 
     * @return rentCarsResponse 
     */
     public org.example.www.carservice.RentCarsResponse rentCars(org.example.www.carservice.RentCars rentCars){
    	 RentCarsResponse response = new RentCarsResponse();
    	 response.setOut(true);
    	 try{
         	Connection connection = null;
     		Statement statement = null;
     		Class.forName("com.mysql.jdbc.Driver");
     		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtis", "root", "");
     		statement = connection.createStatement();
     		String query = "insert into 'mtis','carbooking'('id','startdate','enddate') values(NULL, '";
     		query += rentCars.getIn().localId +"','"+ rentCars.getIn().localStartdate.toString() +"','"+ rentCars.getIn().localEnddate.toString()+"') ) ";
     		statement.executeQuery(query);
         }catch(Exception e){
         	System.out.println(e.getMessage());
         	response.setOut(false);
         }
         return response;
      }
 
     
    /**
     * Auto generated method signature
     * @param getCars 
     * @return getCarsResponse 
     */
     public org.example.www.carservice.GetCarsResponse getCars(org.example.www.carservice.GetCars getCars){
    	 ArrayList<Car> readCars = new ArrayList<>();
    	 try{
     		Connection connection = null;
     		Statement statement = null;
     		Class.forName("com.mysql.jdbc.Driver");
     		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtis", "root", "");
     		statement = connection.createStatement();
     		String query = "SELECT c.* FROM cars c INNER JOIN  cities c1 on (c1.name like '%" + getCars.localIn +"%')";
     		ResultSet resultSet = statement.executeQuery(query);
     		while(resultSet.next()){
     			Car tmpCar = new Car();
     			tmpCar.setId(resultSet.getInt("id"));
     			tmpCar.setModel(resultSet.getString("model"));
     			tmpCar.setPrice(resultSet.getFloat("price"));
     			readCars.add(tmpCar);
     		}
     	}catch(Exception e){
     		System.out.println(e.getMessage());
     	} 
    	Cars cars = new Cars();
    	cars.localItem = new Car[readCars.size()];
        for(int i = 0 ; i < readCars.size(); i++)
        	cars.localItem[i] = readCars.get(i+1);
         
    	GetCarsResponse response = new GetCarsResponse();
    	response.setOut(cars);
    	return response;
    }
}
