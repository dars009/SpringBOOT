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
								<li class="nav-item"><a class="nav-link active"	href="payToMerchantInStore">
								<i class="fas fa-store-alt"></i> In Store Purchase</a></li>
								
								<li class="nav-item"><a class="nav-link" href="payToMerchantOnline">
								<i class="fab fa-shopify"></i> Online Purchase</a></li>
								
								<li class="nav-item"><a class="nav-link" href="payToMerchantPurchaseHistory">
								<i class="fas fa-history"></i> Purchase History</a></li>
							</ul>
						</div>
						<!-- /.card-header -->
						<div class="card-body">
							<div class="tab-content">
								<!-- ############################################################# -->
								<!-- /.tab-pane -->
								<div class="tab-pane active">
									<div class="row col-md-12">
										<div class="col-sm-3"></div>
										<div class="col-sm-6">
											<div class="card card-success">
												<div class="card-header">
													<h3 class="card-title">Pay to Merchant</h3>
												</div>
												
			<%
				if (session.getAttribute("Message") != null) {
			%>
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
													<form action="payToMerchant" method="post">
														<input type="hidden" value=<%=useridheder%> name="userid">
														<input type="hidden" value="In Store Purchase" name="purchaseType">
														<div class="row">
															<div class="col-sm-12">
																<!-- select -->
																<div class="form-group">
																	<label>Select Merchant to Pay</label> 
																	<select	class="form-control" name="merchant">
																		<option>Reliance</option>
																		<option>Croma</option>
																		<option>Ford</option>
																		<option>Lekme Saloon</option>
																		<option>Lifestyle</option>
																		<option>Max Fashion</option>
																		<option>Westside</option>
																		<option>Firstcry</option>
																	</select>
																</div>
																<div class="form-group">
																	<label>Enter Amount</label>
																	 <input type="text"	class="form-control" name="amount" placeholder="Enter Amount Eg. 500">
																</div>
																<div class="form-group">
																	<label>Whats this for?</label> <input type="text" name="product_detail"
																		class="form-control" placeholder="For Eg. Medicine">
																</div>
																<center>
																	<div class="col-md-4">
																		<button type="submit" class="btn btn-block btn-success btn-flat"> <!-- data-toggle="modal" data-target="#modal-default" -->Pay</button>
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
		
		
	<!-- <div class="modal fade" id="modal-default">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h4 class="modal-title">Confirmation</h4>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
              <p>Payment Success..!</p>
              <p>Txn Ref # 55855000110</p>
            </div>
            <div class="modal-footer justify-content-between">
              <button type="button" class="btn btn-primary" data-dismiss="modal">Ok</button>
            </div>
          </div>
          /.modal-content
        </div>
        /.modal-dialog
      </div>
      /.modal -->
		
</div>
<!-- /.row -->

<%@include file="footer.jsp"%>