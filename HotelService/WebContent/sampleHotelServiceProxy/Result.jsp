<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleHotelServiceProxyid" scope="session" class="org.example.www.HotelService.HotelServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleHotelServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleHotelServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleHotelServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        org.example.www.HotelService.HotelService_PortType getHotelService_PortType10mtemp = sampleHotelServiceProxyid.getHotelService_PortType();
if(getHotelService_PortType10mtemp == null){
%>
<%=getHotelService_PortType10mtemp %>
<%
}else{
        if(getHotelService_PortType10mtemp!= null){
        String tempreturnp11 = getHotelService_PortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String parameters_1id=  request.getParameter("parameters20");
            java.lang.String parameters_1idTemp = null;
        if(!parameters_1id.equals("")){
         parameters_1idTemp  = parameters_1id;
        }
        org.example.www.HotelService.Hotel getHotels13mtemp = sampleHotelServiceProxyid.getHotels(parameters_1idTemp);
if(getHotels13mtemp == null){
%>
<%=getHotels13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getHotels13mtemp != null){
java.lang.String typename16 = getHotels13mtemp.getName();
        String tempResultname16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename16));
        %>
        <%= tempResultname16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getHotels13mtemp != null){
%>
<%=getHotels13mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 22:
        gotMethod = true;
        %>
        <jsp:useBean id="org1example1www1HotelService1BookDates_2id" scope="session" class="org.example.www.HotelService.BookDates" />
        <%
        org.example.www.HotelService.Room getRooms22mtemp = sampleHotelServiceProxyid.getRooms(org1example1www1HotelService1BookDates_2id);
if(getRooms22mtemp == null){
%>
<%=getRooms22mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">_class:</TD>
<TD>
<%
if(getRooms22mtemp != null){
java.lang.String type_class25 = getRooms22mtemp.get_class();
        String tempResult_class25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_class25));
        %>
        <%= tempResult_class25 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">price:</TD>
<TD>
<%
if(getRooms22mtemp != null){
%>
<%=getRooms22mtemp.getPrice()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getRooms22mtemp != null){
%>
<%=getRooms22mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 33:
        gotMethod = true;
        String enddate_4id=  request.getParameter("enddate38");
            java.util.Date enddate_4idTemp = null;
        if(!enddate_4id.equals("")){
        java.text.DateFormat dateFormatenddate38 = java.text.DateFormat.getDateInstance();
        enddate_4idTemp= dateFormatenddate38.parse(enddate_4id);
        }
        String startdate_5id=  request.getParameter("startdate40");
            java.util.Date startdate_5idTemp = null;
        if(!startdate_5id.equals("")){
        java.text.DateFormat dateFormatstartdate40 = java.text.DateFormat.getDateInstance();
        startdate_5idTemp= dateFormatstartdate40.parse(startdate_5id);
        }
        String roomid_6id=  request.getParameter("roomid42");
        int roomid_6idTemp  = Integer.parseInt(roomid_6id);
        %>
        <jsp:useBean id="org1example1www1HotelService1Booking_3id" scope="session" class="org.example.www.HotelService.Booking" />
        <%
        org1example1www1HotelService1Booking_3id.setEnddate(enddate_4idTemp);
        org1example1www1HotelService1Booking_3id.setStartdate(startdate_5idTemp);
        org1example1www1HotelService1Booking_3id.setRoomid(roomid_6idTemp);
        boolean makeBooking33mtemp = sampleHotelServiceProxyid.makeBooking(org1example1www1HotelService1Booking_3id);
        String tempResultreturnp34 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(makeBooking33mtemp));
        %>
        <%= tempResultreturnp34 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>