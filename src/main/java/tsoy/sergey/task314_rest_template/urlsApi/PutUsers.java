package tsoy.sergey.task314_rest_template.urlsApi;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import tsoy.sergey.task314_rest_template.models.User;

import java.util.Arrays;

public class PutUsers {
    public String updateUser(RestTemplate rt, String urlPOST, User updatedUser, String idSession) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("Cookie", idSession);
        HttpEntity<User> entity = new HttpEntity<>(updatedUser, headers);

        return rt.exchange(urlPOST, HttpMethod.PUT, entity, String.class).getBody();
    }
}
