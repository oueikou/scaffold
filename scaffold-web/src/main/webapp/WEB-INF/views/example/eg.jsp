<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>example</title>
<script type="text/javascript" src="/js/common/jquery-3.0.0.min.js" ></script>
<script type="text/javascript" src="/js/common/layer-v2.4/layer/layer.js" ></script>
<script type="text/javascript">
function test(){
	layer.alert('${model.name }');
// 	layer.alert('${pageContext.request.contextPath}');
}

</script>
</head>
<body>
参数 ：
<input type="text" value="${model.name }" >
<input type="button" value="测试" onclick="test()">
</body>
</html>