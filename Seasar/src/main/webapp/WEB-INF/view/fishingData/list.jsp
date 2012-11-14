<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/global.css')}"/>
<title>釣行結果一覧</title>
</head>
<body>

<html:errors/>

<p>■釣行結果一覧</p>
<table border="1" style="width: 1010px;">
<tr style="background-color:#87CEFA">
	<th style="width: 30px;">詳細</th>
	<th style="width: 30px;">編集</th>
	<th style="width: 30px;">削除</th>
	<th style="width: 50px;">釣行日</th>
	<th style="width: 150px;">ポイント（釣り場）</th>
	<th style="width: 40px;">当日天気</th>
	<th style="width: 40px;">当日気温</th>
	<th style="width: 40px;">水温</th>
	<th style="width: 100px;">魚種名</th>
	<th style="width: 50px;">匹数</th>
	<th style="width: 250px;">使用タックル</th>
	<th style="width: 200px;" >備考</th>
</tr>

<c:forEach var="e" varStatus="s" items="${fishingDataItems}">
	<tr style="background-color:${s.index %2 == 0 ? 'white' : 'lightcyan'}">
		<td><s:link href="show/${e.date}/${e.fishCode}"> show </s:link></td>
		<td><s:link href="edit/${e.date}/${e.fishCode}"> edit </s:link></td>
		<td><s:link onclick="return confirm('削除してもよろしいですか?');" href="delete/${e.date}/${e.fishCode}">delete</s:link></td>
		<td>
			${f:h(e.date)}
		</td>
		<td>
			${f:h(e.point)}
		</td>
		<td>
			${f:h(e.todayWeather)}
		</td>
		<td>
			${f:h(e.todayTemp)}
		</td>
		<td>
			${f:h(e.waterTemp)}
		</td>
		<td>
			${f:h(e.fishName)}
		</td>
		<td>
			${f:h(e.fishCount)}
		</td>
		<td>
			${f:h(e.tackle)}
		</td>
		<td>
			${f:h(e.remark)}
		</td>
	</tr>
</c:forEach>

</table>
<br></br>
<a class="create" href="create" style="button">[新規追加]</a>
<br/><br/>
<s:link href="/">戻る</s:link>
</body>
</html>