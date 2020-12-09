<%@include file="header.jsp"%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<div class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1 class="m-0">Shopping</h1>
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container-fluid -->
	</div>
	<!-- /.content-header -->


	<!-- Main content -->
	<section class="content">
		<div class="container-fluid">
			<div class="row">
				<div class="col-12">
					<!-- Custom Tabs -->
					<div class="card">
						<div class="card-header d-flex p-0">
							<ul class="nav nav-pills ml-auto p-2">
								<li class="nav-item"><a class="nav-link "	href="payToMerchantInStore">
								<i class="fas fa-store-alt"></i> In Store Purchase</a></li>
								
								<li class="nav-item"><a class="nav-link " href="payToMerchantOnline">
								<i class="fab fa-shopify"></i> Online Purchase</a></li>
								
								<li class="nav-item"><a class="nav-link active" href="payToMerchantPurchaseHistory">
								<i class="fas fa-history"></i> Purchase History</a></li>
							</ul>
						</div>
						<sql:query dataSource="${webappDataSource}" var="result">
 							SELECT * FROM paymentrapide.order where id=<%=useridheder%>;
						</sql:query>
						<!-- /.card-header -->
						<div class="card-body">
							<div class="tab-content ">
								<div class="tab-pane active">
									<table id="example1" class="table table-bordered table-striped">
										<thead>
											<tr>
												<th>Payment Date</th>
												<th>Order ID</th>
												<th>Category</th>
												<th>Detail</th>
												<th>Amount</th>
											</tr>
										</thead>
										<tbody>
											
											<c:forEach var="row" items="${result.rows}">
											<tr>
												<td>${row.order_date}</td>
												<td>${row.order_id}</td>
												<td>${row.order_type}</td>
												<td>${row.product_detail}</td>
												<td style="color: red">${row.order_amount}</td>
											</tr>
											
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
						<!-- /.tab-pane -->
					</div>
					<!-- /.tab-content -->
				</div>
				<!-- /.card-body -->
			</div>
			<!-- ./card -->
		</div>
		<!-- /.col -->
	</section>
</div>
<!-- /.row -->
<%@include file="footer.jsp"%>