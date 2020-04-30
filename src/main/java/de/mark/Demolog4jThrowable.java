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

@WebServlet("/demolog4jthrowable")
public class Demolog4jThrowable extends HttpServlet {
  private static final long serialVersionUID = 1L;

  Logger logger = LogManager.getLogger("CONSOLE_JSON_APPENDER");

  public Demolog4jThrowable()
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
    out.print("Throwable throwable = new Throwable();\n<br>"
        + "\n<br>"
        + "    logger.info(\"[{}]: Job-Restart detected!\", throwable);<br>");
    out.print("</body></html>");

    Demolog4jThrowable obj = new Demolog4jThrowable();
    obj.runMe("demolog4jOneLine");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
  }


  private void runMe(String parameter){

    Throwable throwable = new Throwable();

    logger.info("[{}]: Job-Restart detected!", throwable);

  }

}
