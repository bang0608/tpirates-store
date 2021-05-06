<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>점포등록</title>
</head>
<body>

	<h1>점포 추가</h1>

	<div class="col-md-12">
		<div class="col-md-4">
			<form>
				<div class="form-group">
					<label for="title">점포명</label> <input type="text"
						class="form-control" name="name" id="name" placeholder="점포명을 입력하세요">
				</div>
				<div class="form-group">
					<label for="author">대표자명</label> <input type="text"
						class="form-control" name="owner" id="owner" placeholder="대표자명을 입력하세요">
				</div>
				<div class="form-group">
					<label for="title">주소</label> <input type="text"
						class="form-control" name="address" id="address" placeholder="주소를 입력하세요">
				</div>
				<div class="form-group">
					<label for="author">전화번호</label> <input type="text"
						class="form-control" name="phone" id="phone" placeholder="전화번호를 입력하세요">
				</div>
				<div class="form-group">
					<label for="author">점포 설명</label> <input type="text"
						class="form-control" name="description" id="description" placeholder="점포 설명을 입력하세요">
				</div>
				<div class="form-group">
					<label for="author">우선순위</label>
					<select name="level" id="level" class="form-control">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select>
				</div>
			</form>
			<div class="form-group">
				<label for="author">영업 시간</label><br>
				<div class="business_time">
					Monday 
					<input type="time" value="13:00" class="form-control">
					<input type="time" value="23:00" class="form-control">
				</div>

				<div class="business_time">
					Tuesday
					<input type="time" value="13:00" class="form-control">
					<input type="time" value="23:00" class="form-control">
				</div>

				<div class="business_time">
					Wednesday
					<input type="time" value="09:00" class="form-control">
					<input type="time" value="18:00" class="form-control">
				</div>

				<div class="business_time">
					Thursday
					<input type="time" value="09:00" class="form-control">
					<input type="time" value="23:00" class="form-control">
				</div>

				<div class="business_time">
					Friday
					<input type="time" value="09:00" class="form-control">
					<input type="time" value="23:00" class="form-control">
				</div>
			</div>
			<a href="/" role="button" class="btn btn-secondary">취소</a>
			<button type="button" class="btn btn-primary" id="btn-save">등록</button>
		</div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script src="<c:url value='/resources/js/index.js'/>"></script>
</body>
</html>