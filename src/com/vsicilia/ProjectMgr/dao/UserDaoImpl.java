package com.vsicilia.ProjectMgr.dao;

import com.vsicilia.ProjectMgr.Dto.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Inject;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements  UserDao {

    private JdbcTemplate jdbcTemplate;

    @Inject
    public UserDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public static final String SQL_REGISTER_USER = "insert into users (username, password) values (?,?)";


    @Override
    public boolean registerUser(User user) {

        jdbcTemplate.update(SQL_REGISTER_USER, user.getEmail(), user.getPassword());

        return true;
    }



    private class UserMapper implements RowMapper<User>{

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {

            User user = new User(resultSet.getString("email"));

            return user;
        }
    }

}
