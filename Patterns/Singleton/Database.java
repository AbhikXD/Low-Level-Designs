package Patterns.Singleton;

import javax.xml.crypto.Data;
//        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `tempObj` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
public class Database {
    private static volatile Database obj;
    public String value;

    private Database(String DBID){
        value  = DBID;
    }
    public void getQueryResult(String sql){
        System.out.println("Query "+sql + " ran in DB: "+ value);
    }

    public static Database getInstance(String dbId){
        Database tempObj = obj;
        if(tempObj!= null){
            return tempObj;
        }
        synchronized(Database.class){
            if(obj == null){
                obj = new Database(dbId);
            }
            return obj;
        }
    }
}
