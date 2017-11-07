/**
 * 
 */

// Utilidad para crear namespaces.
	function namespace(namespaceString, parent) {
		var parts = namespaceString.split('.'), currentPart = '';
		if (!parent) {
			parent = window;
		}

		for (var i = 0, length = parts.length; i < length; i++) {
			currentPart = parts[i];
			parent[currentPart] = parent[currentPart] || {};
			parent = parent[currentPart];
		}

		return parent;
	}


/****************************************************************************
* AJAX   queda pendiente el uso de esta function
/****************************************************************************/
/*
namespace('org.okis.Utils').doAjax = function(url, data, success, error, contentJson){
	
	var contentType = "application/x-www-form-urlencoded";

	if (true) {
		data = JSON.stringify(data);
		contentType = "application/json";
	}

	$.ajax({
		"type" : "POST",
		"url" : url,
		"dataType" : "json",
		"data" : data,
		"contentType" : contentType,
		"success" : function(json) {
			if (!json.success) {
			
			} else {
				success(json.data);
			}

		},
		"error" : function(xhr, textStatus, errorThrown) {
			error();
		}
	});
};*/
