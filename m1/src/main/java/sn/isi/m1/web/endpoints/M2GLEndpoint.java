package sn.isi.m1.web.endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class M2GLEndpoint {
    @PayloadRoot(localPart = "infoPort",namespace = "http://ws.groupeisi.com")
    public @ResponsePayload GetInfoResponse getInfoRequest(GetInfoResponse requeste){
        GetInfoResponse response = new GetInfoResponse();
        response.setOuput("Bonjour M2GL"+ requeste.getInfo())
    return response;
    }
}
