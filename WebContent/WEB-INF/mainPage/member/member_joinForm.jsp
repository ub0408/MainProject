<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*"%>
    

<%@include file="/top.jsp"%>

<div align="center">
  <table border="0" width="40%" >
    <form name="f" action="memberInsert.mainPage" method="post">
     <tr bgcolor="yellow" >
      <td align="center" width="10%">
       <font color="navy" size="2">아이디</font>
      </td>
      <td align="center" width="15%">
       <input type="text" name="id" maxlengh="12" size="20">
      </td>
  
    <td width="15%" align="center">
     <a><font color="navy" size="2">중복체크</font></a>
    </td>
  </tr>
  <tr bgcolor="yellow" >
  <td align="center" width="10%">
  <font color="navy" size="2">비밀번호</font>
  </td>
  <td align="center" width="15%">
  <input type="password" name="passwd" maxlength="8" size="20">
  </td>
  <td align="center" width="15%" >
  <a><font color="navy" size="2">비밀번호 확인</font></a>
 </td>
  </tr>
  <tr bgcolor="yellow">
  <td width="10%" align="center" ><font color="navy" size="2">이름</font></td>
  <td  width="15%" colspan="2">
  &nbsp;&nbsp;<input type="text" name="name" maxlength="10" size="15">
  </td>
  </tr> 
  <tr bgcolor="yellow">
  <td align="center"  width="10%">
    <font color="navy" size="2">닉네임</font>
  </td>
  <td width="15%" colspan="2">
   &nbsp;&nbsp;<input type="text" name="nickname" maxlength="7" size="15">
  </td>
  </tr>
  <tr bgcolor="yellow">
  <td align ="center" width="10%"><font color="navy" size="2">생년월일</font></td>
  <td align="center" width="20%" colspan="2">
  <select name="year">
   <%
   for(int i=2016; i>=1950; i--){
   %>
   <option value="<%=i %>"><%=i %></option>
   <%} %>
  </select>
  <input type="text" name="month" maxlength="2" size="4">월
  <input type="text" name="date" maxlengh="2" size="4">일
  </td>
  </tr>
  <tr bgcolor="yellow">
  <td align="center" width="15%"><font color="navy" size="2">이메일</font></td>
  <td width="15%" colspan="2">
  &nbsp;&nbsp;&nbsp;<input type="text" name="email1" maxlength="15" size="15">&nbsp;&nbsp;@
  <select name="email2">
   <%
   ArrayList<String> list = new ArrayList();   
   list.add("naver.com");
   list.add("nate.com");
   list.add("hanmail.net");
   list.add("google.com");
  
   for(int i=0; i<list.size(); i++){
	 
   %>
   <option value="<%=list.get(i)%>"><%=list.get(i) %></option>
   <%} %>
    </select> 
  </td>
  </tr>
  <tr bgcolor="yellow">
  <td align="center" width="10%">
   <font color="navy" size="2"> 전화번호</font>
  </td>
   <td colspan="2">
     &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="pho1" maxlength="3" size="4">-
     <input type="text" name="pho2" maxlength="4" size="4">-
     <input type="text" name="pho3" maxlength="4" size="4">
   </td>
  </tr>
  <tr bgcolor="yellow">
  <td align="center" width="10%">
  <font color="navy" size="2">주 출몰지역</font>
  </td>
  <td width="15%"  colspan="2">
  &nbsp;&nbsp;&nbsp;<input type="text" name="fva" maxlength="15" size="15">
  </td>
  </tr>
  <tr bgcolor="yellow">
  <td align="center" colspan="3">
   <input type="submit" value="회원가입">
    <input type="reset" value="재작성">
  </td>
  </tr>
  </form>
 </table>
</div>

<%@include file="../../../bottom.jsp"%>
