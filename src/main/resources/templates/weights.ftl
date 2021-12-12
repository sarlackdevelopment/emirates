<#import "parts/common.ftl" as c>

<@c.page>
<h4 class="text-center">Coefficents (weights) of disciplines</h4>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Discipline \ weight</th>
      <th scope="col">a</th>
      <th scope="col">b</th>
      <th scope="col">c</th>
    </tr>
  </thead>
  <tbody>
    <#list disciplines as discipline>
      <tr>
        <td>${discipline}</td>
        <#list weights as weight>
          <#if weight.discipline.equals(discipline)>
            <td>${weight.weightA}</td>
            <td>${weight.weightB}</td>
            <td>${weight.weightC}</td>
          </#if>
        </#list>
      </tr>
    </#list>
  </tbody>
</table>
</@c.page>