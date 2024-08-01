<%@page import="kosa.dao.BoardDao2"%>
<%@page import="kosa.model.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="board" class="kosa.model.Board" scope="request" />
<jsp:setProperty property="*" name="board" />

<%
    BoardDao2 dao = BoardDao2.getInstance();
    int re = dao.modiffy(board); // DAO를 사용한 수정 메소드 호출

    if (re == 1) {
        response.sendRedirect("detail.jsp?seq=" + board.getSeq()); // 수정 성공 시 상세 페이지로 리다이렉트
    } else {
        out.println("수정 실패"); // 수정 실패 시 메시지 출력
    }
%>
