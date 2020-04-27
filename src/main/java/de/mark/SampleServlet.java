package de.mark;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

@WebServlet("/sayhello")
public class SampleServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  final static Logger logger = Logger.getLogger(SampleServlet.class);

  public SampleServlet()
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
    out.print("Hello World");
    out.print("</body></html>");

    SampleServlet obj = new SampleServlet();
    obj.runMe("demolog");
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

    Throwable throwable = new Throwable();

    logger.info("[{}]: Job-Restart detected!", throwable);

  }

}