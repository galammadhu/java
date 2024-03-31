import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld3 extends HttpServlet {

protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<h1>Hello World using HttpServlet class with doPost.</h1>");
out.close();

 }
}
