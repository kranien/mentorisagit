/*package org.karin.mentorisa;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MySqlConfig {

    @Bean
    @ConfigurationProperties("prefix=mentorisa.database")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
*/