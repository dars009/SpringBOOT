<%@include file="header.jsp"%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<div class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1 class="m-0">Payment</h1>
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
							<h3 class="card-title p-3" style="color: green">Total Limit
								: 50000 <i class="fas fa-rupee-sign"></i></h3>
							<h3 class="card-title p-3">|</h3>
							<h3 class="card-title p-3" style="color: red">Available
								Limit : 20000 <i class="fas fa-rupee-sign"></i></h3>
							<ul class="nav nav-pills ml-auto p-2">
								<li class="nav-item"><a class="nav-link active"
									href="#tab_1" data-toggle="tab">EMI</a></li>
								<li class="nav-item"><a class="nav-link" href="#tab_2"
									data-toggle="tab">Balance History</a></li>
								<li class="nav-item"><a class="nav-link" href="#tab_3"
									data-toggle="tab">TSYS Pay Latter Wallet</a></li>
							</ul>
						</div>
						<!-- /.card-header -->
						<div class="card-body">
							<div class="tab-content">
								<div class="tab-pane active" id="tab_1">
											<table id="example2" class="table table-bordered table-striped">
												<thead>
													<tr>
														<th>Due Date</th>
														<th>Order ID</th>
														<th>Oeder Detail</th>
														<th>Amount</th>
														<th>Action</th>
													</tr>
												</thead>
												<tbody>
													<tr>
														<td>31/12/2020</td>
														<td>2020121234</td>
														<td>iPhone 12 mini(1/6)</td>
														<td>5000</td>
														<td><button type="button" class="btn btn-xs btn-success btn-flat">Pay</button></td>
													</tr>
												</tbody>
												<tfoot>
													<tr>
														<th>Due Date</th>
														<th>Order ID</th>
														<th>Oeder Detail</th>
														<th>Amount</th>
														<th>Action</th>
													</tr>
												</tfoot>
											</table>
								</div>
								<!-- /.tab-pane -->
								
								
								<div class="tab-pane" id="tab_2">

									
											<table id="example1"
												class="table table-bordered table-striped">
												<thead>
													<tr>
														<th>Payment Date</th>
														<th>Order ID</th>
														<th>Order Detail</th>
														<th>Debit</th>
														<th>Credit</th>
													</tr>
												</thead>
												<tbody>
													<tr>
														<td>01/04/2020</td>
														<td>2020081234</td>
														<td>iPhone 12 mini</td>
														<td style="color: red">30000</td>
														<td style="color:green">0</td>
													</tr>
													<tr>
														<td>01/05/2020</td>
														<td>2020081234</td>
														<td>iPhone 12 mini(6/1)</td>
														<td style="color: red">0</td>
														<td style="color:green">5000</td>
													</tr>
													<tr>
														<td>01/06/2020</td>
														<td>2020081234</td>
														<td>iPhone 12 mini(6/2)</td>
														<td style="color: red">0</td>
														<td style="color:green">5000</td>
													</tr>
													<tr>
														<td>01/07/2020</td>
														<td>2020081234</td>
														<td>iPhone 12 mini(6/3)</td>
														<td style="color: red">0</td>
														<td style="color:green">5000</td>
													</tr>
													<tr>
														<td>01/08/2020</td>
														<td>2020081234</td>
														<td>iPhone 12 mini(6/4)</td>
														<td style="color: red">0</td>
														<td style="color:green">5000</td>
													</tr>
													<tr>
														<td>01/09/2020</td>
														<td>2020081234</td>
														<td>iPhone 12 mini(6/5)</td>
														<td style="color: red">0</td>
														<td style="color:green">5000</td>
													</tr>
													<tr>
														<td>01/10/2020</td>
														<td>2020081234</td>
														<td>iPhone 12 mini(6/6)</td>
														<td style="color: red">0</td>
														<td style="color:green">5000</td>
													</tr>
													<tr>
														<td>01/10/2020</td>
														<td>2020081234</td>
														<td>iPhone 12 mini</td>
														<td style="color: red">0</td>
														<td style="color:green">30000</td>
													</tr>
												</tbody>
												<tfoot>
													<tr>
														<th>Payment Date</th>
														<th>Order ID</th>
														<th>Order Detail</th>
														<th>Debit</th>
														<th>Credit</th>
													</tr>
												</tfoot>
											</table>
										







								</div>
								<!-- /.tab-pane -->
								<div class="tab-pane" id="tab_3">Lorem Ipsum is simply
									dummy text of the printing and typesetting industry. Lorem
									Ipsum has been the industry's standard dummy text ever since
									the 1500s, when an unknown printer took a galley of type and
									scrambled it to make a type specimen book. It has survived not
									only five centuries, but also the leap into electronic
									typesetting, remaining essentially unchanged. It was
									popularised in the 1960s with the release of Letraset sheets
									containing Lorem Ipsum passages, and more recently with desktop
									publishing software like Aldus PageMaker including versions of
									Lorem Ipsum.</div>
								<!-- /.tab-pane -->
							</div>
							<!-- /.tab-content -->
						</div>
						<!-- /.card-body -->
					</div>
					<!-- ./card -->
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->

		</div>
</div>
<!-- /.content-wrapper -->

<%@include file="footer.jsp"%>


