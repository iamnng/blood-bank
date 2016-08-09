<%@ page import="java.util.ArrayList" %>
<%@ page import="com.blood.bank.entity.Donor" %>

<html>
<body>
<h2>Blood Bank Welcome Page!</h2>

<%  
// retrieve your list from the request, with casting 
ArrayList<Donor> donorList = (ArrayList<Donor>) request.getAttribute("donorList");

// print the information about every category of the list
for(Donor donor : donorList) {
    out.println(donor.getDonorName());
}
%>
</body>
</html>
