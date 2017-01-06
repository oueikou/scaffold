<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>example</title>
<script type="text/javascript" src="${domain}/js/common/jquery-3.0.0.min.js" ></script>
<script type="text/javascript" src="${domain}/js/common/layer-v2.4/layer/layer.js" ></script>
<script type="text/javascript">
function test(){
	layer.alert('${base}');
	layer.alert('${domain}');
}

</script>
</head>
<body>
参数 ：
<input type="text" value="${model.name }" >
<input type="button" value="测试" onclick="test()">
</body>
</html>