<#import "parts/common.ftl" as c>

<@c.page>

<h4 class="text-center">Podium positions</h4>

<#if firstPlace??>
<div id="positions_list" style="height: 10em" class="d-flex justify-content-center align-items-end my-3">
  <div class="p-2 bg-secondary w-25 h-75 text-center">${secondPlace}</div>
  <div class="p-2 bg-warning w-25 h-100 text-center">${firstPlace}</div>
  <div class="p-2 bg-light w-25 h-50 text-center">${thridPlace}</div>
</div>
</#if>

<form action="/calculate" method="post">
  <button class="btn btn-primary btn-block" type="submit">Calculate podium position</button>
</form>

</@c.page>