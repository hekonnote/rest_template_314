package tsoy.sergey.task314_rest_template.urlsApi;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import tsoy.sergey.task314_rest_template.models.User;

import java.util.Arrays;

public class DeleteUsers {
    public String deleteUser(RestTemplate rt, String urlPOST, String idSession, Long userId) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("Cookie", idSession);
        HttpEntity<User> entity = new HttpEntity<>(headers);

        return rt.exchange(urlPOST + "/" + userId, HttpMethod.DELETE, entity, String.class).getBody();
    }
}
