import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorld1 extends GenericServlet {

public void service(ServletRequest request, ServletResponse response)throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<h1>Hello World example using" + " GenericServlet class.</h1>");
out.close();

 }
}
