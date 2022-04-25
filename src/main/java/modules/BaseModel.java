package modules;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class BaseModel<T> {

    public String message;

    public abstract T getBody();

    public String toJsonString() {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();
        return gson.toJson(getBody());
    }
}