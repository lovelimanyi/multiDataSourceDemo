package com.xianjinxia.multiDatasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages ="com.xianjinxia.multiDatasource.cms.dao", sqlSessionFactoryRef = "cmsSqlSessionFactory")
public class CMSDataSourceConfig {
    @Bean("cmsDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.cmsDataSource.druid")
    public DataSource cmsDataSource() {
        return new DruidDataSource();
    }

    @Bean(name = "cmsTransactionManager")
    @Primary
    public DataSourceTransactionManager cmsTransactionManager() {
        return new DataSourceTransactionManager(cmsDataSource());
    }

    @Bean(name = "cmsSqlSessionFactory")
    @Primary
    public SqlSessionFactory cmsSqlSessionFactory(@Qualifier("cmsDataSource") DataSource cmsDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(cmsDataSource);
//        sessionFactory.setTypeAliasesPackage(ConfigConstant.ALIASES_PACKAGE);
//        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
//                .getResources(ConfigConstant.MASTER_MAPPER_LOCATIONS));
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("mapping/cmsMapping/*.xml"));
        return sessionFactory.getObject();
    }

}
