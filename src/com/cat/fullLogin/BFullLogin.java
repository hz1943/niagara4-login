package com.cat.fullLogin;

import java.io.IOException;

import javax.baja.io.HtmlWriter;
import javax.baja.naming.BOrd;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import javax.baja.web.BLoginTemplate;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@NiagaraType
public class BFullLogin extends BLoginTemplate {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.cat.fullLogin.BFullLogin(2979906276)1.0$ @*/
/* Generated Wed Jun 13 10:55:12 CST 2018 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public static final BFullLogin INSTANCE = new BFullLogin();
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BFullLogin.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  @Override
  public BOrd resourceToOrd(String path) {
    if (path.startsWith("/custom"))
    {
      //return custom resources:
      // /login/custom/customLogin.css
      // /login/custom/customLogo.png
      path=path.substring("/custom".length(), path.length());
      BOrd ord = BOrd.make("module://fullLogin/resources" + path);
      return ord;
    }
    else
    {
      // return resources from the web modules such as login.js & auth.min.js
      return BOrd.make("module://web/com/tridium/web/rc" + path);
    }

  }

  @Override
  public void write(HttpServletRequest req, HttpServletResponse rsp)
      throws IOException, ServletException {
    HtmlWriter out = new HtmlWriter(rsp.getWriter());
    out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"");
    out.println("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");      

    out.println("<html>");
    
    out.println("<head>");
    out.println("  <title>Login</title>");
    out.println("  <meta http-equiv='Content-type' content='text/html;' />");
    out.println("  <link rel='stylesheet' href='login/custom/log.css'/>");
    out.println("  <script type='text/javascript' src='login/loginN4.js'></script>");
    out.println("  <script type='text/javascript' src='login/digestLoginN4.js'></script>");
    out.println("  <script type='text/javascript' src='login/core/auth.min.js'></script>");
    out.println("</head>");
    
    out.println("<body>");
    out.println("<div class='theme-baoye'>");
    out.println("<div class='login'>");
    
    out.println("<div class='titles'>");
    out.println("<h1>中用科技智慧物联网平台</h1>");
    out.println("<h2>Smart Internet of Things Platform</h2>");
    out.println("</div>");
    
    out.println("<form method='post' action='/j_security_check'>");
    out.println("<div>");
    out.println("<input id='username' type='text' name='j_username' placeholder='用户名' />");
    out.println("</div>");
    out.println("<div>");
    out.println("<input id='password' type='password' name='j_password' placeholder='密码' />");
    out.println("</div>");
    out.println("<div>");
    out.println("<button id='login-submit' type='submit' onclick='return doLogin();'>登录</button>");
    out.println("</div>");
    out.println("</form>");
    out.println("<div  class='copyright'>Copyright © 2015~2018</div>");
    
    out.println("</div>");
    out.println("</div>");    
    out.println("</body>");    
    out.println("</html>");
    out.close();
  }

}
