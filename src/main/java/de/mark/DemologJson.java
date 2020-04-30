package de.mark;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;

@WebServlet("/jsonausgabe")
public class DemologJson extends HttpServlet {
  private static final long serialVersionUID = 1L;

  final static Logger logger = Logger.getLogger(Demolog4jOneLineServlet.class);

  public DemologJson()
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
    out.print("JSONObject obj = new JSONObject();\n<br>"
        + "\n<br>"
        + "    obj.put(\"name\", \"foo\");\n<br>"
        + "    obj.put(\"num\", new Integer(100));\n<br>"
        + "    obj.put(\"balance\", new Double(1000.21));\n<br>"
        + "    obj.put(\"is_vip\", new Boolean(true));\n<br>"
        + "\n<br>"
        + "    logger.error(obj);<br>");
    out.print("</body></html>");

    DemologJson obj = new DemologJson();
    obj.runMe("demolog4jOneLine");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
  }


  private void runMe(String parameter){

    JSONObject obj = new JSONObject();

    obj.put("name", "foo");
    obj.put("num", new Integer(100));
    obj.put("balance", new Double(1000.21));
    obj.put("is_vip", new Boolean(true));

    logger.error(obj);

  }

}
