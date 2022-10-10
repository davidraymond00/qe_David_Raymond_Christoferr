package starter.projects;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;

public class GetAllProject {

    private String url, token;
    public void setUrlAndInvalidToken(){
        url = "https://api.todoist.com/rest/v2/projects";
        token = "Bearer token";
    }

    public void requestGetAllProject(){
        given().header("Authorization", token);
        when().get(url);
    }

    public void validateStatusCode(){

    }

    public void validateForbiddenMessage(){

    }
}
