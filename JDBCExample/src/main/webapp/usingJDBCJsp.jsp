<%@ page contentType="text/html;charset=EUC-KR" import="java.sql.*"%>
<%@ page import="java.util.*"%>
<%
// ����̹� �ε�
Class.forName("com.mysql.cj.jdbc.Driver");
// ����
Connection conn = null;
// �����ۼ� �� ó��
Statement stmt = null;
// ����� ����
ResultSet rs = null;

String id = "";
String pw = "";
String name = "";
int age = 0;
String email = "";

int counter = 0;
try {
	conn = DriverManager.getConnection("jdbc:mysql://localhost:8085/testdb", "root", "jiwoosky2!");//Connection ����
	stmt = conn.createStatement();//Statement ����
	rs = stmt.executeQuery("select * from users"); //���ǽ������� ResultSet�� ��´�.
%>
<html>
<head>
<title>JSP���� �����ͺ��̽� ����</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#FFFFCC">
	<h2>JSP ��ũ��Ʋ������ �����ͺ��̽� ���� ����</h2>
	<br />
	<h3>ȸ������</h3>
	<table bordercolor="#0000ff" border="1">
		<tr>
			<th>ID</th>
			<th>PW</th>
			<th>NAME</th>
			<th>AGE</th>
			<th>EMAIL</th>
		</tr>
		<%
		if (rs != null) {
			while (rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				age = rs.getInt("age");
				email = rs.getString("email");
		%>
		<tr>
			<td><%=id%></td>
			<td><%=pw%></td>
			<td><%=name%></td>
			<td><%=age%></td>
			<td><%=email%></td>
		</tr>
		<%
		counter++;
			} //end while
		} //end if
		%>
	</table>
	<br /> total records :<%=counter%>
	<%
	} catch (SQLException sqlException) {
	System.out.println("sql exception : " + sqlException.getMessage());
	} catch (Exception exception) {
	System.out.println("exception");
	} finally {
	if (rs != null)
		try {
			rs.close();
		} catch (SQLException ex) {}
	if (stmt != null)
		try {
			stmt.close();
		} catch (SQLException ex) {}
	if (conn != null)
		try {
			conn.close();
		} catch (Exception ex) {}
	}
	%>
	</body>
</html>