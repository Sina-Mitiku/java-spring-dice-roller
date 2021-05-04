<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="num" value="${requestScope.num}" scope="request" />
<c:set var="guessResult" value="${requestScope.guessResult}" scope="request" />


<h1>Dice Roller</h1>
<p>You rolled a <c:out value="${num}" /></p>
<c:choose>
  <c:when test = "${guessResult == 'YOU GUESSED THE NUMBER'}" >
    <p><strong><c:out value="${guessResult}" /></strong></p>
  </c:when>
  <c:otherwise>
<p><c:out value="${guessResult}" /></p>
  </c:otherwise>
 </c:choose>


