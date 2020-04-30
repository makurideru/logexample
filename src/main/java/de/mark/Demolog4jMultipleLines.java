package de.mark;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

@WebServlet("/demolog4jMultipleLines")
public class Demolog4jMultipleLines extends HttpServlet {
  private static final long serialVersionUID = 1L;

  final static Logger logger = Logger.getLogger(Demolog4jOneLineServlet.class);

  public Demolog4jMultipleLines()
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
    out.print("if(logger.isDebugEnabled()){<br>\n"
        + "      logger.debug(\"This is debug : \" + parameter);<br>\n"
        + "    }<br>\n"
        + "\n<br>"
        + "    if(logger.isInfoEnabled()){\n<br>"
        + "      logger.info(\"This is info : \" + parameter);\n<br>"
        + "    }\n<br>"
        + "\n<br>"
        + "    logger.warn(\"This is warn : \" + parameter);\n<br>"
        + "    logger.error(\"This is error : \" + parameter);\n<br>"
        + "    logger.fatal(\"This is fatal : \" + parameter);<br>");
    out.print("</body></html>");

    Demolog4jMultipleLines obj = new Demolog4jMultipleLines();
    obj.runMe("demolog4jMultipleLines");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
  }


  private void runMe(String parameter){

    if(logger.isDebugEnabled()){
      logger.debug("This is debug : " + parameter);
    }

    if(logger.isInfoEnabled()){
      logger.info("This is info : " + parameter);
    }

    logger.warn("This is warn : " + parameter);
    logger.error("This is error : " + parameter);
    logger.fatal("This is fatal : " + parameter);

  }

}
