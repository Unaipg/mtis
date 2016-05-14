
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */

        
            package org.example.www.hotelservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.example.org/HotelService/".equals(namespaceURI) &&
                  "Hotels".equals(typeName)){
                   
                            return  org.example.www.hotelservice.Hotels.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/HotelService/".equals(namespaceURI) &&
                  "BookDates".equals(typeName)){
                   
                            return  org.example.www.hotelservice.BookDates.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/HotelService/".equals(namespaceURI) &&
                  "Hotel".equals(typeName)){
                   
                            return  org.example.www.hotelservice.Hotel.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/HotelService/".equals(namespaceURI) &&
                  "Rooms".equals(typeName)){
                   
                            return  org.example.www.hotelservice.Rooms.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/HotelService/".equals(namespaceURI) &&
                  "Room".equals(typeName)){
                   
                            return  org.example.www.hotelservice.Room.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/HotelService/".equals(namespaceURI) &&
                  "Booking".equals(typeName)){
                   
                            return  org.example.www.hotelservice.Booking.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    