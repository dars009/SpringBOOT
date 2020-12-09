<%@include file="header.jsp"%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<div class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1 class="m-0">Shopping</h1>
					<div style="color: green" class="col-sm-12 text-center">${Message}</div>
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
								
								<li class="nav-item"><a class="nav-link active" href="payToMerchantOnline">
								<i class="fab fa-shopify"></i> Online Purchase</a></li>
								
								<li class="nav-item"><a class="nav-link" href="payToMerchantPurchaseHistory">
								<i class="fas fa-history"></i> Purchase History</a></li>
							</ul>
						</div>
						<!-- /.card-header -->
						<div class="card-body">
							<div class="tab-content ">
								<!-- ############################################################# -->
								<div class="tab-pane active">
									<div class="row col-md-12">
										<div class="col-sm-3"></div>
										<div class="col-sm-6">
											<div class="card card-info">
												<div class="card-header">
													<h3 class="card-title">Pay to Merchant</h3>
												</div>
												
												
			<%if (session.getAttribute("Message") != null) {%>
			<br>
			<div class="container-fluid">
				<div class="alert alert-success">
					<strong> Message: </strong> ${Message}
				</div>
			</div>
			<%}%>
			<%session.removeAttribute("Message");%>
												
												
												<!-- /.card-header -->
												<div class="card-body">
													<form action="payToMerchantOnline" method="post">
														<input type="hidden" value=<%=useridheder%> name="userid">
														<input type="hidden" value="Online Purchase" name="purchaseType">
														<div class="row">
															<div class="col-sm-12">
																<!-- select -->
																<div class="form-group">
																	<label>Select Merchant to Pay</label> 
																	<select	class="form-control" name="merchant">
																		<option>Unicorn Apple Store</option>
																		<option>Croma</option>
																		<option>Ford</option>
																		<option>Lekme Saloon</option>
																		<option>Lifestyle</option>
																		<option>Max Fashion</option>
																		<option>Westside</option>
																		<option>Firstcry</option>
																	</select>
																</div>
																<div class="form-group" >
																	<label>Select Produce / Services</label> 
																	<select	class="form-control" name="product_detail">
																		<option>iPhone 12 Pro Max 128 GB</option>
																		<option>iPhone 11 Pro Max 128 GB</option>
																		<option>iPhone 12 Mini 265 GB</option>
																	</select>
																</div>
																<div class="form-group">
																	<label>Select EMI Tenure</label> 
																	<select	class="form-control" name="emi_tenure">
																		<option selected value="0">No EMI</option>
																		<option value="3">03 Month</option>
																		<option value="6">06 Month</option>
																		<option value="9">09 Month</option>
																	</select>
																</div>
																<div class="form-group">
																	<label>Total Amount</label> 
																	<input type="text" value="15000" name="amount" class="form-control" readonly>
																</div>
																<center>
																	<div class="col-md-4">
																		<button type="submit" class="btn btn-block btn-info btn-flat">Pay</button>
																	</div>
																</center>
															</div>
														</div>
												</div>
												</form>
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
		</section>
</div>
<!-- /.row -->
<%@include file="footer.jsp"%>