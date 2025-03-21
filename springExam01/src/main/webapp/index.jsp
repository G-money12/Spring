<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>홈페이지</h2><br/>
<a href="pinsert">추가</a><br/>
<a href="plist">전체보기</a><br/>
</hr>
-------------------------------------------------------------------</br>
<a href="/address/insert">Address 추가하기</a></br>
<a href="/address/list">Address 전체보기</a></br>



<br/>
시작 <br/>
index.jsp -> HomeController.java -> insert.jsp , list.jsp ->  PersonService.java -> PersonDAO.java -> PersonMapper<br/>
응답 <br/>
db -> PersonDAO.java -> PersonService.java -> 응답 jsp


</body>
</html>