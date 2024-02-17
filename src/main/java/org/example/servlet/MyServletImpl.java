package org.example.servlet;

import org.example.annotation.OperationLog;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class MyServletImpl {
    @OperationLog(type = "{convert('sdsadasd')}")
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int i=1/0;
        resp.getWriter().write("sadas");
    }
}
