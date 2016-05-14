
/**
 * HotelServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.hotelservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
     *  HotelServiceSkeleton java skeleton for the axisService
     */
    public class HotelServiceSkeleton{
        
         
        /**
         * Auto generated method signature
         * @param getHotels 
         * @return getHotelsResponse 
         */
    	public org.example.www.hotelservice.GetHotelsResponse getHotels(org.example.www.hotelservice.GetHotels getHotels){
    		ArrayList<Hotel> hotels = new ArrayList<>();
        	try{
        		Connection connection = null;
        		Statement statement = null;
        		Class.forName("com.mysql.jdbc.Driver");
        		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtis", "root", "");
        		statement = connection.createStatement();
        		ResultSet resultSet = statement.executeQuery("SELECT h1.* FROM hotels h1 INNER JOIN  cities c1 on (c1.name like '%" + getHotels.localIn +"%')");
        		while(resultSet.next()){
        			Hotel tmp_hotel = new Hotel();
        			tmp_hotel.localId = resultSet.getInt("id");
        			tmp_hotel.localName = resultSet.getString("name");
        					
        			hotels.add(tmp_hotel);
        		}
        	}catch(Exception e){
        		System.out.println(e.getMessage());
        	} 
        	
        	Hotels hotels_response = new Hotels();
        	hotels_response.localItem = new Hotel[hotels.size()];
            for(int i = 0 ; i < hotels.size(); i++)
            	hotels_response.localItem[i] = hotels.get(i+1);

            GetHotelsResponse response = new GetHotelsResponse();
            response.localOut = hotels_response;
        	return response;
    	}
     
         
	/**
	 * Auto generated method signature
	 * @param makeBooking 
	 * @return makeBookingResponse 
	 */
	public org.example.www.hotelservice.MakeBookingResponse makeBooking(org.example.www.hotelservice.MakeBooking makeBooking){
		MakeBookingResponse response = new MakeBookingResponse();
		response.localOut = true;
		try{
	    	Connection connection = null;
			Statement statement = null;
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtis", "root", "");
			statement = connection.createStatement();
			
			String query = "insert into 'mtis','hotelbooking'('id','room','startdate','enddate') values(NULL, '";
			query += makeBooking.getIn().localRoomid +"','"+ makeBooking.getIn().localStartdate.toString() +"','"+ makeBooking.getIn().localEnddate.toString()+"') ) ";
			statement.executeQuery(query);
	    }catch(Exception e){
	    	System.out.println(e.getMessage());
	    	response.localOut = false;
	    }
	    return response;
	}
     
         
    /**
     * Auto generated method signature
     * @param getRooms 
     * @return getRoomsResponse 
     */
    public org.example.www.hotelservice.GetRoomsResponse getRooms(org.example.www.hotelservice.GetRooms getRooms){
    	ArrayList<Room> rooms = new ArrayList<>();
    	try{
    		Connection connection = null;
    		Statement statement = null;
    		Class.forName("com.mysql.jdbc.Driver");
    		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtis", "root", "");
    		statement = connection.createStatement();
    		ResultSet resultSet = statement.executeQuery("SELECT r1.* FROM rooms r1 where r1.hotel=" + getRooms.localIn.localHotelid);
    		while(resultSet.next()){
    			Room tmpRoom = new Room();
    			tmpRoom.localId = resultSet.getInt("id");
    			tmpRoom.local_class = resultSet.getString("class");
    			tmpRoom.localPrice = resultSet.getFloat("price");
    					
    			rooms.add(tmpRoom);
    		}
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	} 
    	
    	Rooms roomsResponse= new Rooms();
    	roomsResponse.localItem = new Room[rooms.size()];
        for(int i = 0 ; i < rooms.size(); i++)
        	roomsResponse.localItem[i] = rooms.get(i+1);

        GetRoomsResponse response = new GetRoomsResponse();
        response.localOut = roomsResponse;
    	return response;
    }
     
    }
    