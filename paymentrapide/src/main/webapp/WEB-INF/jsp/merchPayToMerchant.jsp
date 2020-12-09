<%@include file="headerMerchant.jsp"%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<div class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1 class="m-0">Purchase History</h1>
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
								<li class="nav-item"><a class="nav-link active"	href="#tab_1" data-toggle="tab">
								<i class="fas fa-store-alt"></i> In Store Purchase History</a></li>
								<li class="nav-item"><a class="nav-link" href="#tab_2" data-toggle="tab">
								<i class="fab fa-shopify"></i> Online Purchase History</a></li>
							</ul>
						</div>
						<!-- /.card-header -->
						<div class="card-body">
							<div class="tab-content">

								<div class="tab-pane" id="tab_2">
									<table id="example1" class="table table-bordered table-striped">
										<thead>
											<tr>
												<th>Purchase Date</th>
												<th>Buyer Name</th>
												<th>Order ID</th>
												<th>Transaction ID</th>
												<th>Amount</th>
												<th>Detail</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>01/06/2020</td>
												<td>Amit Bhatt</td>
												<td>2020081234</td>
												<td>2020121100001</td>
												<td>10000</td>
												<td>iPhone 12 pro</td>
											</tr>
											
										</tbody>
									</table>
								</div>

								<!-- ############################################################# -->

								<div class="tab-pane active" id="tab_1">
									<table id="example4" class="table table-bordered table-striped">
										<thead>
											<tr>
												<th>Purchase Date</th>
												<th>Buyer Name</th>
												<th>Order ID</th>
												<th>Transaction ID</th>
												<th>Amount</th>
												<th>Detail</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>01/08/2020</td>
												<td>Pavan Komavar</td>
												<td>2020081234</td>
												<td>2020121100004</td>
												<td>6000</td>
												<td>Redmi note 9 Pro</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>


						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
<%@include file="footer.jsp"%>