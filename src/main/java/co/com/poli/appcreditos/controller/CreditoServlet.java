//package co.com.poli.appcreditos.controller;
//
//import co.com.poli.appcreditos.business.impl.CreditoBusinessImpl;
//import co.com.poli.appcreditos.model.Credito;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
///**
// *
// * @author cgaop
// */
//public class CreditoServlet extends HttpServlet {
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        HttpSession session = request.getSession(true);
//        RequestDispatcher rd = null;
//
//        CreditoBusinessImpl cBusinessImpl = new CreditoBusinessImpl();
//        String accion = request.getParameter("accion");
//
//        switch (accion) {
//            case "crear":
//                Boolean sw = false;
//
//                String idCredito = request.getParameter("txtidcredito");
//                String documento = request.getParameter("txtdocumento");
//                String nombres = request.getParameter("txtnombres");
//                Double monto = Double.valueOf(request.getParameter("txtmonto"));
//                String tipoTrabajador = request.getParameter("txttrabajador");
//                String tipoCredito = request.getParameter("txttipocredito");
//                String vinculado = request.getParameter("txtvinculado");
//
//                Credito credito = new Credito(idCredito, documento, nombres, monto, tipoTrabajador, tipoCredito, vinculado);
//
//                sw = cBusinessImpl.creditoExiste(documento, tipoCredito);
//
//                if (sw == true) {
//                    String msj = "Hola usted ya tiene un credito de este tipo";
//                    session.setAttribute("MENSAJE", msj);
//                    rd = request.getRequestDispatcher("/mensaje.jsp");
//                } else {
//                    String mensaje = cBusinessImpl.crearCredito(credito);
//                    List<Credito> listaCreditos = cBusinessImpl.obtenerListaCreditos();
//                    session.setAttribute("LISTADO", listaCreditos);
//                    rd = request.getRequestDispatcher("/view/creditoLista.jsp");
//                }
//                break;
//
//            case "listar":
//                List<Credito> listaCreditos = cBusinessImpl.obtenerListaCreditos();
//                session.setAttribute("LISTADO", listaCreditos);
//                rd = request.getRequestDispatcher("/view/creditoLista.jsp");
//                break;
//
//            case "usado":
//                String msjUsado = cBusinessImpl.creditoMasUsado();
//                session.setAttribute("MENSAJE", msjUsado);
//                rd = request.getRequestDispatcher("/mensaje.jsp");
//                break;
//
//            case "acumulado":
//                String msjAcumulado = cBusinessImpl.acumuladoCreditos();
//                session.setAttribute("MENSAJE", msjAcumulado);
//                rd = request.getRequestDispatcher("/mensaje.jsp");
//                break;
//
//            case "prestador":
//                String msjPrestador = cBusinessImpl.mayorPrestamista();
//                session.setAttribute("MENSAJE", msjPrestador);
//                rd = request.getRequestDispatcher("/mensaje.jsp");
//                break;
//
//            default:
//                break;
//        }
//        rd.forward(request, response);
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
