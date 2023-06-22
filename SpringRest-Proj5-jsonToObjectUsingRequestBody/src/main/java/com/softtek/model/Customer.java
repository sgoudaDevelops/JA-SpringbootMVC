package com.softtek.model;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
 private  Integer cno;
 private String cname;
 private String caddrs;
 private Float billAmnt;
}
