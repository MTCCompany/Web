<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/global.css')}"/>
</head>
<body>

<html:errors/>
<p>■詳細</p>
<table class="tablebase" border="1px">
	<tr>
		<td class="tablehead"> 釣行日 </td>
		<td class="tablecolshow">
			${f:h(date)}
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> ポイント（釣り場） </td>
		<td class="tablecolshow">
			${f:h(point)}
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 当日天気</td>
		<td class="tablecolshow">
			${f:h(todayWeather)}
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 前日天気 </td>
		<td class="tablecolshow">
			${f:h(prevWeather)}
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 当日気温 </td>
		<td class="tablecolshow">
			${f:h(todayTemp)}
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 前日気温 </td>
		<td class="tablecolshow">
			${f:h(prevTemp)}
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 水温 </td>
		<td class="tablecolshow">
			${f:h(waterTemp)}
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 魚種コード </td>
		<td class="tablecolshow">
			${f:h(fishCode)}
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 魚種名 </td>
		<td class="tablecolshow">
			${f:h(fishName)}
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 匹数 </td>
		<td class="tablecolshow">
			${f:h(fishCount)}
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 使用タックル </td>
		<td class="tablecolshow">
			${f:h(tackle)}
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 備考 </td>
		<td class="tablecolshow">
			${f:h(remark)}
		</td>	
	</tr>

</table>
<br></br>
<input type="submit" name="edit" value="編集" class="button"/>


<br/><br/>
<s:link href="/fishingData/">戻る</s:link>
</body>
</html>