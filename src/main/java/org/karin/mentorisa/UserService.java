/*
package org.karin.mentorisa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserService(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public User getUser(int userId){
        return jdbcTemplate.queryForObject("select name, email, title from user where id = ?", new Object[]{1}, new RowMapper<User>()
        {
            @Override
            public User mapRow(ResultSet resultSet, int userId) throws SQLException {
                User user = new User();
                user.setId(userId);
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setTitle(resultSet.getString("title"));
                return user;

            }
        });
    }


}
*/
