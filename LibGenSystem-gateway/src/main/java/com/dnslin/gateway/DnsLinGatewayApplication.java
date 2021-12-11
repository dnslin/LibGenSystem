package com.dnslin.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DnsLinGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DnsLinGatewayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ  \n"
                +"______            _     _       _____       _                           \n" +
                "|  _  \\          | |   (_)     |  __ \\     | |                          \n" +
                "| | | |_ __  ___ | |    _ _ __ | |  \\/ __ _| |_ _____      ____ _ _   _ \n" +
                "| | | | '_ \\/ __|| |   | | '_ \\| | __ / _` | __/ _ \\ \\ /\\ / / _` | | | |\n" +
                "| |/ /| | | \\__ \\| |___| | | | | |_\\ \\ (_| | ||  __/\\ V  V / (_| | |_| |\n" +
                "|___/ |_| |_|___/\\_____/_|_| |_|\\____/\\__,_|\\__\\___| \\_/\\_/ \\__,_|\\__, |\n" +
                "                                                                   __/ |\n" +
                "                                                                  |___/ ");
    }
}
