package org.example.servlet;

import org.example.annotation.OperationLog;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class MyServletImpl implements IServlet {
    @OperationLog(type = "{convert('sdsadasd')}")
    public String doPost(HttpServletRequest req, HttpServletResponse resp)  {
        return "impl";
    }
}
