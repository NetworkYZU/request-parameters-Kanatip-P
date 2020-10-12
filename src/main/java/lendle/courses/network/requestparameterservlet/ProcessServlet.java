/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.requestparameterservlet;

import java.awt.Checkbox;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javafx.scene.control.RadioButton;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lendle
 */
@WebServlet(name = "ProcessServlet", urlPatterns = {"/process"})
public class ProcessServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProcessServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            Enumeration <String> names=request.getParameterNames();
            while(names.hasMoreElements()){
                String name=names.nextElement();
                out.println(name+"");
                out.println(request.getParameter(name)+"<br/>");
            }
            String[] group1 =request.getParameterValues("group1");
            String[] group2 =request.getParameterValues("group2");
            
            for(int i =0;i<group1.length;i++){
            out.println(("group1 ="+i+" "+(group1[i]))+"<br/>");
            }
            for(int i =0;i<group1.length;i++){
            out.println(("group2 ="+i+" "+(group2[i]))+"<br/>");
            }
            
            
            
            //out.println(request.getParameter("username"));
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
