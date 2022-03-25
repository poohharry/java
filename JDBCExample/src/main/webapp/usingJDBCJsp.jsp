<%@ page contentType="text/html;charset=EUC-KR" import="java.sql.*"%>
<%@ page import="java.util.*"%>
<%
// 드라이버 로드
Class.forName("com.mysql.cj.jdbc.Driver");
// 접속
Connection conn = null;
// 쿼리작성 및 처리
Statement stmt = null;
// 결과값 저장
ResultSet rs = null;

String id = "";
String pw = "";
String name = "";
int age = 0;
String email = "";

int counter = 0;
try {
	conn = DriverManager.getConnection("jdbc:mysql://localhost:8085/testdb", "root", "jiwoosky2!");//Connection 생성
	stmt = conn.createStatement();//Statement 생성
	rs = stmt.executeQuery("select * from users"); //질의실행결과를 ResultSet에 담는다.
%>
<html>
<head>
<title>JSP에서 데이터베이스 연동</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#FFFFCC">
	<h2>JSP 스크립틀릿에서 데이터베이스 연동 예제</h2>
	<br />
	<h3>회원정보</h3>
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