package webClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.URLConnection;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;


public class client {
	public static void main(String[] args) throws Exception {
        
		HttpServer server = HttpServer.create(new InetSocketAddress(8001), 0);
        server.createContext("/fechas", new Inicio());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    static class Inicio implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
        	
        	String response = "";
        	Headers h = t.getResponseHeaders();
        	
        	if(t.getRequestURI().getQuery() == null) {
        		Pub_gestdocenteStub stub = new Pub_gestdocenteStub();
        		Pub_gestdocenteStub.Wstitulosuni consulta = new Pub_gestdocenteStub.Wstitulosuni();
        		consulta.setPcurso("2015-16");
        		consulta.setPlengua("C");
        		Pub_gestdocenteStub.WstitulosuniResponse titulos = stub.wstitulosuni(consulta);
        	
        		response = "<form><select name=\"titulos\">";
        		for(Pub_gestdocenteStub.ClaseTitulosUni titulo : titulos.localWstitulosuniResult.getClaseTitulosUni()) {
        			response += "<option value=\"" + titulo.getCodigo() + "\">" + titulo.getNombre() + "</option>";
        		}
        		response += "</select>";
        		response += "<input type=\"submit\" value=\"Submit\"></form>";
        		h.set("Content-Type","text/html");
        	} else {
        		String xml = "";
        		String split[] = t.getRequestURI().getQuery().split("=");
        		String codigo = split[1];
        		 URL mule = new URL("http://localhost:8081/flujoexamenes?plengua=C&pcurso=2015-16&pcodest="+codigo+"&porden=A");
        	     URLConnection conn = mule.openConnection();
        	     BufferedReader in = new BufferedReader(
        	                                new InputStreamReader(
        	                                conn.getInputStream()));
        	     String inputLine;

        	     while ((inputLine = in.readLine()) != null) 
        	           xml += inputLine;
        	      in.close();
        	      String asignaturas[] = xml.split("nomasi");
        	      String fechas[] = xml.split("fechareal");
        	      response += "<table>";
        	      for(int i=1; i < asignaturas.length; i+=2) {
        	    	  response += "<tr>";
        	    	  response += "<td>" + asignaturas[i].substring(1, asignaturas[i].length() - 2) + "<td/>";
        	    	  response += "<td>" + fechas[i].substring(1, fechas[i].length() - 2) + "<td/>";
        	    	  response += "<tr/>";
        	      }
        	      response += "</table>";
        	      h.set("Content-Type","text/html");
        	      
        	}
        	
        	
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            
            os.write(response.getBytes());
            os.close();
        }
    }
}
