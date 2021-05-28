/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab8;

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
@WebServlet(name = "Lab8Servlet", urlPatterns = {"/lab8"})
public class Lab8Servlet extends HttpServlet {
    
    @Autowired
            
    Lab8Show lab8show;
    
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
            out.println("<title>Servlet Lab8Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Lab8Servlet at " + request.getContextPath() + "</h1>");
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
        
        String winTick = lab8show.winTicketsN(request.getParameter("num"));
        String radixL = lab8show.radixL();
        String radix = lab8show.radix();
        String quick = lab8show.quick();
        String quickL = lab8show.quickL();
        String jackpot = lab8show.jackpot(request.getParameter("num"), request.getParameter("jack"));
        String winTick1 = lab8show.winTicketsN("50");
        String radixL1 = lab8show.radixL();
        String radix1 = lab8show.radix();
        String quick1 = lab8show.quick();
        String quickL1 = lab8show.quickL();
        String jackpot1 = lab8show.jackpot(request.getParameter("num"), request.getParameter("jack"));
        String winTick2 = lab8show.winTicketsN("500");
        String radixL2 = lab8show.radixL();
        String radix2 = lab8show.radix();
        String quick2 = lab8show.quick();
        String quickL2 = lab8show.quickL();
        String jackpot2 = lab8show.jackpot(request.getParameter("num"), request.getParameter("jack"));
        String winTick3 = lab8show.winTicketsN("5000");
        String radixL3 = lab8show.radixL();
        String radix3 = lab8show.radix();
        String quick3 = lab8show.quick();
        String quickL3 = lab8show.quickL();
        String jackpot3 = lab8show.jackpot(request.getParameter("num"), request.getParameter("jack"));
      
        
        request.setAttribute("winTick", winTick);
        request.setAttribute("winTick1", winTick1);
        request.setAttribute("radix", radix);
        request.setAttribute("radixL", radixL);
        request.setAttribute("quick", quick);
        request.setAttribute("quickL", quickL);
        request.setAttribute("radix1", radix1);
        request.setAttribute("radixL1", radixL1);
        request.setAttribute("quick1", quick1);
        request.setAttribute("quickL1", quickL1);
        request.setAttribute("winTick2", winTick2);
        request.setAttribute("radix2", radix2);
        request.setAttribute("radixL2", radixL2);
        request.setAttribute("quick2", quick2);
        request.setAttribute("quickL2", quickL2);
        request.setAttribute("winTick3", winTick3);
        request.setAttribute("radix3", radix3);
        request.setAttribute("radixL3", radixL3);
        request.setAttribute("quick3", quick3);
        request.setAttribute("quickL3", quickL3);
        request.setAttribute("jackpot", jackpot);
        request.setAttribute("jackpot1", jackpot1);
        request.setAttribute("jackpot2", jackpot2);
        request.setAttribute("jackpot3", jackpot3);
        
        request.getRequestDispatcher("lab8.jsp").forward(request, response);
        
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
