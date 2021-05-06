package com.tpirates.store.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages = {"com.tpirates.store.mybatis.mapper"}, sqlSessionFactoryRef="SqlSessionFactory", sqlSessionTemplateRef="sqlSessionTemplate")
public class MybatisConfig {

    @Bean(name="sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.tpirates.store.dto");
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mappers/*-mapper.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name="sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}

//@Configuration
//@MapperScan(basePackages= {"com.tpirates.store.mybatis.mapper"})
//public class MybatisConfig {
//        
//    //DataSource
//    @Bean
//    public DataSource dataSource(){
//        String driverClass = "org.h2.Driver";
//        String url = "jdbc:h2:tcp://localhost/~/test";
//        String username = "";
//        String password = "";
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(driverClass);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//		return dataSource;
//    }
//    
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception{
//        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//        sqlSessionFactory.setDataSource(dataSource());
//        return sqlSessionFactory.getObject();
//    }
//    
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() throws Exception{
//        return new SqlSessionTemplate(sqlSessionFactory());
//    }    
//}