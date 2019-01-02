/*
       Copyright 2017 IBM Corp All Rights Reserved

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.ibm.hybrid.cloud.sample.stocktrader.messaging.client;

import com.ibm.hybrid.cloud.sample.stocktrader.messaging.json.NotificationResult;
import com.ibm.hybrid.cloud.sample.stocktrader.messaging.json.LoyaltyChange;
import javax.enterprise.context.Dependent;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationPath("/")
@Path("/")
@Dependent
@RegisterRestClient
/** mpRestClient "remote" interface for the notification microservice */
public interface NotificationClient {
	@POST
	@Path("/")
	@Produces("application/json")
	public NotificationResult notify(@HeaderParam("Authorization") String jwt, @HeaderParam("owner") String owner, LoyaltyChange LoyaltyChange);
}
