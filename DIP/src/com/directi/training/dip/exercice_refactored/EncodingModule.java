package com.directi.training.dip.exercice_refactored;

import java.io.*;
import java.net.URL;
import java.util.Base64;

public class EncodingModule {
    private final IDataReader dataReader;
    private final IDataWriter dataWriter;
    private final Base64Encoder base64Encoder;
    private final IDatabase db;

    public EncodingModule(IDataReader dataReader, IDataWriter dataWriter, Base64Encoder base64Encoder, IDatabase db) {
        this.dataReader = dataReader;
        this.dataWriter = dataWriter;
        this.base64Encoder = base64Encoder;
        this.db = db;
    }

    public void encode() throws IOException {
        String data = dataReader.readData();
        String encodedData = base64Encoder.encode(data);
        dataWriter.writeData(encodedData);
        db.write(encodedData);
    }

}

