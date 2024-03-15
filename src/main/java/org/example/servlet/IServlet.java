package org.example.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IServlet {
    public String doPost(HttpServletRequest req, HttpServletResponse resp);
}
