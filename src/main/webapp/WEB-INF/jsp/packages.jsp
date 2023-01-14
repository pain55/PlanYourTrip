<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/resources/fragments/header.jspf"%>

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="/resources/css/style.css">
</head>

<body>
	<section class="header">
		<%@ include file="/resources/fragments/navigation.jspf"%>

		<div class="container">
			<table class="table">

				<thead>
					<tr>
						<th>Package Name</th>
						<th>Location</th>
						<th>Description</th>
						<th>Duration</th>
						<th>Price</th>
						<th></th>
					</tr>

				</thead>
				<tbody>
					<c:forEach items="${packagesList }" var="item">
						<tr>
							<td>${ item.packageName }</td>
							<td>${ item.packageLocation }</td>
							<td>${ item.packageDesc }</td>
							<td>${ item.packageDuration }</td>
							<td>${ item.price }</td>
							<td><a href="/success"><button class="btn btn-success">Book</button></a></td>
						</tr>

					</c:forEach>
				</tbody>

			</table>
		</div>
	</section>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>