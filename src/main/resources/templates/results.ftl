<#import "parts/common.ftl" as c>

<@c.page>
  <h4 class="text-center">Results of competitions</h4>
  <table class="table">
    <thead>
      <tr>
        <th scope="col">Discipline \ Competitor</th>
        <#list results as key, value>
          <th scope="col">${key.name}</th>
        </#list>
      </tr>
    </thead>
    <tbody>
      <#list disciplines as discipline>
        <tr>
          <td>${discipline}</td>
          <#list results as key, value>
            <#list value as result>
              <#if result.name.equals(discipline)>
                <td>${result.result}</td>
              </#if>
            </#list>
          </#list>
        </tr>
      </#list>
    </tbody>
  </table>
</@c.page>