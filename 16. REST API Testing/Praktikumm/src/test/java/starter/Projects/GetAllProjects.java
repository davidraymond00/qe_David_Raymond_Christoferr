package starter.Projects;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GetAllProjects {

    private String url, token;

    public void setUrlAndInvalidToken(){
        url = "https://api.todoist.com/rest/v2/projects";
        token = "Bearer token";
    }

    public void setUrlAndValidToken(){
        url = "https://api.todoist.com/rest/v2/projects";
        token = "Bearer 972391397438adsadsa789";
    }

    public void requestGetAllProject(){
        given().header("Authorization",token)
                .header("Content-Type","application/json");
        when().get(url);
    }

    public void validateStatusCode(){
        then().statusCode(401);
    }

    public void ValidateStatus200(){
        then().statusCode(200);
    }

    public void validateForbiddenMessage(){
        then().body(equalTo("Forbidden"));
    }

    public void validateAllMyProject(){

    }


}
