package org.jegskrp;

import org.jegskrp.mockdata.JsonDataLoader;

import java.io.IOException;

public class StreamerDriver {
    public static void main(String[] args) throws IOException {
        System.out.println(JsonDataLoader.loaDataFormJsonFile());
    }
}
