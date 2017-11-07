/**
 * 
 */

	$(document).ready(function() {	


		/* de la forma siguiente se consigue una llamada json    con el metodo post a un servicio
		se puede hacer de esta dos formas para contruir el json  por que finalmente al pasar el stringify   
		lo convertira en json*/
		
		$("#searchButton").click(function(){
			
			var url = "http://localhost:8082/restCFX/services/rest/confirming/obtenerListadoAnticipos";
			var regDetalle = {};
			regDetalle["nif"] = "05965903A";
			regDetalle["nombre"] = "Jose Perez";
			regDetalle["descripcion"] = "Gerente";
			regDetalle["tipoNif"] = "NIE"; 
			/*  var regDetalle = {"nif":"05965903A","nombre":"Jose Perez","descripcion":"Gerente","tipoNif":"NIE"}; */
		
			if (true) {
		data = JSON.stringify(regDetalle);
		contentType = "application/json";
	}
			
			$.ajax({
				type : "POST",
				url : url,
				dataType : "json",
				data : data,
				contentType : contentType,
				success : function(json) {
					if (json) {
						
						$("#bookISBN").html(json.nif);
						$("#bookTitle").html(json.descripcion);
						$("#bookPrice").html(json.nombre);
					} else {
						$("#bookISBN").html("-");
						$("#bookTitle").html("-");
						$("#bookPrice").html("-");
						
					}

				},
				"error" : function(xhr, textStatus, errorThrown) {
					var errorMessage = exception || xhr.statusText;
					alert("error : " + errorMessage); 
				}
			});
		
		
		});
		
		
		
		/* 		de la forma siguiente se consigue una llamada json    con el metodo post a un servicio
		se puede hacer de esta dos formas para contruir el json  por que finalmente al pasar el stringify   
		lo convertira en json  */
		
		
		$("#llamaController").click(function(){
			
			var url = "http://localhost:8082/restCFX/remoting/obtenerListado";
			/* var regDetalle = {};
			regDetalle["nif"] = "05965903A";
			regDetalle["nombre"] = "Jose Perez";
			regDetalle["descripcion"] = "Gerente";
			regDetalle["tipoNif"] = "NIE";  */
			 var regDetalle = {"nif":"05965903A","nombre":"Jose Perez","descripcion":"Gerente","tipoNif":"NIE"};
		
			if (true) {
		data = JSON.stringify(regDetalle);
		contentType = "application/json";
	}
			
			$.ajax({
				type : "POST",
				url : url,
				dataType : "json",
				data : data,
				contentType : contentType,
				success : function(json) {
					if (json) {
						
						$("#bookISBN").html(json.nif);
						$("#bookTitle").html(json.descripcion);
						$("#bookPrice").html(json.nombre);
					} else {
						$("#bookISBN").html("-");
						$("#bookTitle").html("-");
						$("#bookPrice").html("-");
						
					}

				},
				"error" : function(xhr, textStatus, errorThrown) {
					var errorMessage = exception || xhr.statusText;
					alert("error : " + errorMessage); 
				}
			});
		
		
		});
		
		
		
		// lanza la llamada a la consulta de cuentas
		
$("#searchCuentas").click(function(){
	
	
	var cuentas ={};
			
			var url = "http://localhost:8082/restCFX/services/rest/confirming/obtenerCuentas";
			
			var numCuenta = $("#numCuenta").val();
			var titular = $("#titular").val();
	
			 var regDetalle = {"cuenta":{"numero":numCuenta,"titular":titular}};
		
			if (true) {
		data = JSON.stringify(regDetalle);
		contentType = "application/json";
	}
			
			$.ajax({
				type : "POST",
				url : url,
				dataType : "json",
				data : data,
				contentType : contentType,
				success : function(json) {
					if (json) {
						
						cuentas = json.cuentascorrientes;
						
						$.each(cuentas, function(i, item){
							
							$("#totalCuentas").append('el numero de cuenta es :' + item.numero + 'el titular de la cuenta es: '+ item.titular );
						
						});
			
					} else {
						
						
					}

				},
				"error" : function(xhr, textStatus, errorThrown) {
					var errorMessage = exception || xhr.statusText;
					alert("error : " + errorMessage); 
				}
			});
		
		
		});	


//lanza la llamada a la consulta de oficinas

$("#searchOficinas").click(function(){	
	
	var oficina ={};
	$("#oficinas").empty();
	        var url = "http://localhost:8082/restCFX/services/rest/confirming/obtenerCuentas";
			var url = "http://localhost:8082/restCFX/services/rest/confirming/obtenerOficinas";
			
			var codPostal = $("#codpostal").val();
			var direccion = $("#direccion").val();
			var numero = $("#numero").val();
	
			 var regDetalle = {"numero":numero,"direccion":direccion,"codPostal":codPostal}
		
			if (true) {
		data = JSON.stringify(regDetalle);
		contentType = "application/json";
	}
			
			$.ajax({
				type : "POST",
				url : url,
				dataType : "json",
				data : data,
				contentType : contentType,
				success : function(json) {
					if (json) {
						
						oficina = json.oficinas;
						
						$.each(oficina, function(i, item){
							
							$("#oficinas").append('el codpostal es :' + item.codPostal );
						
						});
			
					} else {
						
						
					}

				},
				"error" : function(xhr, textStatus, errorThrown) {
					var errorMessage = exception || xhr.statusText;
					alert("error : " + errorMessage); 
				}
			});
		
		
		});		




//lanza la llamada a otro proyecto  y llama a Account



$("#searchAccount").click(function(){		
	
	
	        var url = "http://localhost:8082/SpringWebService01/endpoints";
			
var data = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:acc="http://com/company/webservices/accountservice">'+
   '<soapenv:Header/>'+
   '<soapenv:Body>'+
      '<acc:AccountDetailsRequest>'+
         '<acc:accountNumber>'+'1'+'</acc:accountNumber>'+
      '</acc:AccountDetailsRequest>'+
   '</soapenv:Body>'+
'</soapenv:Envelope>';		
		
			
			$.ajax({
				type : "POST",
				url : url,
				dataType : "text/xml",
				data : data,
				
				success : function(dato) {
					if (dato) {
						
					
					$(dato).find('AccountDetails').each(function(){
						
						var AccountName = $(this).find("AccountName").text();
						alert(AccountName);
						
					});
					
			
					} else {
						
						
					}

				},
				"error" : function(xhr, textStatus, errorThrown) {
					var errorMessage = exception || xhr.statusText;
					alert("error : " + errorMessage); 
				}
			});
		
		
		});		















	
	});

	

	



