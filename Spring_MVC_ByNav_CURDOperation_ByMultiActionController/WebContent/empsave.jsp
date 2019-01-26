<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<pre>
<h3>Employee Save Form</h3>
<form action="./empsave.ds" >
Name:<input type="text" name="name"/><br>
Email:<input type="text" name="email"/><br>
Address:<textarea rows="3" cols="20" name="address"></textarea><br>
<input type="submit" value="Save Recorde"/>

</form>
</pre>
<a href="empupdate.jsp">UPDATE</a>&thinsp;&thinsp;&thinsp;&thinsp;&thinsp;&thinsp;&thinsp;&thinsp;&thinsp;
<a href="emplogin.jsp">LOGIN</a>
</div>

</body>
</html>