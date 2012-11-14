<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/global.css')}"/>
</head>
<body>

<html:errors/>

<s:form>

<p>新規作成</p>
<table class="tablebase" border="1px">
	<tr>
		<td class="tablehead"> 釣行日 </td>
		<td>
		    <html:text property="date" size="12"/>
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> ポイント（釣り場） </td>
		<td>
		    <html:text property="point" size="60"/>
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 当日天気 </td>
		<td>
		    <html:text property="todayWeather" size="10"/>
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 前日天気 </td>
		<td>
		    <html:text property="prevWeather" size="10"/>
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 当日気温 </td>
		<td>
		    <html:text property="todayTemp" size="10"/>
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 前日気温 </td>
		<td>
		    <html:text property="prevTemp" size="10"/>
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 水温 </td>
		<td>
		    <html:text property="waterTemp" size="10"/>
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 魚種コード </td>
		<td>
		    <html:text property="fishCode" size="10"/>
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 魚種名 </td>
		<td>
		    <html:text property="fishName" size="30"/>
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 匹数 </td>
		<td>
		    <html:text property="fishCount" size="10"/>
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 使用タックル </td>
		<td>
		    <html:text property="tackle" size="60"/>
		</td>	
	</tr>
	<tr>
		<td class="tablehead"> 備考 </td>
		<td>
		    <html:text property="remark" size="60"/>
		</td>	
	</tr>

</table>
<br></br>
<input type="submit" name="insert" value="登録" class="button"/>
</s:form>
<br/><br/>

<s:link href="/fishingData/">戻る</s:link>

</body>
</html>