package com.directi.training.dip.exercice_refactored;

import java.io.*;

public class EncodingModuleClient
{
        public static void main(String[] args) throws IOException {
        IDataReader fileDataReader = new FileDataReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IDataWriter fileDataWriter = new FileDataWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        Base64Encoder base64Encoder = new Base64Encoder();
        MyDatabase db = new MyDatabase();

        EncodingModule encodingModule = new EncodingModule(fileDataReader, fileDataWriter, base64Encoder, db);
        encodingModule.encode();

}}
