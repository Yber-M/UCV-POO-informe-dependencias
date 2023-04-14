package services;

import lombok.Getter;
import lombok.Setter;

public class ApiResponse {

    @Getter
    @Setter
    private String message;

    @Getter
    @Setter
    private Object[] body;

    public <T> T convert() {
        return (T) body;
    }
}
