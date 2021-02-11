package tsoy.sergey.task314_rest_template.urlsApi;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import tsoy.sergey.task314_rest_template.models.User;

public class PostUsers {

    public String addUser(RestTemplate rt, String urlPOST, User user, String idSession) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON)); // так тоже работает
        headers.add("Cookie", idSession);
        HttpEntity<User> entity = new HttpEntity<>(user, headers);

        return rt.exchange(urlPOST, HttpMethod.POST, entity, String.class).getBody();
    }
}
