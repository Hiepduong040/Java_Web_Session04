package com.data.java_web_session04.Ex01;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ProductServlet", value = "/ProductServlet")
public class ProductServlet extends HttpServlet {
    public static List<Product> products = new ArrayList<Product>();
    public void init() {
        products.add(new Product(1, "TechNova X1", 2500.0, "Thiết bị flagship vừa ra mắt."));
        products.add(new Product(2, "ZenCore S20", 2100.0, "Hiệu năng ổn định, thiết kế cao cấp."));
        products.add(new Product(3, "NeoPhone Lite 13", 2200.0, "Giá cả phải chăng, tính năng đầy đủ."));
        products.add(new Product(4, "Vega Vision X5", 2500.0, "Kiểu dáng hiện đại, camera AI thông minh."));
        products.add(new Product(5, "PixelCore G8", 2900.0, "Trải nghiệm Android thuần, cập nhật tức thì."));
        products.add(new Product(6, "Aureus Z5 Pro", 3100.0, "Màn hình 4K, quay video chất lượng điện ảnh."));
        products.add(new Product(7, "BlazeOne 10", 2600.0, "Xử lý tốc độ cao, sạc nhanh chỉ trong phút."));

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("productList",products);
        request.getRequestDispatcher("productList.jsp").forward(request,response);
    }

    public void destroy() {
    }
}