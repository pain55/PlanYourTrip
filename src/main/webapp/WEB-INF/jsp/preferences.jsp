<%@ include file="/resources/fragments/header.jspf"%>
<link rel="stylesheet" href="/resources/css/style.css">
<link rel="stylesheet" href="/resources/css/preferences_styles.css">
</head>

<body>
	<section class="header">
		<%@ include file="/resources/fragments/navigation.jspf"%>
		<div class="form">
			<h3>Select your preferences</h3>
			<form method="post">

				<span>Location :</span><input type="text" name="packageLocation" />
				<br> <input class="hero-btn" type="submit" />
			</form>
		</div>
	</section>
</body>

</html>