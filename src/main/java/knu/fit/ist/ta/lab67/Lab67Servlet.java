/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 *
 * @author macbook
 */
@WebServlet(name = "Lab67Servlet", urlPatterns = {"/lab6-7"})
public class Lab67Servlet extends HttpServlet {
    
    @Autowired
            
    Lab67Show lab67show;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, 
        config.getServletContext());
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Lab67Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Lab67Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String treetIO = lab67show.treetIO(request.getParameter("nodes"));
        String treetPO = lab67show.treetPO();
        String treetPostO = lab67show.treetPostO();
        String treetLO = lab67show.treetLO();
        String addS = lab67show.addS(request.getParameter("add"));
        String treeCS = lab67show.treeCS(request.getParameter("cont"));
        String smallest = lab67show.smallest();
        String largest = lab67show.largest();
        String delete = lab67show.deleteS(request.getParameter("del"));
        String treetPostONotRS = lab67show.treetPostONotRS();
        String numLet = lab67show.numLet(request.getParameter("ch"),request.getParameter("str"),request.getParameter("ind"));
        String tree = lab67show.tree();
      
        
        request.setAttribute("tree", tree);
        request.setAttribute("numLet", numLet);
        request.setAttribute("treetIO", treetIO);
        request.setAttribute("treetPO", treetPO);
        request.setAttribute("treetPostO", treetPostO);
        request.setAttribute("treetLO", treetLO);
        request.setAttribute("addS", addS);
        request.setAttribute("treeCS", treeCS);
        request.setAttribute("smallest", smallest);
        request.setAttribute("largest", largest);
        request.setAttribute("delete", delete);
        request.setAttribute("treetPostONotRS", treetPostONotRS);
        
        request.getRequestDispatcher("lab6-7.jsp").forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
