package utility;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectDB {

    private final Logger LOG = LoggerFactory.getLogger(ConnectDB.class);

    Properties prop = Utility.loadProperties();

    public static MongoDatabase mongoDatabase = null;

    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;


    public Connection connectToMySql() {
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        try {
            Class.forName(driverClass);
            connect = DriverManager.getConnection(url,userName,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOG.info("Database is connected");
        return connect;
    }
    public MongoDatabase connectToMongoDB() {
        String databaseName = prop.getProperty("mongodb.db.name");
        MongoClient mongoClient = new MongoClient();
        mongoDatabase = mongoClient.getDatabase(databaseName);
        LOG.info("Database Connected");
        return mongoDatabase;
    }
    public List<String> readMysqlDataBaseColumn(String tableName, String columnName){
        List<String> data = new ArrayList<String>();

        try {
            connectToMySql();
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(resultSet, columnName);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            close();
        }
        return data;
    }
    private void close() {
        try{
            if(resultSet != null){
                resultSet.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connect != null){
                connect.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException {
        List<String> dataList = new ArrayList<String>();
        while(resultSet.next()){
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }

    public List<String> directDatabaseQueryExecute(String passQuery,String dataColumn){
        List<String> data = new ArrayList<String>();
        try {
            connectToMySql();
            statement = connect.createStatement();
            resultSet = statement.executeQuery(passQuery);
            data = getResultSetData(resultSet, dataColumn);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            close();
        }
        return data;
    }

//    public static void main(String[] args) {
//        ConnectDB cdb = new ConnectDB();
//        cdb.connectToMySql();
//    }
}
