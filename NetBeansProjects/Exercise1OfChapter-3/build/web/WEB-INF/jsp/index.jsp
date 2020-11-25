<%-- 
    Document   : index
    Created on : 26 Jul, 2020, 9:02:02 PM
    Author     : Mahesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body leftmargin="0" topmargin="00" marginwidth="0" marginheight="0">
    <table width="775" height="330" border="0" align="center" cellpadding="0"
    cellspacing="0">
        <tr>
            <td height="30" colspan="2">
                <img src="images/banner.jpg" width="775" height="144">
            </td>
        </tr>
        <tr>
            <td width="102" valign="top">
                <%@include file="menu.jsp" %>   
            </td>
            <td width="601" valign="top">
                <table width="567" border="0" align="center" cellpadding="0"
                cellspacing="8">
                <tr>
                <td>
                    <div align="right" style="color:#003366; font-family: verdana;
                    font-size-adjust: 2">
                    &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="index.htm">
                    Home
                    </a>
                    &nbsp;||
                    <a href="BookingPage.htm">
                    Book Rooms
                    </a>
                    </div>
                </td>
                <tr>
                <td>
                <table width="567" border="0" align="center" cellpadding="0"
                cellspacing="0">
                <tr>
                <td>
                    <div align="justify" style="color: #003366;font-size-adjust: 2;
                    font-family: verdana">
                       <br />
                       <br />
                        <h3><b>Welcome to Merrison Hotel</b></h3></<br />
                        The hotels run by the US Tourism Company and its associated
                        subsidiaries are collectively known under a single name, Merrison
                        Hotel. The group is recognized as one of the largest and finest
                        hotel companies in the US. The company was incorporated by 
                        Robert Watson in 1906. Merrison Hotel is a symbol of great 
                        hospitality and services.
                        <br />
                        <br />
                        <h3><b>Our Services</b></h3></<br />
                        Merrison Hotel has its presence and services throughout the
                        country, including the important industrial towns and cities,
                        beaches, hill stations, historical and pilgrim centres, and 
                        wildlife destinations.
                        <br />
                        <br />
                        The hotel gives first priority to its customers and their 
                        convenience. Therefore, it provides special offers, gift vouchers
                        and discounts to its regular customers.
                        <br />
                        <br />
                        For more information, contact us at the following address:
                        <br />
                        172, Silver Street.
                        <br />
                        California
                        <br />
                        <br />
                        or call us at:
                        <br />
                        77-444578596
                        <br />
                        <h4><b>You can also send your queries at info@merrisonhotel.com</b></h4>
                    </div></td>
                </table></td>
                </tr>                   
                </table></td>
                </tr>
    </table>
    <%@include file="footer.jsp" %>               
</body>
</html>
