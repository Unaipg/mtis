
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */

        
            package org.example.www.travelservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.example.org/TravelService/".equals(namespaceURI) &&
                  "emptyType".equals(typeName)){
                   
                            return  org.example.www.travelservice.EmptyType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/TravelService/".equals(namespaceURI) &&
                  "Airports".equals(typeName)){
                   
                            return  org.example.www.travelservice.Airports.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/TravelService/".equals(namespaceURI) &&
                  "Airport".equals(typeName)){
                   
                            return  org.example.www.travelservice.Airport.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/TravelService/".equals(namespaceURI) &&
                  "Flight".equals(typeName)){
                   
                            return  org.example.www.travelservice.Flight.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/TravelService/".equals(namespaceURI) &&
                  "Flights".equals(typeName)){
                   
                            return  org.example.www.travelservice.Flights.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/TravelService/".equals(namespaceURI) &&
                  "flightsReq".equals(typeName)){
                   
                            return  org.example.www.travelservice.FlightsReq.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    