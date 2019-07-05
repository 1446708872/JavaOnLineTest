<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!-- rankingList -->
<div class="record-head">
	<div class="rside-rh">
		&nbsp;&nbsp;&nbsp;&nbsp;<span class="name-rhr">XXX</span>您的总分是<span class="ttps">XX</span>
	</div>
	<div class="lside-rh">
		<form action="" method="post">
			<div class="input-rh">
				<input type="text" name="search" placeholder="搜索">
				<input type="submit" value="查询">
			</div>
		</form>
	</div>
	<hr>
</div>
<div class="table-cf">
	<table>
		<thead>
			<tr>
				<th>排名</th>
				<th>学号</th>
				<th>姓名</th>
				<th>成绩</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>1730405325</td>
				<td>张三</td>
				<td>100</td>
			</tr>
			<tr>
				<td>2</td>
				<td>1730405314</td>
				<td>李四</td>
				<td>93</td>
			</tr>
			<tr>
				<td>3</td>
				<td>1730405332</td>
				<td>王五</td>
				<td>89</td>
			</tr>
		</tbody>
	</table>
</div>