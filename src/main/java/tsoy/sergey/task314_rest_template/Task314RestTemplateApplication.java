package tsoy.sergey.task314_rest_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import tsoy.sergey.task314_rest_template.models.User;
import tsoy.sergey.task314_rest_template.urlsApi.DeleteUsers;
import tsoy.sergey.task314_rest_template.urlsApi.GetUsers;
import tsoy.sergey.task314_rest_template.urlsApi.PostUsers;
import tsoy.sergey.task314_rest_template.urlsApi.PutUsers;

@SpringBootApplication
public class Task314RestTemplateApplication {

    public static void main(String[] args) {

        SpringApplication.run(Task314RestTemplateApplication.class, args);

        final String url = "http://91.241.64.178:7081/api/users";

        RestTemplate rt = new RestTemplate();

        User jamesUser = new User();
        jamesUser.setId(3L);
        jamesUser.setName("James");
        jamesUser.setLastName("Brown");
        jamesUser.setAge((byte) 40);
        System.out.println(jamesUser);

        User thomasUser = new User();
        thomasUser.setId(3L);
        thomasUser.setName("Thomas");
        thomasUser.setLastName("Shelby");
        thomasUser.setAge((byte) 40);
        System.out.println(thomasUser);

        GetUsers getUsers = new GetUsers();
        String idSession = getUsers.getUsersList(rt, url);
        System.out.println("variable idSession in psvm: " + idSession);

        PostUsers postUsers = new PostUsers();
        String firstPart = postUsers.addUser(rt, url, jamesUser, idSession);
        System.out.println("First part of code: " + firstPart);

        PutUsers putUsers = new PutUsers();
        String secondPart = putUsers.updateUser(rt, url, thomasUser, idSession);
        System.out.println("Second part of code: " + secondPart);

        DeleteUsers deleteUsers = new DeleteUsers();
        String thirdPart = deleteUsers.deleteUser(rt, url, idSession, thomasUser.getId());
        System.out.println("Third part of code: " + thirdPart);

        String totalString = firstPart + secondPart + thirdPart;
        System.out.println(totalString);
    }
}
