/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package application.controller;

import application.model.Index;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author vitaliy
 */
public class IndexController implements Controller {
    /// *** Properties  *** ///
    private Index model;

    public IndexController() {
        //Initialize controller properties here or
        //in the Web Application Context

        //setCommandClass(MyCommand.class);
        //setCommandName("MyCommandName");
//        setSuccessView("successView");
//        setFormView("formView");
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        return new ModelAndView( "index.jsp" );
    }
}