<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
  <title>Accounts Dashboard</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */
    .row.content {height: 1500px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height: auto;} 
    }
  </style>
</head>
<body>

<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav">
      <h4>Accounts</h4>
      <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#section1">Home</a></li>
        <li><a href="#section2">Link 1</a></li>
        <li><a href="#section3">Link 2</a></li>
        <li><a href="#section3">Link 3</a></li>
      </ul><br>
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search Blog..">
        <span class="input-group-btn">
          <button class="btn btn-default" type="button">
            <span class="glyphicon glyphicon-search"></span>
          </button>
        </span>
      </div>
    </div>

    <div class="col-sm-9">
      <h4><small>Accounts</small></h4>
      <hr>
          <div class="table-responsive">
	         <table class="table table-hover table-bordered" border="1" cellpadding="5">
	            <thead>
		            <tr>
		                <th>ID</th>
		                <th>Balance</th>
		                <th>Equity</th>
		                <th>Position</th>
		             </tr>
	            </thead>
	            <tbody>
	            <c:forEach var="account" items="${accounts}">
	                <tr>
	                    <td><c:out value="${account.accountId}" /></td>
	                    <td><c:out value="${account.balance}" /></td>
	                    <td><c:out value="${account.equity}" /></td>
	                    <td><c:out value="${account.positions}" /></td>
	                </tr>
	            </c:forEach>
	            </tbody>
	        </table>
    	</div>
  </div>
</div>

<footer class="container-fluid">
  <p>Footer Text</p>
</footer>
</body>
</html>

