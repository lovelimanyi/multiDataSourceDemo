package com.xianjinxia.multiDatasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages ="com.xianjinxia.multiDatasource.lmy.dao", sqlSessionFactoryRef = "lmySqlSessionFactory")
public class LmyDataSourceConfig {
    @Bean("lmyDataSource")
//    @Primary
    @ConfigurationProperties(prefix = "spring.lmyDataSource.druid")
    public DataSource lmyDataSource() {
        return new DruidDataSource();
    }

    @Bean(name = "lmyTransactionManager")
//    @Primary
    public DataSourceTransactionManager lmyTransactionManager() {
        return new DataSourceTransactionManager(lmyDataSource());
    }

    @Bean(name = "lmySqlSessionFactory")
//    @Primary
    public SqlSessionFactory lmySqlSessionFactory(@Qualifier("lmyDataSource") DataSource lmyDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(lmyDataSource);
//        sessionFactory.setTypeAliasesPackage(ConfigConstant.ALIASES_PACKAGE);
//        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
//                .getResources(ConfigConstant.MASTER_MAPPER_LOCATIONS));
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("mapping/lmyMapping/*.xml"));
        return sessionFactory.getObject();
    }

}
