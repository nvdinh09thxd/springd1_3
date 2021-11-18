<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<c:url value="/resources/blogs" var="contextPath" scope="application"></c:url>

<tiles:insertAttribute name="leftbar"></tiles:insertAttribute>
    <div class="container-fluid">
        <main class="tm-main">
            <!-- Search form -->
            <tiles:insertAttribute name="header"></tiles:insertAttribute>
             <tiles:insertAttribute name="body"></tiles:insertAttribute>
            <tiles:insertAttribute name="footer"></tiles:insertAttribute>