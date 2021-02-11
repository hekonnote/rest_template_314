package tsoy.sergey.task314_rest_template.urlsApi;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class GetUsers {

    public String getUsersList(RestTemplate rt, String urlGET) {
        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));// работает
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<String>(headers);

        HttpEntity<String> response = rt.exchange(urlGET, HttpMethod.GET, entity, String.class);
        HttpHeaders responseHeaders = response.getHeaders();
        String set_cookie = responseHeaders.getFirst(responseHeaders.SET_COOKIE);

        String[] strings = set_cookie.split("; ");
        Arrays.stream(strings).forEach(System.out::println);
        String idSessionFromCookie = strings[0].trim();

        System.out.println("Response: " + response.toString());
        System.out.println("Response body: " + response.getBody());
//        response.getHeaders().get("Set-Cookie").stream().forEach(System.out::println);
        System.out.println("Set-Cookie: " + set_cookie);
        System.out.println("***** FINISH *****");

        return idSessionFromCookie;
    }
}