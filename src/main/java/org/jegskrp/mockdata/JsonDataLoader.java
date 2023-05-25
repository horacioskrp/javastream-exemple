package org.jegskrp.mockdata;

import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import org.jegskrp.users.User;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class JsonDataLoader {

    public static List<User> loaDataFormJsonFile() throws IOException{
        InputStream inputStream = Resources.getResource("user.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listDataType = new TypeToken<ArrayList<User>>(){}.getType();

        return new Gson().fromJson(json, listDataType);
    }
}
