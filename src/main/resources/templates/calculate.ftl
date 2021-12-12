<#import "parts/common.ftl" as c>

<@c.page>

<h4 class="text-center">Flight number</h4>

<#if price??>
    <h6 class="text-center">The price is: ${price}</h6>
<#else>
    <form action="/calculatePrice" method="post">
        <div class="form-floating mb-3">
            <input type="text" class="form-control" name="flightNumber" value=${flightNumber} id="price" placeholder="flightNumber">
        </div>
        <button class="btn btn-primary btn-block" type="submit">Calculate price</button>
    </form>
</#if>

</@c.page>