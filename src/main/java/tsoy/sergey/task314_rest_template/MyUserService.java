//package tsoy.sergey.task314_rest_template;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//public class MyUserService {
//
//        String urlGET =  "http://91.241.64.178:7081/api/users";
//        String urlPOST = "http://91.241.64.178:7081/api/users";
//        String urlPUT =  "http://91.241.64.178:7081/api/users";
//        String urlDEL =  "http://91.241.64.178:7081/api/users"; // + id
//
//        RestTemplate rt = new RestTemplate();
//
//        // --------- Получаем всех юзеров через getForEntity(urlGET): ----------- Способ 1
//        ResponseEntity<String> forEntity = rt.getForEntity(urlGET, String.class);
//        System.out.println("Response: " + forEntity);
//        String cookie = forEntity.getHeaders().getFirst(HttpHeaders.SET_COOKIE);
//        System.out.println("Set-Cookie: " + cookie);
////        //----------------- Получаем всех юзеров через exchange(urlGET): --------------------  Способ 2
////        HttpEntity<String> response = rt.exchange(url, HttpMethod.GET, null, String.class);
////        HttpHeaders headers = response.getHeaders();
////        String set_cookie = headers.getFirst(headers.SET_COOKIE);
////
////        System.out.println("Response: " + response.toString());
////        System.out.println("Set-Cookie: " + set_cookie);
////        System.out.println("***** FINISH way 2 *****");
//
//        // --------- Добавляем юзера через getForEntity(): ----------- Способ 1
//
//
//
//
//    }
//
