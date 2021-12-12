<#import "parts/common.ftl" as c>

<@c.page>
  <h4 class="text-center">Flight info</h4>
  <form action="/flightInfo" method="post">
    <div class="form-floating mb-3">
        <input type="date" class="form-control" name="flightDate" id="flightDate" placeholder="flight date">
    </div>
    <div class="form-floating mb-3">
        <input type="text" class="form-control" name="departureCode" id="departureCode" placeholder="departure code">
    </div>
    <div class="form-floating mb-3">
        <input type="text" class="form-control" name="arrivalCode" id="arrivalCode" placeholder="arrival code">
    </div>
    <button class="btn btn-primary btn-block" type="submit">Get flight info</button>
  </form>
</@c.page>