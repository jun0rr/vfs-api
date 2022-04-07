/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jun0rr.vfs.api.test;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import org.junit.jupiter.api.Test;

/**
 *
 * @author juno
 */
public class TestMongodb {
  
  @Test
  public void test_connect() {
    ConnectionString cs = new ConnectionString("mongodb://localhost:27017");
    Datastore datastore = Morphia.createDatastore(MongoClients.create(cs), "com-jun0rr-vfs-api");
    System.out.println(datastore);
  }
  
}
