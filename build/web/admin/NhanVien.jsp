<%-- 
    Document   : NhanVien
    Created on : Jul 3, 2020, 3:17:00 PM
    Author     : OS
--%>


<%@page import="dao.NhanVienImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.NhanVien"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-
              8">
        <title>List Nhan Vien Page</title>
    </head>
    <body>
        <h1>TÌM KIẾM NHÂN VIÊN THEO MÃNV</h1>
        <form action="./NhanVien.jsp" method="GET">
            <p>Nhập mã nhân viên cần tìm kiếm:</p>
            <input type="text" name="txtMaNV"/>
            <input type="submit" value="Search"/>
        </form>
        <br>
        <%! List<NhanVien> listsearch = new ArrayList<NhanVien>();%>
        
        <%
            NhanVienImpl dao = new NhanVienImpl();
            String txtMaNV = request.getParameter("txtMaNV");
            if(txtMaNV != null && txtMaNV !=""){
                listsearch = dao.TimMaNV(txtMaNV);
            }
        %>
        <table border="1" width="50%">
            <tr>
                <th>Ma NV</th>
                <th>Ho</th>
                <th>Ten lot</th>
                <th>Ten</th>
                <th>Ngay Sinh</th>
                <th>Dia Chi</th>
            </tr>
            <c:forEach items="<%=listsearch%>" var="nvs">
                <tr>
                    <td>
                        ${nvs.maNV}
                    </td>
                    <td>
                        ${nvs.hoNV}
                    </td>
                    <td>
                        ${nvs.tenLot}
                    </td>
                    <td>
                        ${nvs.tenNV}
                    </td>
                    <td>
                        ${nvs.ngSinh}
                    </td>
                    <td>
                        ${nvs.diaChi}
                    </td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <hr>
        <h1>DANH SÁCH NHÂN VIÊN</h1>
        <%--<%! List<NhanVien> list = new ArrayList<NhanVien>();%>--%>
        
        <%
            List<NhanVien> list = new ArrayList<NhanVien>();
            list = dao.getAll();
        %>
        <table border="1" width="50%">
            <tr>
                <th>Ma NV</th>
                <th>Ho</th>
                <th>Ten lot</th>
                <th>Ten</th>
                <th>Ngay Sinh</th>
                <th>Dia Chi</th>
            </tr>
            <c:forEach items="<%=list%>" var="nv">
                <tr>
                    <td>
                        ${nv.maNV}
                    </td>
                    <td>
                        ${nv.hoNV}
                    </td>
                    <td>
                        ${nv.tenLot}
                    </td>
                    <td>
                        ${nv.tenNV}
                    </td>
                    <td>
                        ${nv.ngSinh}
                    </td>
                    <td>
                        ${nv.diaChi}
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
