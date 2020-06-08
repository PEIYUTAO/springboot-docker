package com.jjgszl.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class DockerFile {
    @GetMapping("/k8s")
    public String docker() {
        InetAddress inetAddress = null;
        try {
             inetAddress = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        if (inetAddress == null) {
            return null;
        }
        return inetAddress.getHostName() + "----" + inetAddress.getHostAddress();
    }
}
