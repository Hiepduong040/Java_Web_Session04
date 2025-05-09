package com.data.java_web_session04.Ex06;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "studentListServlet", value = "/studentListServlet")
public class studentListServlet extends HttpServlet {
    private String message;
    public List<StudentEx06> studentBT06List = new ArrayList<StudentEx06>();
    public void init() {
        studentBT06List.add(new StudentEx06(1, "Nguyen Van A", 20, 8.2));
        studentBT06List.add(new StudentEx06(2, "Tran Thi B", 21, 6.9));
        studentBT06List.add(new StudentEx06(3, "Le Van C", 19, 7.5));
        studentBT06List.add(new StudentEx06(4, "Pham Thi D", 22, 6.0));
        getServletContext().setAttribute("studentBT06List", studentBT06List);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<StudentEx06> students = new ArrayList<>();
        students.add(new StudentEx06(1, "Nguyen Van A", 20, 8.2));
        students.add(new StudentEx06(2, "Tran Thi B", 21, 6.9));
        students.add(new StudentEx06(3, "Le Van C", 19, 7.5));
        students.add(new StudentEx06(4, "Pham Thi D", 22, 6.0));

        request.setAttribute("studentBT06List", students);

        RequestDispatcher dispatcher = request.getRequestDispatcher("BT06.jsp");
        dispatcher.forward(request, response);
    }


    public void destroy() {
    }
}