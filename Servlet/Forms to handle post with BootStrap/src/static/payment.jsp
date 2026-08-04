<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.net.URLEncoder" %>

<%
Double amount = (Double) request.getAttribute("amount");

String field1 = (String) request.getAttribute("guestName");
String field2 = (String) request.getAttribute("roomType");
String field3 = (String) request.getAttribute("guestNo");
String field4 = (String) request.getAttribute("checkIn");
String field5 = (String) request.getAttribute("checkOut");

String upiId = "6363326263@slc";
String name = "Saikrishna Badiger";

String upiLink =
"upi://pay?pa=" + upiId +
"&pn=" + name +
"&am=" + amount +
"&cu=INR";

String qrUrl =
"https://api.qrserver.com/v1/create-qr-code/?size=250x250&data=" +
URLEncoder.encode(upiLink, "UTF-8");
%>

<!DOCTYPE html>

<html>

<head>

<title>Payment</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
rel="stylesheet">

</head>

<body class="container mt-5">

<div class="card shadow p-4">

<h2 class="text-primary">Payment Details</h2>

<hr>

<h4><%= field1 %></h4>

<h4><%= field2 %></h4>

<h4><%= field3 %></h4>

<h4><%= field4 %></h4>

<h4><%= field5 %></h4>

<h4>UPI ID : <%= upiId %></h4>

<h3 class="text-danger">
Amount : ₹<%= amount %>
</h3>

<p>Scan the QR code below to complete the payment.</p>

<img src="<%= qrUrl %>" width="250" height="250">

<br><br>

<form action="payment" method="post">

<input type="hidden" name="amount" value="<%= amount %>">

<button class="btn btn-success">
I've Paid
</button>

</form>

</div>

</body>
</html>