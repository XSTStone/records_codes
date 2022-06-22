package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author stone
 */

@RestController
@RequestMapping("/user")
public class HelloController {

    @RequestMapping("/helloDemo")
    public String hello() {
        InetAddress addr = null;
        String ip = null;
        String address = null;
        boolean getAddr = true;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            getAddr = false;
            ip = "127.0.0.1";
            address = "Stone";
        }
        if (getAddr) {
            ip=addr.getHostAddress();
            address=addr.getHostName();
        }
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(d);
        if (getAddr) {
            return "IP: " + ip + "\n Host name: " + address + "\n Time: " + dateNowStr;
        } else {
            return "Error when catching your host.\nDefault ip: " + ip + "\n Default host name: "
                    + address + "\n Time: " + dateNowStr;
        }
    }
}
