package com.dnslin.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.dnslin.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 * 
 * @author DnsLin
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DnsLinAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DnsLinAuthApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ  \n"
                +"______            _     _        ___        _   _\n" +
                "|  _  \\          | |   (_)      / _ \\      | | | |\n" +
                "| | | |_ __  ___ | |    _ _ __ / /_\\ \\_   _| |_| |__\n" +
                "| | | | '_ \\/ __|| |   | | '_ \\|  _  | | | | __| '_ \\\n" +
                "| |/ /| | | \\__ \\| |___| | | | | | | | |_| | |_| | | |\n" +
                "|___/ |_| |_|___/\\_____/_|_| |_\\_| |_/\\__,_|\\__|_| |_|");
    }
}
