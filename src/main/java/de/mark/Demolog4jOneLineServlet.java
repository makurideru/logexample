package de.mark;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/demolog4jOneLine")
public class Demolog4jOneLineServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  Logger logger = LogManager.getLogger("CONSOLE_JSON_APPENDER");

  public Demolog4jOneLineServlet()
  {
    super();
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    PrintWriter out = response.getWriter();
    out.print("<html><head>");
    out.print("<title>servletworks</title>");
    out.print("</head>");
    out.print("<body>");
    out.print("logger.info(\"This is info : \" + parameter);");
    out.print("</body></html>");

    Demolog4jOneLineServlet obj = new Demolog4jOneLineServlet();
    obj.runMe("demolog4jOneLine");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
  }


  private void runMe(String parameter){

    if(logger.isInfoEnabled()){
      logger.info("This is info : " + parameter);
    }

  }

}
