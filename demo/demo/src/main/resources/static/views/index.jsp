
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/home/venkateswara/Desktop/venkat/resources/css/ext-all.css" />
<script type="text/javascript"
	src="/home/venkateswara/Desktop/venkat/resources/adapter/ext/ext-base.js"></script>
<script type="text/javascript"
	src="/home/venkateswara/Desktop/venkat/resources/ext-all.js"></script>
<!--        <link rel="stylesheet" type="text/css" href="scripts/menus/common/common.css" />-->
<script>
	Ext
			.onReady(function()

			{
				//var records = [];
				var store = new Ext.data.ArrayStore({
					fields : [ 'id', 'statess' ]
				});

				var store1 = new Ext.data.ArrayStore({
					fields : [ 'id1', 'name1' ]
				//data: records

				});

				// store.load();

				var simple = new Ext.form.FormPanel(
						{
							align : 'center',
							fileUpload : true,
							layout : 'form',
							isUpload : true,
							labelWidth : 79,
							fullscreen : true,
							enctype : 'multipart/form-data',
							renderTo : 'sri',
							frame : true,
							buttonAlign : 'center',
							standardSubmit : true,
							name : 'formname',
							url : 'NewServlet99',
							title : '<div style="text-align:center;">Registration Form</div>',
							bodyStyle : 'padding:5px 5px 0',
							id : 'form',
							items : [
									{
										xtype : 'textfield',
										id : 'FN',
										name : 'FNM',
										fieldLabel : 'FirstName <span style="color:red">*</span>',
										allowBlank : true
									},
									{
										xtype : 'textfield',
										id : 'MN',
										fieldLabel : 'MiddleName<span style="color:red">*</span>',
										allowBlank : true

									},
									{
										xtype : 'textfield',
										id : 'SN',
										fieldLabel : 'Surname<span style="color:red">*</span>',
										allowBlank : true
									},
									{
										xtype : 'numberfield',
										id : 'NF',
										fieldLabel : 'PhoneNo'

									},
									{
										xtype : 'combo',
										maxHeight : 500,
										listWidth : 200,
										fieldLabel : 'Choose Country<span style="color:red">*</span>',
										id : 'CountryId',
										emptyText : 'Select Country',
										triggerAction : 'all',
										anchor : '-4',
										store : [ 'India', 'USA', 'Australia',
												'UAE', 'JAPAN' ],
										listeners : {
											change : function() {
												Ext.Ajax
														.request({
															url : 'NewServlet1',
															method : 'post',
															params : {
																"country" : Ext
																		.getCmp(
																				"CountryId")
																		.getValue()
															},
															scope : this,
															success : function(
																	response) {
																// alert(response);

																var res = Ext
																		.decode(
																				response.responseText,
																				true);

																// var decodedString = Ext.decode(response);
																// console.log(decodedString);

																alert(res);
																//                                                            
																//                                                                if(res !== null &&  typeof (res) !==  'undefined')
																//                                                                {
																//                                                                      // alert("res");
																//                                                                    
																//            // loop through the data
																////                                                            Ext.each(res.data, function(obj){
																////                //add the records to the array
																////                                                         records.push({
																////                                                    // alert("copying");
																////                                                          id: obj.id,
																////                                                  name: obj.name
																////                                                });
																//                                                   });
																//update the store with the data that we got
																store
																		.loadData(res);

															},
															failure : function(
																	err) {
																Ext.MessageBox
																		.alert(
																				'Error occured during Login',
																				'Please try again!');
															}

														});

											}

										}

									},
									{
										xtype : 'combo',
										fieldLabel : 'Choose State<span style="color:red">*</span>',
										maxHeight : 500,
										store : store,
										listWidth : 200,
										dataIndex : 'StatesStore',
										anchor : '-4',
										id : 'States',
										queryMode : 'local',
										displayField : 'statess',
										displayFieldId : 'statess1',
										emptyText : 'Select State',
										triggerAction : 'all',
										valueField : 'id',
										listeners : {
											change : function() {
												Ext.Ajax
														.request({
															url : 'NewServlet2',
															method : 'post',
															params : {
																"State" : Ext
																		.getCmp(
																				"States")
																		.getRawValue()
															},
															scope : this,
															success : function(
																	response) {
																// alert(response);

																var res = Ext
																		.decode(
																				response.responseText,
																				true);

																// var decodedString = Ext.decode(response);
																// console.log(decodedString);

																alert(res);
																//                                                            
																//                                                                if(res !== null &&  typeof (res) !==  'undefined')
																//                                                                {
																//                                                                      // alert("res");
																//                                                                    
																//            // loop through the data
																////                                                            Ext.each(res.data, function(obj){
																////                //add the records to the array
																////                                                         records.push({
																////                                                    // alert("copying");
																////                                                          id: obj.id,
																////                                                  name: obj.name
																////                                                });
																//                                                   });
																//update the store with the data that we got
																store1
																		.loadData(res);
																//  alert(data);

																//  Ext.getCmp('state').store.loadData(data);

															},
															failure : function(
																	err) {
																Ext.MessageBox
																		.alert(
																				'Error occured during Login',
																				'Please try again!');
															}

														});

											}

										}

									},
									{
										xtype : 'combo',
										fieldLabel : 'Choose Region<span style="color:red">*</span>',
										anchor : '-6',
										id : 'region',
										displayField : 'name1',
										valueField : 'id1',
										mode : 'local',
										queryMode : 'local',
										typeAhead : false,
										forceSelection : true,
										enableKeyEvents : true,
										emptyText : 'Select Region',
										triggerAction : 'all',
										editable : true,
										allowBlank : false,
										selectOnFocus : true,
										minChars : 1,
										store : store1

									}, {
										xtype : 'datefield',
										fieldLabel : 'Date',
										id : 'DF'

									}, {
										xtype : 'timefield',
										id : 'TF',
										fieldLabel : 'Select Time',
										minValue : '8:00 AM',
										maxValue : '2:00PM',
										increment : 30,
										anchor : '100%'

									}, {
										xtype : 'textarea',
										fieldLabel : 'Address',
										id : 'Address',
										height : 100,
										width : 700,
										allowBlank : true

									}, {
										xtype : 'radiogroup',
										id : 'MS',
										fieldLabel : 'Martial Status',
										items : [ {
											boxLabel : 'Married',
											name : 'kk'
										}, {
											boxLabel : 'Unmarried',
											name : 'kk'

										} ]
									}, {
										xtype : 'checkboxgroup',
										id : 'LK',
										fieldLabel : 'Languages Known',
										items : [ {
											boxLabel : 'English'

										}, {
											boxLabel : 'Hindi'
										}, {
											boxLabel : 'Tamil'
										}, {
											boxLabel : 'Telugu'
										} ]
									}, {
										fieldLabel : 'Upload image',
										//  fileUpload : true,
										//  renderTo:'sri',     
										items : [ new Ext.form.TextField({
											id : "iconUpload",
											fieldLabel : 'Image',
											inputType : 'file',
											name : 'appIcon',
											//   enctype:"multipart/form-data",
											width : 500

										}) ]
									}

							],
							buttons : [ {
								text : 'Submit',
								handler : function() {

									//  alert("hello");

									Ext.getCmp('form').getForm().submit({
										url : 'NewServlet99',
										method : 'POST',
										type : 'PUT',
										scope : this,
										success : function(form, action)

										{

											alert("success");

											//var data = Ext.decode(action.response.responseText);
											alert("Success: " + data.msg);

										},
										failure : function(form, action) {
											alert("hiiifailure");
											//var data = Ext.decode(action.response.responseText);
											//alert("Failure: " + data.msg);
										}
									});
								}
							} ]

						});

				var myWin = new Ext.Window({
					id : 'myWin',
					title : '<div style="text-align:center;">GECE</div>',
					height : 600,
					width : 400,
					items : [ simple ]
				});

				myWin.show();

			});
</script>
</head>

<body>

	<div id="sri"></div>

</body>
</html>