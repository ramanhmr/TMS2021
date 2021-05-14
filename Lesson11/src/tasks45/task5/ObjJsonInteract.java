package tasks45.task5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public final class ObjJsonInteract {
    private ObjJsonInteract() {
    }

    static void writeObjToJson(File file, Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(file, obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static <C> C readObjFormJson(File file, Class<C> objClass) {
        ObjectMapper objectMapper = new ObjectMapper();
        C result = null;
        try {
            result = objectMapper.readValue(file, objClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
