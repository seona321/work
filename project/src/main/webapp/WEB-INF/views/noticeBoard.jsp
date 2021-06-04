<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시글 목록</h2>
<a href="noticeWrite.do"><input type="button" value="글쓰기"></a>
<table border="1" width="550">
<thead>	
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>이름</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
</thead>

<tfoot>
	<tr>
		<td colspan="5" align="center">페이징 할거임</td>
	</tr>
</tfoot>

<!-- 
<tbody>
	<c:if test="${empty list}">
		<tr>
			<td colspan="5" align="center">
			등록된 게시물이 없습니다.
			</td>
		</tr>
	</c:if>
	
	<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.idx}</td>
			<td><a href="${dto.idx}">${dto.title}</td>
			<td>${dto.writer}</td>
			<td>${dto.writedate}</td>
			<td>${dto.viewCnt}</td>
		</tr>
	</c:forEach>
</tbody>
 -->
</table>
</body>
</html>