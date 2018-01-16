package src.com.dao;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDao {
    public static String DRIVER = null;
    public static String URL = null;
    public static String USERNAME = null;
    public static String USERPASSWORD = null;

    static {

        init();

    }

    private static void init() {
        BufferedReader br = null;
        try {
            File file = new File("mysql.properties");
            br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file)));
            String s = null;
            while ((s = br.readLine()) != null) {
                s = s.trim(); //去掉空格
                // s.charAt(0) !='#'  去掉注释
                if (s.length() > 0 && s.charAt(0) != '#') {
                    String[] strings = s.split("=");
                    if ("DRIVER".equals(strings[0].toUpperCase())) {
                        DRIVER = strings[1];
                    }
                    if ("URL".equals(strings[0].toUpperCase())) {
                        URL = strings[1];
                    }
                    if ("USERNAME".equals(strings[0].toUpperCase())) {
                        USERNAME = strings[1];
                    }
                    if ("USERPASSWORD".equals(strings[0].toUpperCase())) {
                        USERPASSWORD = strings[1];
                    }
                }
            }
            Class.forName(DRIVER);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //   连接数据库   工厂模式
    public Connection getconn() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * @param sql
     * @param params
     * @return boolean
     */
    public boolean update(String sql, List<Object> params) {
        Connection connection = null;
        PreparedStatement statement = null;
        int num = 0;
        try {
            connection = getconn();
            statement = connection.prepareStatement(sql);
            if (params != null) {
                for (int i = 0; i < params.size(); i++) {
                    statement.setObject(i + 1, params.get(i));
                }
                num = statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(null,statement, connection);
        }
        if (num > 0) {
            return true;
        }
        return false;
    }

    /**
     * @param sql
     * @param params
     * @return Integer
     */
    public Integer updateReturnId(String sql, List<Object> params) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        List<Integer> idlist = new ArrayList<>();
        int num = 0;
        try {
            connection = getconn();
            statement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            if (params != null) {
                for (int i = 0; i < params.size(); i++) {
                    statement.setObject(i + 1, params.get(i));
                }

                rs = statement.getGeneratedKeys();
                num = statement.executeUpdate();
                if(rs != null){
                    while(rs.next()){
                        idlist.add(rs.getInt(1));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(null,statement, connection);
        }
        if (num > 0) {
            return 1;
        }
        return -1;
    }

    /**
     *
     * @param statement
     * @param connection
     *
     */
    public void close(ResultSet rs,Statement statement, Connection connection) {
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
