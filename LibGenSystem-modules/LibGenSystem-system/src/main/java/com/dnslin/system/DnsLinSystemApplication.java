package com.dnslin.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.dnslin.common.security.annotation.EnableCustomConfig;
import com.dnslin.common.security.annotation.EnableRyFeignClients;
import com.dnslin.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author DnsLin
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class DnsLinSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DnsLinSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n"
                +"______            _     _       _____           _                 \n" +
                "|  _  \\          | |   (_)     /  ___|         | |                \n" +
                "| | | |_ __  ___ | |    _ _ __ \\ `--. _   _ ___| |_ ___ _ __ ___  \n" +
                "| | | | '_ \\/ __|| |   | | '_ \\ `--. \\ | | / __| __/ _ \\ '_ ` _ \\ \n" +
                "| |/ /| | | \\__ \\| |___| | | | /\\__/ / |_| \\__ \\ ||  __/ | | | | |\n" +
                "|___/ |_| |_|___/\\_____/_|_| |_\\____/ \\__, |___/\\__\\___|_| |_| |_|\n" +
                "                                       __/ |                      \n" +
                "                                      |___/                       ");
    }
}
