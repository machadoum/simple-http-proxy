var sucess = function(data) {
	$("#status").append("Sucess.<br/>");
};	
var error = function(data) {
	$("#status").append("Error.<br/>");
}

function testDirect(){
	$.get($("#url").val(),sucess).fail(error);
};
function testProxy(){
	$.get("http://localhost:8080/proxy?url="+$("#url").val(),sucess).fail(error);
};
