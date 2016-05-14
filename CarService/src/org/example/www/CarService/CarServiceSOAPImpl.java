/**
  * CarServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.CarService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CarServiceSOAPImpl implements org.example.www.CarService.CarService_PortType{
    public org.example.www.CarService.Car[] getCars(java.lang.String in) throws java.rmi.RemoteException {
    	ArrayList<Car> cars = new ArrayList<>();
    	
    	try{
    		Connection connection = null;
    		Statement statement = null;
    		Class.forName("com.mysql.jdbc.Driver");
    		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtis", "root", "");
    		statement = connection.createStatement();
    		String query = "SELECT c1.* FROM cars c1 INNER JOIN  cities c1 on (c1.name like '%" + in +"%')";
    		ResultSet resultSet = statement.executeQuery(query);
    		while(resultSet.next()){
    			Car tmp_car = new Car();
    			cars.add(tmp_car);
    		}
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	} 
    	Car[] car_response = new Car[cars.size()];
        for(int i = 0 ; i < cars.size(); i++)
        	car_response[i] = cars.get(i+1);

    	return car_response;
    }

    public boolean rentCars(org.example.www.CarService.RentInfo in) throws java.rmi.RemoteException {
    	in.getId();
    	try{
        	Connection connection = null;
    		Statement statement = null;
    		Class.forName("com.mysql.jdbc.Driver");
    		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtis", "root", "");
    		statement = connection.createStatement();
    		String query = "insert into 'mtis','carbooking'('id','startdate','enddate') values(NULL, '";
    		query += in.getId() +"','"+ in.getStartdate().toString() +"','"+ in.getEnddate().toString()+"') ) ";
    		statement.executeQuery(query);
        }catch(Exception e){
        	System.out.println(e.getMessage());
        	return false;
        }
        return true;
    }

}
