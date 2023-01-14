<%@ include file="/resources/fragments/header.jspf"%>
<link rel="stylesheet" href="/resources/css/style.css">
<link rel="stylesheet" href="/resources/css/preferences_styles.css">
</head>

<body>
	<section class="header">
		<%@ include file="/resources/fragments/navigation.jspf"%>
		<div class="form">
				${error }
			<h3>Login Form</h3>
			<form method="post">

				<span>Username :</span><input type="text" name="username" />
				<span>password :</span><input type="password" name="password" />
				
				<br> <input class="hero-btn" type="submit" />
			</form>
		</div>
	</section>
</body>

</html>