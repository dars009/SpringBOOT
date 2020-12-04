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
							<h3 class="card-title p-3" style="color: green">
								Total Limit : 50000 <i class="fas fa-rupee-sign"></i>
							</h3>
							<h3 class="card-title p-3">|</h3>
							<h3 class="card-title p-3" style="color: red">
								Available Limit : 20000 <i class="fas fa-rupee-sign"></i>
							</h3>
							<ul class="nav nav-pills ml-auto p-2">
								<li class="nav-item"><a class="nav-link active"
									href="#tab_1" data-toggle="tab">Current Statement</a></li>
								<li class="nav-item"><a class="nav-link" href="#tab_2"
									data-toggle="tab">Balance History</a></li>
								<li class="nav-item"><a class="nav-link" href="#tab_3"
									data-toggle="tab">Payment</a></li>

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
												<td><button type="button"
														class="btn btn-xs btn-success btn-flat">Pay</button></td>
											</tr>
										</tbody>
									</table>
								</div>
								<!-- /.tab-pane -->

								<div class="tab-pane" id="tab_2">
									<table id="example1" class="table table-bordered table-striped">
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
												<td style="color: green">0</td>
											</tr>
											<tr>
												<td>01/05/2020</td>
												<td>2020081234</td>
												<td>iPhone 12 mini(6/1)</td>
												<td style="color: red">0</td>
												<td style="color: green">5000</td>
											</tr>
											<tr>
												<td>01/06/2020</td>
												<td>2020081234</td>
												<td>iPhone 12 mini(6/2)</td>
												<td style="color: red">0</td>
												<td style="color: green">5000</td>
											</tr>
											<tr>
												<td>01/07/2020</td>
												<td>2020081234</td>
												<td>iPhone 12 mini(6/3)</td>
												<td style="color: red">0</td>
												<td style="color: green">5000</td>
											</tr>
											<tr>
												<td>01/08/2020</td>
												<td>2020081234</td>
												<td>iPhone 12 mini(6/4)</td>
												<td style="color: red">0</td>
												<td style="color: green">5000</td>
											</tr>
											<tr>
												<td>01/09/2020</td>
												<td>2020081234</td>
												<td>iPhone 12 mini(6/5)</td>
												<td style="color: red">0</td>
												<td style="color: green">5000</td>
											</tr>
											<tr>
												<td>01/10/2020</td>
												<td>2020081234</td>
												<td>iPhone 12 mini(6/6)</td>
												<td style="color: red">0</td>
												<td style="color: green">5000</td>
											</tr>
											<tr>
												<td>01/10/2020</td>
												<td>2020081234</td>
												<td>iPhone 12 mini</td>
												<td style="color: red">0</td>
												<td style="color: green">30000</td>
											</tr>
										</tbody>
									</table>
								</div>
								<!-- /.tab-pane -->
								<div class="tab-pane" id="tab_3">
									<div class="row col-md-12">
										<!-- ############################################################# -->
										<div class="col-md-6">
										<div class="card card-warning">
										<div class="card-header">
												<h3 class="card-title">Payment Due</h3>
										</div>	
										<div class="card-body">
															<div class="bg-white shadow-sm pt-4 pl-2 pr-2 pb-2">
																<!-- Credit card form tabs -->
																<ul role="tablist" class="nav bg-light nav-pills rounded nav-fill mb-3">
																	<li class="nav-item"> <a data-toggle="pill" href="#credit-card" class="nav-link active "> <i class="fas fa-credit-card mr-2"></i> Credit Debit Card </a> </li>
																	<li class="nav-item"> <a data-toggle="pill" href="#paypal" class="nav-link "> <i class="fab fa-paypal mr-2"></i> Paypal </a> </li>
																	<li class="nav-item"> <a data-toggle="pill" href="#net-banking" class="nav-link "> <i class="fas fa-mobile-alt mr-2"></i> Net Banking </a> </li>
																</ul>
															</div> <!-- End -->
															<!-- Credit card form content -->
															<div class="tab-content">
																<!-- credit card info-->
																<div id="credit-card" class="tab-pane fade show active pt-3">
																	<form role="form">
																		<div class="form-group"> <label for="username">
																				<h6>Card Owner</h6>
																			</label> <input type="text" name="username" placeholder="Card Owner Name" required class="form-control "> </div>
																		<div class="form-group"> <label for="cardNumber">
																				<h6>Card number</h6>
																			</label>
																			<div class="input-group"> <input type="text" name="cardNumber" placeholder="Valid card number" class="form-control " required>
																				<div class="input-group-append"> <span class="input-group-text text-muted"> <i class="fab fa-cc-visa mx-1"></i> <i class="fab fa-cc-mastercard mx-1"></i> <i class="fab fa-cc-amex mx-1"></i> </span> </div>
																			</div>
																		</div>
																		<div class="row">
																			<div class="col-sm-8">
																				<div class="form-group"> <label><span class="hidden-xs">
																							<h6>Expiration Date</h6>
																						</span></label>
																					<div class="input-group"> <input type="number" placeholder="MM" name="" class="form-control" required> <input type="number" placeholder="YY" name="" class="form-control" required> </div>
																				</div>
																			</div>
																			<div class="col-sm-4">
																				<div class="form-group mb-4"> <label data-toggle="tooltip" title="Three digit CV code on the back of your card">
																						<h6>CVV <i class="fa fa-question-circle d-inline"></i></h6>
																					</label> <input type="text" required class="form-control"> </div>
																			</div>
																		</div>
																		<div class="card-footer"> <button type="button" class="subscribe btn btn-primary btn-block shadow-sm"> Confirm Payment </button>
																	</form>
																</div>
															</div> <!-- End -->
															<!-- Paypal info -->
															<div id="paypal" class="tab-pane fade pt-3">
																<h6 class="pb-2">Select your paypal account type</h6>
																<div class="form-group "> <label class="radio-inline"> <input type="radio" name="optradio" checked> Domestic </label> <label class="radio-inline"> <input type="radio" name="optradio" class="ml-5">International </label></div>
																<p> <button type="button" class="btn btn-primary "><i class="fab fa-paypal mr-2"></i> Log into my Paypal</button> </p>
																<p class="text-muted"> Note: After clicking on the button, you will be directed to a secure gateway for payment. After completing the payment process, you will be redirected back to the website to view details of your order. </p>
															</div> <!-- End -->
															<!-- bank transfer info -->
															<div id="net-banking" class="tab-pane fade pt-3">
																<div class="form-group "> <label for="Select Your Bank">
																		<h6>Select your Bank</h6>
																	</label> <select class="form-control" id="ccmonth">
																		<option value="" selected disabled>--Please select your Bank--</option>
																		<option>ICICI</option>
																		<option>HDFC</option>
																		<option>Citi</option>
																		<option>SBI</option>
																		<option>Federal Bank</option>
																	</select> </div>
																<div class="form-group">
																	<p> <button type="button" class="btn btn-primary "><i class="fas fa-mobile-alt mr-2"></i> Proceed Pyment</button> </p>
																</div>
																<p class="text-muted">Note: After clicking on the button, you will be directed to a secure gateway for payment. After completing the payment process, you will be redirected back to the website to view details of your order. </p>
															</div> <!-- End -->
															<!-- End -->
												</div>
												<!-- /.card-header -->
											</div>
											<!-- /.card -->
											</div>
										</div>

										<!-- ############################################################# -->

										<div class="col-sm-6">
											<div class="card card-success">
												<div class="card-header">
													<h3 class="card-title">Pay to Merchant</h3>
													
													
													
													
													
												</div>
												<!-- /.card-header -->
												<div class="card-body">
													<div class="row">
													
													
													
													</div>
												</div>
												<!-- /.card-body -->
											</div>
											<!-- /.card -->
										</div>
										
										<!-- ############################################################# -->
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
			</div>
			<!-- /.row -->

		</div>
		<!-- /.content-wrapper -->
		<script>
			function myFunction() {
				var cc = document.getElementById("credit-card");
  				var dc =  document.getElementById("debitcard");
  				var nb =  document.getElementById("net-banking");
  				
  				cc.style.visibility = "hidden";
				dc.style.visibility = "hidden";
				nb.style.visibility = "hidden";	
  				
				if (cc.style.visibility === "hidden") {
					cc.style.visibility = 'visible';
					
 				} else if(dc.style.visibility === "hidden") {
 					dc.style.visibility = 'visible';
 					
  				}else if(nb.style.visibility === "hidden"){
  					nb.style.visibility = 'visible';
  				}
}
</script>
		<%@include file="footer.jsp"%>