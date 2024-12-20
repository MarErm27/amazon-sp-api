/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.models.finances.ListFinancialEventGroupsResponse;
import io.swagger.client.models.finances.ListFinancialEventsResponse;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.amazon.SellingPartnerAPIAA.LWAException;

/**
* API tests for DefaultApi
*/
@Ignore
public class DefaultApiTest {

private final DefaultApi api = new DefaultApi();


/**
* 
*
* Returns financial event groups for a given date range. It may take up to 48 hours for orders to appear in your financial events.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void listFinancialEventGroupsTest() throws ApiException, LWAException {
    Integer maxResultsPerPage = null;
    OffsetDateTime financialEventGroupStartedBefore = null;
    OffsetDateTime financialEventGroupStartedAfter = null;
    String nextToken = null;
ListFinancialEventGroupsResponse response = api.listFinancialEventGroups(maxResultsPerPage, financialEventGroupStartedBefore, financialEventGroupStartedAfter, nextToken);

// TODO: test validations
}

/**
* 
*
* Returns financial events for the specified data range. It may take up to 48 hours for orders to appear in your financial events. **Note:** in &#x60;ListFinancialEvents&#x60;, deferred events don&#39;t show up in responses until in they are released.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void listFinancialEventsTest() throws ApiException, LWAException {
    Integer maxResultsPerPage = null;
    OffsetDateTime postedAfter = null;
    OffsetDateTime postedBefore = null;
    String nextToken = null;
ListFinancialEventsResponse response = api.listFinancialEvents(maxResultsPerPage, postedAfter, postedBefore, nextToken);

// TODO: test validations
}

/**
* 
*
* Returns all financial events for the specified financial event group. It may take up to 48 hours for orders to appear in your financial events.  **Note:** This operation will only retrieve group&#39;s data for the past two years. If a request is submitted for data spanning more than two years, an empty response is returned.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void listFinancialEventsByGroupIdTest() throws ApiException, LWAException {
    String eventGroupId = null;
    Integer maxResultsPerPage = null;
    OffsetDateTime postedAfter = null;
    OffsetDateTime postedBefore = null;
    String nextToken = null;
ListFinancialEventsResponse response = api.listFinancialEventsByGroupId(eventGroupId, maxResultsPerPage, postedAfter, postedBefore, nextToken);

// TODO: test validations
}

/**
* 
*
* Returns all financial events for the specified order. It may take up to 48 hours for orders to appear in your financial events.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void listFinancialEventsByOrderIdTest() throws ApiException, LWAException {
    String orderId = null;
    Integer maxResultsPerPage = null;
    String nextToken = null;
ListFinancialEventsResponse response = api.listFinancialEventsByOrderId(orderId, maxResultsPerPage, nextToken);

// TODO: test validations
}

}