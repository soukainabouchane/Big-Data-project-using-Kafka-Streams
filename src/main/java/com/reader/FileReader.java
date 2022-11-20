package com.reader;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.types.Data;

import java.io.File;
import java.util.Arrays;

public class FileReader {
    private static final FileReader customerFileReaderInstance = new FileReader();

    public static FileReader getInstance() {
        return customerFileReaderInstance;
    }

    String DATAFILE = "src/main/resources/data/data.json";

     private Data[] data;

    private FileReader() {
        final ObjectMapper mapper;
        mapper = new ObjectMapper();
        
        try {
            data = mapper.readValue(new File(DATAFILE), Data[].class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Data[] getData() {
        return data;
    }


}

